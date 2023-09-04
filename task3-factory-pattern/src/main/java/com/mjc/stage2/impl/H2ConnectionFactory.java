package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {
    @Override
    public Connection createConnection() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("h2database.properties"));
            return DriverManager.getConnection(properties.getProperty("db_url"), properties);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Write your code here!
}

