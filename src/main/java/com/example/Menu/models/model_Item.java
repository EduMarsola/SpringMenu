package com.example.Menu.models;

import java.sql.*;

public abstract class model_Item {
    public static String GetItems(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql:/127.0.0.1:3306/Menu", "root", "null");
            Statement st = cn.createStatement();
            ResultSet reply = st.executeQuery("Select * from Item;");
            while(reply.next()) {
                System.out.println(reply.getInt("id"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
        return "";
    }
}
