package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "XshOhzqAp3oM";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static Connection connection;

    public static Connection getConnection() {

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return connection;
    }

}
