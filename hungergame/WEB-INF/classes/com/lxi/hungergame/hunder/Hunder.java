package com.lxi.hungergame.hunder;
public class Hunder{
private String hundericon;
private int effect=7;
private String name;


public Hunder(String hundericon,String name,int effect) {
        this.hundericon = hundericon;
		this.name=name;
		this.effect=effect;
		
		   }

public String getHundericon(){
	return hundericon;
}
public void setHundericon(String hundericon){
	this.hundericon=hundericon;	
}
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;	
}
public int getEffect(){
	return effect;
}
public void setEffect(){
	this.effect=effect;
}
}