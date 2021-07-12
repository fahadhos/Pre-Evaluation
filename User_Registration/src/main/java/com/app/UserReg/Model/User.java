package com.app.UserReg.Model;

import javax.persistence.*;
import java.util.Base64;
@Entity
@Table(name = "user")
public class User {

    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
   // @Column(name = "firstname",nullable=false)
    private String firstname;
    //@Column(name = "lastname")
    private String lastname;
  // @Column(name = "username",unique=true)
    private String username;
   
 //   @Column(name = "email",unique=true,nullable=false)
    private String email;
   
   //@Column(name = "password" )
    private String password;
   
   
   
   public User() {}



public User(int id, String firstname, String lastname, String username, String email, String password) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.username = username;
	this.email = email;
	 this. password =password;
	 
}
 

 

public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getFirstname() {
	return firstname;
}



public void setFirstname(String firstname) {
	this.firstname = firstname;
}



public String getLastname() {
	return lastname;
}



public void setLastname(String lastname) {
	this.lastname = lastname;
}



public String getUsername() {
	return username;
}



public void setUsername(String username) {
	this.username = username;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



@Override
public String toString() {
	return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
			+ ", email=" + email + ", password=" + password + "]";
}



 
   
   

}
