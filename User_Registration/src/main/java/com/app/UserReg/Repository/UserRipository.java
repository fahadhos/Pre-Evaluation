package com.app.UserReg.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.UserReg.Model.User;

public interface UserRipository extends JpaRepository <User,Integer>{
	
	
	public User findByUsername(String username);
 public Iterable <User>deleteByUsername(String username); 	
	
	
	
	
	
	
///this will contain fetch findby find all etc
	
 
}

