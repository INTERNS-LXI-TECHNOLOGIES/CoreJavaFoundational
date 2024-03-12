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
		for (int i = 0; i <vehicle.length; i++) {
			if (((Car)vehicle[i]) instanceof Vehicle){
				Car car=(Car)vehicle[i];
				String result="";
			if (car.getIstaxi()== true){
				result="THS IS A TAXI";
			}
			else{
				result="THS IS NOT A TAXI";
			}
				System.out.println(vehicle[i].getName()+vehicle[i].getRegplate()+result+"\n");
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