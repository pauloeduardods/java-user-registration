package com.userRegistration.Shared.Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = System.getenv("MYSQL_URL");
            if (url == null) {
                throw new RuntimeException("MYSQL_URL environment variable not set");
            }
            conn = DriverManager.getConnection(url);
            if (conn == null) {
                throw new RuntimeException("Failed to connect to database");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
