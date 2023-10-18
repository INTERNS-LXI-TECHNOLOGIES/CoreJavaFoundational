package com.divisosoft.student;

public class Application{
	private String name;
	private int age;
	private double tax;
	private long adharno;
	private boolean maritalStatus;
	private String gender;

	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
	return age;
	}
	public void setAge(int age){
		this.age=age;
	}
		
	
		
	public double getTax(){
		return tax;
	}
	public void setTax(double tax){
		this.tax=tax;
	}
		
	public long getAdharNo(){
		return adharno;
	}
	public void setAdharNo(long adharno){
		this.adharno=adharno;
	}
	
	public boolean getMaritalStatus(){
		return maritalStatus;
	}
	public void setMaritalStatus(boolean maritalStatus){
		this.maritalStatus=maritalStatus;
	}
	
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
}