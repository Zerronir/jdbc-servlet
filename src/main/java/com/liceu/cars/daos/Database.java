package com.liceu.cars.daos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static Connection connection;

    public static Connection getConnection() {
        try{
            String url = "jdbc:sqlite:/Users/raulmiralles/Documents/FPGSDAW/SEGUNDO/jdbcDEMO/database.db";
            if(connection == null){
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection(url);
            }
            return connection;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
