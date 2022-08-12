package com.shaker;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/shakerbillo/Desktop/JavaProgrammingMasterClassForSWDevelopers/TestDB/" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {


        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                  " (" + COLUMN_NAME + " text, " +
                                         COLUMN_PHONE + " integer, " +
                                        COLUMN_EMAIL + " text" +
                                    ")");

            insertContact(statement,"Emmanuel", 765443, "emmanuel@smail.com");

            insertContact(statement,"Nana", 57765, "nana@smail.com");

            insertContact(statement,"Gyan", 987543, "gyan@smail.com");

            insertContact(statement,"Chloe", 76564647, "chloe@smail.com");


            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=5566789" +
                    " WHERE " + COLUMN_NAME + "='Emmanuel'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                                " WHERE " + COLUMN_NAME + "='Nana'");



            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                    results.getInt(COLUMN_PHONE)+ " " +
                                    results.getString(COLUMN_EMAIL));
            }
            results.close();


            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void insertContact(Statement statement, String name, int phone, String email)throws SQLException{

        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                ") " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");

    }



    }

