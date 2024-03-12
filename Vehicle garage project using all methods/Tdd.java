public class Tdd{
	public static void main(String []args){
	
	Vehiclegarage vehiclegarage =new Vehiclegarage();
	vehiclegarage.setName("Motor Bazar");
	vehiclegarage.setContactno(9876543210L);
	
	//System.out.println(vehiclegarage.getName());
	//System.out.println(vehiclegarage.getContactno());
	
	String result[] ={"M-800","Amaze","Mini cooper","Mercedez benz", "BMW"};
	String type[] ={"Spledor","FZ","Royal enfield standared","Ninja 300", "GT-650"};
	for (int i=0,t=0;i<vehiclegarage.vehicle.length;i++){
		if(i<5){
		vehiclegarage.vehicle[i]=new Car();
		vehiclegarage.vehicle[i].setName(result[i]);
		vehiclegarage.vehicle[i].setColor("Black");
		//System.out.println(vehiclegarage.vehicle[i].getName());	
		}		
		else if(i<10){
		vehiclegarage.vehicle[i]=new Motorcycle();
		vehiclegarage.vehicle[i].setName(type[t]);
		vehiclegarage.vehicle[i].setColor("Black");
		//System.out.println(vehiclegarage.vehicle[i].getName());
		t++;
		}
	//System.out.println(vehiclegarage.vehicle[i].getName());
	//System.out.println(vehiclegarage.vehicle[i].getColor());
	}

/*for (int i = 0; i < vehiclegarage.vehicle.length; i++) {
    
	int x = (int) (Math.random() * 5);
	
	if (vehiclegarage.vehicle[i] instanceof Car) {
        if (x % 2 == 0) {
            ((Car) vehiclegarage.vehicle[i]).setIstaxi(true);
        } 
		else {
            ((Car) vehiclegarage.vehicle[i]).setIstaxi(false);
		}
        //System.out.println(((Car) vehiclegarage.vehicle[i]).getIstaxi());
    }

    if (vehiclegarage.vehicle[i] instanceof Motorcycle) {
        if (x % 2 == 0) {
            ((Motorcycle) vehiclegarage.vehicle[i]).setGearless(true);
			} 
		else {
            ((Motorcycle) vehiclegarage.vehicle[i]).setGearless(false);
			}
        //System.out.println(((Motorcycle) vehiclegarage.vehicle[i]).getGearless());
    }
	}*/

	for (int i=0;i<5;i++){
		((Car)vehiclegarage.vehicle[i]).carsc();
	}
	for (int i=5;i<10;i++){
		((Motorcycle)vehiclegarage.vehicle[i]).motorcyclec();
	}
	System.out.println(vehiclegarage);
	
	vehiclegarage.showCars();
	


	
}
}
