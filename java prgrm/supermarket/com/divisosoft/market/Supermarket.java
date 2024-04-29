package com.divisosoft.market;
public class Supermarket{
 private String name;
 private String ownername;
 private String location;
 private String color;
 
 Staff[] staff=new Staff[8]; 
 
 public String getName(){
	 return name;}
  
 public void setName(String name){
     this.name=name;}
   
 public String getOwnername(){
	 return ownername;}
   
 public void setOwnerName(String ownername){
	  this.ownername=ownername;}
	
   
 public String getLocation(){
	 return location;}
   
 public void setLocation(String location){
	 this.location=location;}
   

 public String getColor(){
	  return color;}
  
 public void setColor(String color){
	 this.color=color;}	

public String toString(){
	String result="";
	for(int i=0;i<staff.length;i++){
		result=result+staff[i];
	}
	return "supermarket name:"+name+"\n"+"supermarket ownername:"+ownername+"\n"+"supermarket place:"+location+"\n"+"color:"+color+"\n"+result;

  }
}
