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
	
	String[] names = {"BMW", "PORSCHE", "BENZ", "TATA", "MARUTHI", "HERO SPLENDER", "FZ-5", "BULLET 350", "INTERCEPTOR 650", "PULSAR"};
	String[] regplates = {"KL 09AR 4444", "KL 09AR 5555", "KL 09AR 2222", "KL 09AR 8888", "KL 09AR 1111", "KL 09AR 123", "KL 09AR 132", "KL 09AR 145", "KL 09AR 154", "KL 09AR 1475"};

		for (int i = 0; i < 10; i++) {
			vg.getVehicle()[i].setName(names[i]);
			vg.getVehicle()[i].setRegplate(regplates[i]);
		}
	
	for (int i=0;i<vg.getVehicle().length;i++){
		if(i<5){
			((Car)vg.getVehicle()[i]).carMethod();
			}
		else if(i<10){
			((Motorbike)vg.getVehicle()[i]).bikeMethod();
		}
	}

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
		
		//System.out.println(vg);		
		vg.showCarDetails();
		}
	}