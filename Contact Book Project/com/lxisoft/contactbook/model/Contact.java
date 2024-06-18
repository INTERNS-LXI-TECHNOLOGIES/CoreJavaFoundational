package com.lxisoft.contactbook.model;

public class Contact{
	
	private String name;
	private long number;
	private String email;
	
	public String getName(){		
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public long getNumber(){
		return number;
	}
	
	public void setNumber(long number){
		this.number = number;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	
	
	
	
	public String csvFile()
	{
		return name + "," + number + "," + email ;
	}
	
	
	
	
	
	public String toString(){
		
		return "\n NAME   : "+name+"\n NUMBER : "+number+"\n EMAIL  : "+email;
	}
	
}