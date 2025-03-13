package com.example.Menu.controllers;

import com.example.Menu.models.model_Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
public class FoodController {
        //repositore : interface
        //entity : tabela
    @Autowired
    @GetMapping("/all")
    public String getItem(){
        return model_Item.GetItemsData();
    }

    @Autowired
    @GetMapping("/list")
    public String getListItem(){
        return "";
    }
}
