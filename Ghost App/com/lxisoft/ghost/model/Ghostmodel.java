package com.lxisoft.ghost.model;
public class Ghostmodel{

private  String name;
 
private  int age;

private  String deathreason;

public void setName(String name){
	this.name=name;
}

public String getName(){
	
	return this.name;
}

public void setAge(int Age){
	
	this.age=age;
}

public int getAge(){
	return this.age;
}

public void setDeath(String deathreason){
	this.deathreason=deathreason;
}

public String getDeath(){
	return this.deathreason	;
}

public String toString(){
	
	return name+age+deathreason;
}


}