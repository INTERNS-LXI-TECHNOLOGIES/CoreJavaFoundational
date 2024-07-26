package com.lxisoft.hungergame.forest;


public  class Hunter {
	private String name;
	private String icon;
	private int hungerlevel;

Hunter(String name,String icon,int hungerlevel){
	this.name=name;
	this.icon=icon;
	this.hungerlevel=hungerlevel;
}
public void setHungerlevel(int hungerlevel){
	this.hungerlevel=hungerlevel;
}
public int getHungerlevel(){
	return hungerlevel;
}
public void setIcon(String icon){
	this.icon=icon;
}
public String getIcon(){
	return icon;
}
public void setName(){
	this.name=name;
}
public String getName(){
	return name;
}
}