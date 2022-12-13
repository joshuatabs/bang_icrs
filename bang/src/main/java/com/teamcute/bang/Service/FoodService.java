package com.teamcute.bang.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcute.bang.Entity.FoodEntity;
import com.teamcute.bang.Repository.FoodRepository;


@Service
public class FoodService {

	@Autowired
    FoodRepository frepo;
	
	//Read all records from tbl_student
    public List<FoodEntity> getAllFood(){
        return frepo.findAll();
    }
    //Create or insert a student record
    public FoodEntity insertFood(FoodEntity food) {
    	return frepo.save(food);
    }
    
    
     //Read or search student record by firstname
     public FoodEntity findByName(String name) {
    	 if (frepo.findByName(name)!=null)
    		 return frepo.findByName(name);
    	 else
    		 return null;
     }
     //U - Update a student record
     public FoodEntity putFood(int id, FoodEntity newFoodDetails) throws Exception{
    	 FoodEntity food = new FoodEntity();
    	 
    	 try {
    		 //steps in updating
    		 //step 1 - search the id number of the student
    		 food = frepo.findById(id).get(); //findbyID() is a pre defined method
    		 //step 2 update the record
    		 food.setName(newFoodDetails.getName());
    		 food.setPrice(newFoodDetails.getPrice());
    		 //step 3
    		 return frepo.save(food);
    		 
    	 }catch(NoSuchElementException next) {
    		 throw new Exception("ID number " + id + " does not exist!");
    	 }
     }
     //d - delete a student record
     public String deleteFood(int id) {
    	 String msg;
    	 if(frepo.findById(id) != null) {//find the record
    		 frepo.deleteById(id); //delete the record
    		 
    		 msg = "Food ID number " + id + " is successfully deleted!";
    	 }
    	 else 
    		 msg = "Food ID number " + id + " is NOT found!";
    	 return msg;
     }
}
