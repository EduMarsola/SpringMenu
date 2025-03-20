package com.example.Menu.controllers;

public class Item {
    private String itemName;
    private Integer itemId;
    private String placeName;

    public Item(int id, String name){
        this.itemName = name;
        this.itemId = id;
    }
    public Item(String name, String placeName){
        this.itemName = name;
        this.placeName = placeName;
    }

    public String GetData(){
       return ("{\"name\":\"" + this.itemName + "\", \"id\":" + this.itemId.toString() + "\"}");
    }

    public String GetName(){
        return this.itemName;
    }

    public String GetPlace(){
        return this.placeName;
    }

    public String GetPlaceToSQL(){
        return "\""+this.placeName+ "\"";
    }
}
