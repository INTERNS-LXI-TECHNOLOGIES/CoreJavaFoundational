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
	System.out.println("\t Show Cars Details \n");
    for (int i = 0; i < vehicle.length; i++) {
        if (vehicle[i] instanceof Car) {
        String car ="";
			
		if(((Car)vehicle[i]).getIstaxi()==true){
			car="This car is Taxi";
		}
		else{
			car="This car is not Taxi";
		}
	System.out.println("Car: " + vehicle[i].getName() + ", Color: " + vehicle[i].getColor() + ", Taxi: " + car ); 
            }
        }
    }

public void showMotorcycles() {
	System.out.println("\n \t Show Motorcycles Details \n");
   for (int i = 0; i < vehicle.length; i++) {
        if (vehicle[i] instanceof Motorcycle) {
            Motorcycle motor = (Motorcycle) vehicle[i];
    System.out.println("Motorcycle: " + motor.getName() + ", Color: " + motor.getColor() + ", Taxi: " + (motor.getGearless() ? "This is a Gearless Motorcycle" : "This is Geared Motorcycle"));
        }
    }
}
}
