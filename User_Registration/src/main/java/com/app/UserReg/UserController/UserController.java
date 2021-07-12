package com.app.UserReg.UserController;

import java.util.List;

import javax.transaction.Transactional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.UserReg.Model.User;
//import com.app.UserReg.Repository.UserRipository;
 import com.app.UserReg.Service.UserService;

 @CrossOrigin(origins = "http://localhost:4200")
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/index")
public class UserController {
  
	
	@Autowired
	 private UserService service;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/register")
	@Transactional

	//this is for Adding user post

	public String registerUser(@RequestBody User user)
	{
		service.saveMyUser(user);
		return "Hello "+user.getFirstname()+", your registration is sucsessfull!";
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/user")
	//this is for showing users GET
	public Iterable<User>showAllUsers()
	{
		return service.showAllUsers();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/delete/{username}")
	@Transactional
	//this for delete by username
	public Iterable<User>deleteUser(@PathVariable String username )
	{
		return service.deletByUsername(username);
		
	}
	@DeleteMapping("/delete/{id}")
	@Transactional
	//this for delete by id
	public Iterable<User>deleteUser(@PathVariable ("id")int id)
	{
		return service.deleteById(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/search/{username}")
	//@CrossOrigin  this for searching by username
	public User searchUser(@PathVariable String username) {
		return service.findByUsername(username);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
  
	  	
}
