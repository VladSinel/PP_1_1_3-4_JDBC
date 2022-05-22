package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    // реализуйте настройку соеденения с БД

    private static final String URL= "jdbc:mysql://localhost/mysql?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "RodenServ0618++";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //private static Util instance = null;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER).getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection successful!");
            } catch (Exception ex) {
                System.out.println("Connection failed...");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        return connection;
    }

//    public static void closeConnection(Connection connection) {
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                System.out.println("Closing connection problems...");
//                System.out.println(e.getMessage());
//                e.printStackTrace();
//            }
//        }
//    }

//    public static Util getInstance() {
//        if (null == instance) {
//            instance = new Util();
//        }
//        return instance;
//    }

}