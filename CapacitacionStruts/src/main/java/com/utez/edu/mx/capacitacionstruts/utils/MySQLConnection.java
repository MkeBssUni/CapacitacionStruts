package com.utez.edu.mx.capacitacionstruts.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private static String HOST = "localhost";
    private static String DBNAME= "capacitacion";
    private static String USER= "root";
    private static String PASSWORD="root";
    private static String PORT="3306";

    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return DriverManager.getConnection("jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME+"?serverTimezone=UTC", USER, PASSWORD);

    }
    public static void main(String[] args) {
        try{
            Connection con = getConnection();
            System.out.println("Conectado a la base");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

