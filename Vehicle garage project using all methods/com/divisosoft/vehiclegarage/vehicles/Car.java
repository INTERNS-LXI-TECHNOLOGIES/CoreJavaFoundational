package com.divisosoft.vehiclegarage.vehicles;
import com.divisosoft.vehiclegarage.vehicle.Vehicle;
public class Car extends Vehicle{
private boolean istaxi;

    public boolean getIstaxi() {
        return istaxi;
    }

    public void setIstaxi(boolean istaxi) {
        this.istaxi = istaxi;
    }
	public void carsc(){
	int x = (int) (Math.random() * 5);
	
	if (x%2==0){
		istaxi=true;
	}
	else if(x%2!=0){
		istaxi=false;
	}
	}
		
public String toString(){
	return ""+super.getName()+"\t"+super.getColor()+"\t"+(istaxi ? "This is a Taxi":"This is not Taxi")+"\n";
}


}
