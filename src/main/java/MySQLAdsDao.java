import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

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

//    all () Method
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>(); // Create empty arraylist

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT  * FROM ads");
            while (rs.next()){
//                translate the Resultset into an List<Ad>
                Ad ad = new Ad(rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description"));
//                Add the new Ad into the List<Ad>
                ads.add(ad);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return ads; // returns the ads array list

    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();

            String sql = String.format("INSERT into ads (title, description) values('%s','%s')", ad.getTitle(), ad.getDescription());

            stmt.executeUpdate(sql);

        } catch (SQLException e){
            e.printStackTrace();
        }

        return 0L;
    }
}
