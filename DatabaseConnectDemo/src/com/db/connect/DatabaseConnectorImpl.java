package com.db.connect;

import java.sql.PreparedStatement;

public class DatabaseConnectorImpl implements DatabaseConnect{

    static String username;
    static String password;
    static String connectionUrl;


    static {
        username = "admin";
        password = "Admin@6127";
        connectionUrl = "Mysql@127.0.0.1:3306/javaFullStack";
    }


    /**
     *
     */
    @Override
    public void mySqlConnector() {

        //PreparedStatement statement = mySqlConnector();

    }
}
