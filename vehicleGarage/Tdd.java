public class Tdd{
	public static void main(String args[]){
	
	VehicleGarage vg  = new VehicleGarage();
	vg.setName("JANATHA GARAGE");
	vg.setPhnum(7865491255l);
	
	for(int i=0;i<vg.getVehicle().length;i++){
		if(i<5){
			vg.getVehicle()[i] = new Car();
			String[] names = {"BMW", "PORSCHE", "BENZ", "TATA", "MARUTHI"};
			String[] regplates = {"KL 09AR 4444", "KL 09AR 5555", "KL 09AR 2222", "KL 09AR 8888", "KL 09AR 1111"};
			vg.getVehicle()[i].setName(names[i]);
			vg.getVehicle()[i].setRegplate(regplates[i]);
			((Car)vg.getVehicle()[i]).carMethod();
		}
		else if(i<10){
			vg.getVehicle()[i] = new Motorbike();
			String[] names = {"HERO SPLENDER", "FZ-5", "BULLET 350", "INTERCEPTOR 650", "PULSAR"};
			String[] regplates = {"KL 09AR 123", "KL 09AR 132", "KL 09AR 145", "KL 09AR 154", "KL 09AR 1475"};
			vg.getVehicle()[i].setName(names[i-5]);
			vg.getVehicle()[i].setRegplate(regplates[i-5]);
			((Motorbike)vg.getVehicle()[i]).bikeMethod();
		}
	}
		
		System.out.println(vg);		
		vg.showCarDetails();
		vg.showMotorbikeDetails();
		}
	}