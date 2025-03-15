package com.example.Menu.controllers;

public class Item {
    private String name;
    private Integer id;

    public Item(int id, String name){
        this.name = name;
        this.id = id;
    }

    public String GetData(){
       return ("{\"name\":\"" + this.name + "\", \"id\":" + this.id.toString() + "\"}");
    }
}
