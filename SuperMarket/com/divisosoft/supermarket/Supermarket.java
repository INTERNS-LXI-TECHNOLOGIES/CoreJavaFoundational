package com.divisosoft.supermarket;
public class Supermarket{

private String name;


public void setname(String name){
	this.name = name;
}

public String getname(){
	
	return this.name;
}
	
	

private String ownername;

public void setownername(String ownername){
	
	this.ownername=ownername;
}

public String getownername(){
	
	return this.ownername;
}


Employ[]employ = new Employ[10];




public String toString(){
	
	String kl="";
	for(int i=0;i<employ.length;i++){
		
		kl+= employ[i];
	}
	
	return kl;
}




}