package com.lnt.ems;

import org.springframework.boot.SpringApplication;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/myschema";
        String usr = "ems";
        String pass = "ems";

        try{
            System.out.println("Connecting to DB:" + url);

            Connection myConn = DriverManager.getConnection(url, usr, pass);

            System.out.println("Connection Successfull!!!!!!!!");


        }

        catch(Exception exc){
            exc.printStackTrace();
        }
    }
}
