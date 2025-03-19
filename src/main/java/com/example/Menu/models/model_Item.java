package com.example.Menu.models;

import com.example.Menu.controllers.Item;

import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

public abstract class model_Item {
    public static String GetItemsData(){
        StringBuilder response = new StringBuilder("{\n    ");
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
            response.append(foodList.get(i).GetData());
            if(i<foodList.size() - 1){
                response.append(", ");
            }
        }

        return response.append("\n}").toString();
    }

    public static String getItem(String itemName){
        Item it = new Item(0, "");
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/menu", "root", "null");
            Statement st = con.createStatement();
            ResultSet response = st.executeQuery("select * from Item where ItemName = \"" + itemName + "\"");

            while(response.next()){
                it = new Item(response.getInt("ItemId"), response.getString("ItemName"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
        return it.GetData();
    }
}
