package com.example.Menu.controllers;

import com.example.Menu.Food.Food;
import com.example.Menu.Food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;
    @GetMapping
    public List<Food> getAllFood(){
        //repositore : interface
        //entity : tabela
        List<Food> foodList = repository.findAll();
        return foodList;
    }
}
