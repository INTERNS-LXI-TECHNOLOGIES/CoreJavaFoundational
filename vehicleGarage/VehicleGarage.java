public class VehicleGarage{
	private String name;
	private long phnum;
	private Vehicle[] vehicle = new Vehicle[10];
	
	public void setName(String name){
		this.name=name;
	}
	public void setPhnum(long phnum){
		this.phnum=phnum;
	}
	public Vehicle[] getVehicle(){
		return this.vehicle;
	}
	
	public void showCarDetails(){
		System.out.println("\t	CAR DETAILS	\n");
		for (int i = 0; i <vehicle.length; i++) {
			if (vehicle[i] instanceof Car){
				String result="";
			if (((Car) vehicle[i]).getIstaxi()== true){
				result="A TAXI";
			}
			else{
				result="NOT A TAXI";
			}
		System.out.println(" VEHICLE NAME: "+vehicle[i].getName()+"\n"+" REGISTRATION PLATE: "+vehicle[i].getRegplate()+"\n"+" THIS IS: "+result+"\n");
			}
		}
	}
	
	public void showMotorbikeDetails(){
		System.out.println("\t	MOTOR BIKE DETAILS	\n");
		for (int i = 0; i <vehicle.length; i++) {
			if (vehicle[i] instanceof Motorbike){
				String result="";
			 if (((Motorbike) vehicle[i]).getIsgeared()==true){
				result="GEARED";
			}
			else{
				result="NOT GEARED";
			}
		System.out.println(" VEHICLE NAME: "+vehicle[i].getName()+"\n"+" REGISTRATION PLATE: "+vehicle[i].getRegplate()+"\n"+" THIS IS: "+result+"\n");
			}
		}
	}
	
	public String toString(){
		String result="";
		for(int i=0;i<vehicle.length;i++){
			result+=vehicle[i];
		}
	return "\t	GARAGE INFORMATION	\n"+"\n GARAGE NAME: "+name+"\n GARAGE PH.NUMBER: "+phnum+"\n"+"\n		VEHICLE DETAILS	\n"+result;
	}
}