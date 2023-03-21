package com.diviso.production;
public class User{

 private String userName;
 private String passWord;

public User(){
	
	this.userName="Yadhu";
	this.passWord="yadhu#123";
}

  public String getUsername(){
	  
	  return userName;
  }
  public void setUsername(String name){
	  this.userName=name;
  }
  
  public String getPassword(){
	  return passWord;
  }
  public void setPassword(String passWord){
	  
	  this.passWord=passWord;
  }

}