package com.teamcute.bang.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.teamcute.bang.Entity.UserEntity;
import com.teamcute.bang.Service.FoodService;
import com.teamcute.bang.Service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	//implement the service class
	@Autowired
	UserService userv;
	
	@PostMapping("/postUser")
	//Create/Insert
	public UserEntity inserUser(@RequestBody UserEntity user) {
		return userv.insertUser(user); //calling the method created in the service class
	}
	
	//Read
	@GetMapping("/getAllUsers")
	public List<UserEntity> getAllUsers() {
		return userv.getAllUsers();
		
	}
	
	@GetMapping("/getByFirstname")
	public UserEntity findByFirstname(@RequestParam String firstname) { //used when a method passes a parameter as part of the request
		return userv.findByFirstname(firstname);
	}
	
	@PutMapping("/putUser")
	public UserEntity putUser(@RequestParam int id,	@RequestBody UserEntity newUserDetails) throws Exception {
		return userv.putUser(id, newUserDetails);
	}
	
	@DeleteMapping("deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userv.deleteUser(id);
	}
	
}
