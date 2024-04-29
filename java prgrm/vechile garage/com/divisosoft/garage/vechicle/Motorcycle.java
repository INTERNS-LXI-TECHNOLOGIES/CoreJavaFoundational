package com.divisosoft.garage.vechicle;
import com.divisosoft.garage.vechicle.*;
public class Motorcycle extends Vechicle{
	boolean isgear;
	
public boolean getIsgear(){
	return isgear;
}
public void setIsgear(boolean isgear){
	this.isgear=isgear;
}
public void iscycle(){
	int y=(int)(Math.random()*5);
   
	
	if(y%2==0){
		isgear=true;
	}
	
	else if(y%2!=0){
		isgear=false;
	}
	   
}
public String toString(){
	return "\n"+"\n"+ "motorcycle:" + super.getBrandname()+"\n"+super.getRegno()+"\n"+super.getColor()+"\n"+(isgear ? "This is geared" : "This is not geared"+"\n"+"\n");

}
	
}
	
