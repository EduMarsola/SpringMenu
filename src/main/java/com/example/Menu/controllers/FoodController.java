package com.example.Menu.controllers;

import com.example.Menu.Food.Food;
import com.example.Menu.Food.FoodRepository;
import com.example.Menu.models.model_Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
        //repositore : interface
        //entity : tabela
    @Autowired
    @GetMapping
    public String getAllItem(){
        return model_Item.GetItems();
    }
}
