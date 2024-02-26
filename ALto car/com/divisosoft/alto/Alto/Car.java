package com.divisosoft.alto.Alto;
public class Car{
	
public	String brandname;
public	String colour;	
public  Engine engine;
public	Steiring  	steiring ;
public	Battery battery;
public  Mirror mirror;
public	Fueltank fueltank;
public	Signal[] signal = new Signal[2];
public	Break brek;
public	Body body;
public	Door[]door = new Door[4];
public	Tyre[]tyre = new Tyre[4];
public	Redbutton redbutton;
public	Headlight headlight;
public	int warrenty;
public	Seat seat;
	
  public void	carmove(){
		
		System.out.println("Car moving");
	}
	
	

	
	public void printdoornumber(){
		  for(int i=0;i<door.length;i++){
		
		System.out.println("Dorrnumber is\t:"+door[i]);
	}
	}
  

	
	
	
 public String toString(){
	 
	 String Ty="";
	 for(int i=0;i<tyre.length;i++){
		 
		 Ty+=tyre[i];
	 }
	 
	 
	 
	 String sig="";
	 
	 for(int i=0;i<signal.length;i++){
		 sig+=signal[i];
	 }
	  
	 
	  String kl="";
	 for(int i=0;i<door.length;i++){
		 
		 kl+=door[i];
		  }
	 
	
 
	 return "brandname of car"+"\n"+brandname+"\n"+"Car colour is\t:"+colour+"\n"+engine+battery+mirror+fueltank+brek+kl+sig+Ty+body+seat+steiring;
 }
	

	 

  
	
}