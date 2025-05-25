package util;

import java.sql.*;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/travel_app";
        String user = "root";
        String password = "your_password"; // Replace with your MySQL password
        return DriverManager.getConnection(url, user, password);
    }
}
