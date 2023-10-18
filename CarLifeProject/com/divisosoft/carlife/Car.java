package com.divisosoft.carlife;
public class Car{
	private String name;
	private Parts door;
	private Parts tyre;
	private Parts str;
	private int distance;


public String getName(){
	return name;
}

public void setName(String name){
	this.name= name;
}

public Parts getdoor(){
	return door;
}

public void setdoor(Parts door){
	this.door=door;
}

public Parts gettyre(){
	return tyre;
}

public void settyre(Parts tyre){
	this.tyre=tyre;
}

public Parts getstr(){
	return str;
}

public void setstr(Parts str){
	this.str=str;
}

public int getdistance(){
	return distance;
}

public void setdistance(int distance){
	this.distance=distance;
}
}