public class Car extends Vehicle{

private boolean isTaxi;

public void setTaxi(boolean istaxi){
	this.isTaxi=istaxi;
}

public boolean getTaxi(){
	return isTaxi;
}

public boolean carDetails(){
	int x =(int)(Math.random()*5);
	if(x%2==0){
	 isTaxi=true;
	}
	else if(x%2==1){
	 isTaxi=false;
	}
	return isTaxi;
}

public String toString(){
	return "\n"+super.getBrand()+"\n"+super.getModel()+"\n"+super.getColor();
}

public boolean carType(){
	if(isTaxi==true){
		System.out.println("This car is taxi"); 
	}else if(isTaxi==false){
		System.out.println("This car is not taxi");
	}
	return isTaxi;
}




}