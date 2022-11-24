package com.userRegistration.Shared.Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = System.getenv("MYSQL_URL");
                if (url == null) {
                    throw new RuntimeException("MYSQL_URL environment variable not set");
                }
                connection = DriverManager.getConnection(url);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
