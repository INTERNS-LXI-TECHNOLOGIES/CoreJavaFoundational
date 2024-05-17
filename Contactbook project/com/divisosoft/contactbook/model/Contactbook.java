package com.divisosoft.contactbook.model;

public class Contactbook{

  private String name;
  private long mobileNumber;
  private String email;
  
 public void setName(String name){
	  this.name = name;
 }
 
 public String getName(){
	  return this.name;
 }
 
 public void setEmail(String email){
	  this.email = email;
 }
 
 public String getEmail(){
	  return this.email;
 }
 
 public void setMobileNumber(long number){
	  this.mobileNumber = number;
 }
 
 public long getMobileNumber(){
	  return this.mobileNumber;
 }
 
 public String toString(){
	  return "\n Name : "+ this.name + "\n Mobile Number : "+ this.mobileNumber + "\n Email ID : "+ this.email ; 
 }

}