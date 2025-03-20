package com.example.Menu.models;

import com.example.Menu.controllers.Item;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class model_Place {
    public static String getItemsFromSite(String placeName){
        List<Item> foodList = new ArrayList<Item>();
        StringBuilder response = new StringBuilder();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/menu", "root", "null");
            Statement st = con.createStatement();
            ResultSet reply = st.executeQuery("select * from Item join Place " +
                    "on Item.PlaceId = Place.PlaceId where Place.PlaceName=\"" + placeName + "\";");
            while(reply.next()){
                foodList.add(new Item(reply.getInt("ItemID"), reply.getString("ItemName")));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        for(int i =0; i<foodList.size(); i++){
            response.append(foodList.get(i).GetData());
            if(i< foodList.size() - 1){
                response.append(", ");
            }
        }
        return response.toString();
    }

    public static String getPromoFromSite(String siteName){
        return "";
    }

    public static void setItemFromSite(Item item){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/menu", "root", "null");
            Statement st = con.createStatement();
            ResultSet reply = st.executeQuery("Select PlaceId from Place where PlaceName= \""+item.GetPlace() + "\";");
            reply.next();
            st.execute("insert into Item (ItemName, PlaceId) values ( \" " +
                    item.GetName() + " \" , " + reply.getString("PlaceId") + ");");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

}
