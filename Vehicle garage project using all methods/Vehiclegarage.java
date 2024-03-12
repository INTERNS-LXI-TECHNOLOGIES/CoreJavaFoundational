public class Vehiclegarage{
private String name;
private long contactno;
Vehicle[] vehicle=new Vehicle[10];

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setContactno(long contactno){
	this.contactno=contactno;
}
public long getContactno(){
	return contactno;
}

/*public void setVehicle(Vehicle vehicle){
	this.vehicle=vehicle;
}
public Vehicle getVehicle(){
	return vehicle;
}*/

public String toString()
{
	
	String result ="";

for (int i=0;i<vehicle.length;i++)
{
	result +=vehicle[i];
	
}
	return "\n \t Vehicle Garage Details \n"+name+"\n"+contactno+"\n \t Vehicle Details \n"+result+"\n";
}

 public void showCars() {
    for (int i = 0; i < vehicle.length; i++) {
        if (vehicle[i] instanceof Car) {
        Car car=(Car) vehicle[i];
		/*if(car.getIstaxi()==true){
			System.out.println("This car is Taxi");
		}
		else{
			System.out.println("This car is not Taxi");
		}*/
	   System.out.println("Car: " + car.getName() + ", Color: " + car.getColor() + ", Taxi: " + (car.getIstaxi() ? "This car is Taxi":"This car is not Taxi") ); 
            }
        }
    }
	
}
