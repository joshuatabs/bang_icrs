package com.teamcute.bang.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcute.bang.Entity.UserEntity;
import com.teamcute.bang.Repository.UserRepository;


@Service
public class UserService {
		//CRUD methods of your API
		//business logic of the API
		//CRUD operations
		@Autowired
		UserRepository urepo;
		
		//create/insert a user to the database
		public UserEntity insertUser(UserEntity user) {
			return urepo.save(user);
			
		}
		
		//return a list of users entities in the system
		public List<UserEntity> getAllUsers() {
			return urepo.findAll();
			
		}
		//find by firstname
		public UserEntity findByFirstname(String firstname) {
			if (urepo.findByFirstname(firstname) != null) {
				return urepo.findByFirstname(firstname);
			}
			else {
				return null;
			}
		}
		
		//update student record
		public UserEntity putUser(int id, UserEntity newUserDetails) throws Exception {
			UserEntity user = new UserEntity(); //creating an instance of user
			
			try {
				//Search the ID number of the student
				user = urepo.findById(id).get();
				
				//update the record
				user.setUsername(newUserDetails.getUsername());
				
				//Save the information and return the value
				return urepo.save(user);
			}catch(NoSuchElementException nex) {
				//throws an error if the id does not exist
				throw new Exception("User "+ id + " does not exist!");
			}
		}
		
		public String deleteUser(int id) {
			String msg;
			if(urepo.findById(id) != null) {
				urepo.deleteById(id); //find the id number of the student to be deleted
				msg = "User " + id + " was successfully deleted!";
			} else {
				msg = "User " + id + " was NOT found!";
			}
			
			return msg;
		}
		
}
