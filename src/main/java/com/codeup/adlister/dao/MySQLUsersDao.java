package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM users where username = ?");
            stmt.setString(1, username); // Gives the ? placeholder a value ^
            ResultSet rs = stmt.executeQuery();

            return extractUser(rs); // return user
        } catch (SQLException e) {
//            e.printStackTrace();
            throw new RuntimeException("Error finding username.", e);
        }


    }

    @Override
    public Long insert(User user) {

        try {
            String insertQuery = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();

//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            System.out.println("rs = " + rs);

            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }


    }


    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }
}
