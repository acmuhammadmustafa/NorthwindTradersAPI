package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class CategoriesController {
    private List<Category> categories;

    //http://localhost:8080/products should return a list of all products
    //http://localhost:8080/products/5 should return a specific product

    public CategoriesController(){
        this.categories  = new ArrayList<>();
        categories.add(new Category(1, "Fruit"));
        categories.add(new Category(2, "Meat"));
    }

    @RequestMapping(path="/category",method = RequestMethod.GET)
    public List<Category> getCategory(){
        return categories;
    }

    @RequestMapping(path="/category/{id}", method=RequestMethod.GET)
    public Category getCategory(@PathVariable int id){
        for(Category c : this.categories){
            if(c.getCategoryId() == id){
                return c;
            }
        }
        return null;
    }

}
