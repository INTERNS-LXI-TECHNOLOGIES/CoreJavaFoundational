public class Garage{

private String name;
private long mobNumber;
private String address;

Vehicle[] vehicle = new Vehicle[10];

public void setName(String name){
	this.name=name;
}

public String getName(){
	return name;
}

public void setMobnumber(long mobNumber){
	this.mobNumber=mobNumber;
}

public long getMobnumber(){
	return mobNumber;
}

public void setAddress(String address){
	this.address=address;
}

public String getAddress(){
	return address;
}


public String toString(){
  String result = "";
  for(int i=0;i<vehicle.length;i++){
	  result += vehicle[i];
  }
	return "\n"+getName()+"\n"+getMobnumber()+"\n"+getAddress()+"\n"+result;
}









}