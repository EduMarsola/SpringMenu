package com.example.Menu;

import java.sql.*;

public abstract class SQLCompact {
    private static Connection cn = null;

    private static Connection CreateConnection(){
        try{
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/menu", "root", "null");
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            return cn;
        }
    }
    public static String GetAllItens(){
        return "";
    }

    public static void GetAllItensFromPlace(){

    }

    public static void InsertItem(){

    }


    public static void DeleteItemByName(String itemName){
        try{
            Connection cn = CreateConnection();
            Statement st = cn.createStatement();
            st.executeQuery("delete * from Item where itemName = \" "+itemName + " \" ");

        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
