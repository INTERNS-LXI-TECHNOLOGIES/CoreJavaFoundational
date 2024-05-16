package com.lxisoft.ghost.model;
public class Ghostmodel{

private String name;
private  int age;
private String deathreason;

public void setName(String name){
	
	this.name=name;
}

public String getName(){
	
	return this.name;
}

public void setAge(int age){
	
	this.age=age;
}

public void setDeathreason(String deathreason){
	
	this.deathreason=deathreason;
}

public String getDeathreason(){
	
	return deathreason;
}
}