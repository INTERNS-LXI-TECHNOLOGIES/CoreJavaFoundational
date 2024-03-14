package com.divisosoft.garage;
public class Car extends Vechicle{
	
private boolean istaxi;

public void setIstaxi(boolean istaxi){
	this.istaxi=istaxi;
}
public boolean getIstaxi(){
	return istaxi;
}

public void iscar(){
	int x=(int)(Math.random()*5);
    
	
	if(x%2==0){
		
		istaxi=true;
		
	}
	
	else if(x%2!=0){
		
		istaxi=false;
		
	}
	
    
}
public String toString(){
	return "\n"+"\n"+"Car:"+ super.getBrandname()+"\n"+super.getRegno()+"\n"+super.getColor()+"\n"+(istaxi ? "This is taxi" : "This is not taxi"+"\n"+"\n");

}
		}



