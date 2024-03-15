package com.divisosoft.supermarket.market;

public class Supermarket{

private String name;
 
public  Floor floor[] =new Floor[3];



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


public Employ[] employ = new Employ[10];


public void showMale(){
	
	for(int i=0;i<employ.length;i++){
		
		if(employ[i] instanceof Male){
			
			Male male = (Male)employ[i];
			
			System.out.println(">>>>Male"+male.getSalary()+male.getMalename());
		}
	}
}



public void showFeMale(){
	
	for(int i=0;i<employ.length;i++){
		
		if(employ[i] instanceof Female){
			
			Female female = (Female)employ[i];
			
			System.out.println(">>>>female"+female.getSalary()+female.getfemalename());
		}
	}
}


public String  floor(){
	
	String flor="";
	for(int i=0;i<floor.length;i++){
		
		flor+=floor[i];
		
		
		
	}
	return flor;
}



public String toString(){
	
	String kl=""; 
	for(int i=0;i<employ.length;i++){
		kl+=employ[i];
	}
	
	return "\n"+name+"\n"+ownername+"\n"+employ[0]+kl;
}

}