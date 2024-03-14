package com.divisosoft.garage;
public class Vechiclegarage{
private String garagename;
private long phnnumber;
boolean car;
boolean motorcycle;

Vechicle[] vechicle =new Vechicle[10];




 public String getGaragename(){
	return garagename;
}
 public void setGaragename(String garagename){
    this.garagename=garagename;
}
 public long getPhnnumber(){
	return phnnumber;
}
 public void setPhnnumber(long phnnumber){
    this.phnnumber=phnnumber;
	
}
public void showcardetails(){
	System.out.println("CAR DETAILS"+"\n");
	
	for(int i=0;i<5;i++){
			
		if(vechicle[i] instanceof Car){
			System.out.println("\n"+vechicle[i].getBrandname());
		    System.out.println(vechicle[i].getRegno());
            System.out.println(vechicle[i].getColor());
			
			boolean isNowTaxi = ((Car)vechicle[i]).getIstaxi();
			  
			  if(isNowTaxi){
			  System.out.println("this is taxi");}
			  else if(isNowTaxi==false){
				  System.out.println("this is not taxi");}
			
			  //System.out.println(((Car)vechicle[i]).getIstaxi());
             }
			  
		  }
		}

public void showmotorcycledetails(){
	System.out.println("\n"+"MOTORCYCLE DETAILS"+"\n");
	
	
	
		for(int i=5;i<10;i++){
			System.out.println("\n"+vechicle[i].getBrandname());
		    System.out.println(vechicle[i].getRegno());
            System.out.println(vechicle[i].getColor());
			
			if(vechicle[i] instanceof Motorcycle){
				boolean isNowGear=((Motorcycle)vechicle[i]).getIsgear();
				if(isNowGear){
				 System.out.println("this is geared");}	
				 else if(isNowGear==false){
					 System.out.println("this is geared");}	
					 
			
			
		
		}
}
}

public String toString(){
	String s="";
	for(int i=0;i<vechicle.length;i++){
	s+=vechicle[i];
	}
	return "garagename:" + garagename + "\n" + "phone number:" + phnnumber+"\n"+s;
	
}

}





 
	


