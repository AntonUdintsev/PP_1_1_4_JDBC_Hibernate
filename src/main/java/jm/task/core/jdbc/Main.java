package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl usd = new UserServiceImpl();
        usd.createUsersTable();
        usd.saveUser("name1", "lastname1", (byte) 12);
        usd.saveUser("name1", "lastname1", (byte) 12);
        usd.saveUser("name1", "lastname1", (byte) 12);
        usd.saveUser("name1", "lastname1", (byte) 12);
        usd.getAllUsers();
        usd.cleanUsersTable();
        usd.dropUsersTable();


    }
}
