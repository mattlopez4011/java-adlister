import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

//    Constructor
    public  MySQLAdsDao(Config config){
        try {
//            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

//    all () Method from ads implement file
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>(); // Create empty arraylist

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads;");
            while (rs.next()){
//                translate the Resultset into an List<Ad>
//                Ad ad = new Ad(rs.getLong("id"),
//                        rs.getLong("user_id"),
//                        rs.getString("title"),
//                        rs.getString("description"));

                Ad ad = translateRStoAd(rs); // returns Ad object from result set
//                Add the new Ad into the List<Ad>
                ads.add(ad);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return ads; // returns the ads array list

    }

//    Translates the result set from the all() method
    private Ad translateRStoAd(ResultSet rs){
        try {
            return new Ad(rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    insert() method from ads implement file
    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();

            String sql = String.format("INSERT INTO ads (title, description, user_id) values('%s','%s',%d)",  ad.getTitle(), ad.getDescription(), ad.getUserId());

//            INSERT INTO quotes (author_first_name, author_last_name, content)
//            VALUES ('Douglas', 'Adams', 'I love deadlines. I love the whooshing noise they make as they go by.');

            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();

            rs.next();
            return rs.getLong(1);
//            if (rs.next()) {
//                return rs.getLong(1);
//            }


        } catch (SQLException e){
            e.printStackTrace();
        }

        return 0L;
    }
}
