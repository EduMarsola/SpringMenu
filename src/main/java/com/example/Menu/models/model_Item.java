package com.example.Menu.models;

import com.example.Menu.controllers.Item;

import java.sql.*;
import java.util.ArrayList;

public abstract class model_Item {
    public static String GetItemsData(){
        String response = "";
        ArrayList<Item> foodList = new ArrayList<Item>();
        try{
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/menu",
                    "root", "null");
            Statement st = cn.createStatement();
            ResultSet reply = st.executeQuery("Select * from Item;");
            while(reply.next()) {
                foodList.add(new Item(reply.getInt("ItemId"), reply.getString("ItemName")));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
        for(int i=0; i<foodList.size(); i++){
            response += "{" + foodList.get(i).GetData() + "}";
        }

        return response;
    }

    public static ArrayList<Item> getListItem(){
        ArrayList<Item> list = new ArrayList<Item>();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/menu", "root", "null");
            Statement st = con.createStatement();
            ResultSet response = st.executeQuery("select ItemId, ItemName from Item");

            while(response.next()){
                list.add(new Item(response.getInt("ItemId"), response.getString("ItemName")));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
        return list;
    }
}
