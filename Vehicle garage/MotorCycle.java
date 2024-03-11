public class MotorCycle extends Vehicle{

private boolean isGear;



public void setGear(boolean gear){
	this.isGear=gear;
}

public boolean getGear(){
	return this.isGear;
}
 public boolean bikeDetails(){
	int x =(int)(Math.random()*5);
	if(x%2==0){
	 isGear=true;
	}
	else if(x%2==1){
	 isGear=false;
	}
	return isGear;
}

public String toString(){
	return "\n"+isGear;
}
 
  
public void Showbike(){
	System.out.println(super.getBrand()+"\n"+super.getModel()+"\n"+super.getColor());
}














}