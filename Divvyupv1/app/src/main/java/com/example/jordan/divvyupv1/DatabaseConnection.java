package com.example.jordan.divvyupv1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    public static Connection getConnection() {

        Connection connection = null;

        try {
            String database_URl = 
                    "jdbc:mysql://cslinux.samford.edu:3306/codedb";
//                    "jdbc:mysql://192.168.1.3:3306/codedb";

            connection = DriverManager.getConnection(database_URl,Input_Data.USERNAME,Input_Data.PW);
            return connection;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } catch (Exception e) {
            System.out.println(e);
            return null;

        }

    }//end of getConnection method

}//end of class file
