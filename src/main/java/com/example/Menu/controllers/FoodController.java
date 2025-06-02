package com.example.Menu.controllers;

import com.example.Menu.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("food")
public class FoodController {
    @CrossOrigin
    @GetMapping("/all")
    public String getItem(){
        return model_Item.GetItemsData();
    }

    @CrossOrigin
    @GetMapping("/unit/")
    public String getUnitItem(@RequestParam("itemName") String itemName){
        return model_Item.getItem(itemName);
    }

    @CrossOrigin
    @GetMapping("/place/")
    public String getPlaceItems(@RequestParam("placeName") String placeName){
        return model_Place.getItemsFromSite(placeName);
    }

    @CrossOrigin
    @PostMapping("/place/in/")
    public void setUnitItem(@RequestParam("itemName") String itemName, @RequestParam("placeName") String placeName){
        model_Place.setItemFromSite(new Item(itemName, placeName));
    }
}
