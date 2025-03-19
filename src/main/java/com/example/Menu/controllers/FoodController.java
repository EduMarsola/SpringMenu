package com.example.Menu.controllers;

import com.example.Menu.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/unit/")
    public String getUnitItem(@RequestParam("itemName") String itemName){
        return model_Item.getItem(itemName);
    }

    @GetMapping("/place/")
    public String getPlaceItems(@RequestParam("placeName") String placeName){
        return model_Place.getItemsFromSite(placeName);
    }
}
