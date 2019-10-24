import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class MYSQLAdsDao implements Ads{

    Connection connection;

    public  MYSQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM employees limit 5";
            ResultSet resultSet = stmt.executeQuery(sql);

            while(resultSet.next()){
                System.out.println("resultSet.getLong(emp_no) = " + resultSet.getLong("emp_no"));
                System.out.println("resultSet = " + resultSet.getString("first_name"));
                System.out.println("resultSet.getString(\"gender\") = " + resultSet.getString("gender"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<Ad>;

    public List<Ad> all(){
        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM ads limit 5";
            ResultSet resultSet = stmt.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
