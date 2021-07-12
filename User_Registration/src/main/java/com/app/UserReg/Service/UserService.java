package com.app.UserReg.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.UserReg.Repository.UserRipository;
import com.app.UserReg.Model.User;


@Service
@Transactional
public class UserService {

 	@Autowired
 private  UserRipository repo;
//	 
 	public UserService() {}

 	 
 	
 	public UserService(UserRipository repo)
	{
		this.repo=repo;
	 
	}
	public void saveMyUser(User user ) {
		repo.save(user);
		 
	}
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : repo.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
	public Iterable <User>deletByUsername (String username)
	{
		repo.deleteByUsername(username);
		return repo.findAll();
	}
	
 
	 
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
	return repo.findByUsername(username);	//return null;
	}



	public Iterable<User> deleteById(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);return repo.findAll();	}
	
	 
	
}
