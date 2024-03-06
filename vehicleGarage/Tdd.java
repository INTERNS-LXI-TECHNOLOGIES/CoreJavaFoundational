public class Tdd{
	public static void main(String args[]){
	
	VehicleGarage vg = new VehicleGarage();
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
	vg.getVehicle()[1].setName("PORSCHE");
	vg.getVehicle()[1].setRegplate("KL 09AR 5555");
	vg.getVehicle()[2].setName("BENZ");
	vg.getVehicle()[2].setRegplate("KL 09AR 2222");
	vg.getVehicle()[3].setName("TATA");
	vg.getVehicle()[3].setRegplate("KL 09AR 8888");
	vg.getVehicle()[4].setName("MARUTHI");
	vg.getVehicle()[4].setRegplate("KL 09AR 1111");
	vg.getVehicle()[5].setName("HERO SPLENDER");
	vg.getVehicle()[5].setRegplate("KL 09AR 123");
	vg.getVehicle()[6].setName("FZ-5");
	vg.getVehicle()[6].setRegplate("KL 09AR 132");
	vg.getVehicle()[7].setName("BULLET 350");
	vg.getVehicle()[7].setRegplate("KL 09AR 145");
	vg.getVehicle()[8].setName("INTERCEPTOR 650");
	vg.getVehicle()[8].setRegplate("KL 09AR 154");
	vg.getVehicle()[9].setName("PULSAR");
	vg.getVehicle()[9].setRegplate("KL 09AR 1475");
	
	
	System.out.println(vg);
	}
}