public class Tdd{
	public static void main(String args[]){
	
	VehicleGarage vg  = new VehicleGarage();
	vg.setName("JANATHA GARAGE");
	vg.setPhnum(7865491255l);
	
	for(int i=0;i<vg.getVehicle().length;i++){
		if(i<5){
		vg.getVehicle()[i] = new Car();
		}
		else if(i<10){
		vg.getVehicle()[i] = new Motorbike();
		}
	}
	
	vg.getVehicle()[0].setName("BMW");
	vg.getVehicle()[0].setRegplate("KL 09AR 4444");
	((Car)vg.getVehicle()[0]).carMethod();
	vg.getVehicle()[1].setName("PORSCHE");
	vg.getVehicle()[1].setRegplate("KL 09AR 5555");
	((Car)vg.getVehicle()[1]).carMethod();
	vg.getVehicle()[2].setName("BENZ");
	vg.getVehicle()[2].setRegplate("KL 09AR 2222");
	((Car)vg.getVehicle()[2]).carMethod();
	vg.getVehicle()[3].setName("TATA");
	vg.getVehicle()[3].setRegplate("KL 09AR 8888");
	((Car)vg.getVehicle()[3]).carMethod();
	vg.getVehicle()[4].setName("MARUTHI");
	vg.getVehicle()[4].setRegplate("KL 09AR 1111");
	((Car)vg.getVehicle()[4]).carMethod();
	vg.getVehicle()[5].setName("HERO SPLENDER");
	vg.getVehicle()[5].setRegplate("KL 09AR 123");
	((Motorbike)vg.getVehicle()[5]).bikeMethod();
	vg.getVehicle()[6].setName("FZ-5");
	vg.getVehicle()[6].setRegplate("KL 09AR 132");
	((Motorbike)vg.getVehicle()[6]).bikeMethod();
	vg.getVehicle()[7].setName("BULLET 350");
	vg.getVehicle()[7].setRegplate("KL 09AR 145");
	((Motorbike)vg.getVehicle()[7]).bikeMethod();
	vg.getVehicle()[8].setName("INTERCEPTOR 650");
	vg.getVehicle()[8].setRegplate("KL 09AR 154");
	((Motorbike)vg.getVehicle()[8]).bikeMethod();
	vg.getVehicle()[9].setName("PULSAR");
	vg.getVehicle()[9].setRegplate("KL 09AR 1475");
	((Motorbike)vg.getVehicle()[9]).bikeMethod();
	
		for(int i=0;i<vg.getVehicle().length;i++){
			if(i<5){	
				if (vg.getVehicle()[i] instanceof Car) {
					((Car)vg.getVehicle()[i]).carMethod();
				}
			}
			else if(i<9){
				if(vg.getVehicle()[i] instanceof Motorbike){
					((Motorbike)vg.getVehicle()[i]).bikeMethod();
				}
			}
		}
		System.out.println(vg);		
		/*for (int i = 0; i < vg.getVehicle().length; i++) {
            if (vg.getVehicle()[i] instanceof Car) {
                ((Car) vg.getVehicle()[i]).showCarDetails();
            }
		}*/
	}
}