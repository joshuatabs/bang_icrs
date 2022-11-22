package com.teamcute.bang.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teamcute.bang.Entity.FoodEntity;
import com.teamcute.bang.Service.FoodService;




@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
    FoodService fserv;
    
    //printHelloStudent
    @GetMapping("/print")
    public String printHelloStudent() {
        return "Hello, Student!";
    }
    
    //Create or insert a student record
    @PostMapping("/postFood")
    public FoodEntity insertFood(@RequestBody FoodEntity food) {
    	return fserv.insertFood(food);
    }
    
    //Read
    @GetMapping("/getAllFood")
    public List<FoodEntity> getAllFood(){
        return fserv.getAllFood();
    }
    
    //Read a record by Firstname
    @GetMapping("/getByName")
    public FoodEntity findByName(@RequestParam String name) {
    	return fserv.findByName(name);
    } 
    
    @PutMapping("/putFood")
    public FoodEntity putFood(@RequestParam int id,    @RequestBody FoodEntity newFoodDetails) throws Exception {
        return fserv.putFood(id, newFoodDetails);
    }
    
    @DeleteMapping("deleteFood/{id}")
    public String deleteFood(@PathVariable int id) {
        return fserv.deleteFood(id);
    }
}
