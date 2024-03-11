public class Garage{
private String name;
private String address;
private long phnNo;
Vehicle[] vehicle=new Vehicle[10];

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setAddress(String address){
	this.address=address;
}
public String getAddress(){
	return address;
}
public void setPhnNo(long phnNo){
	this.phnNo=phnNo;
}
public long getPhnNo(){
	return phnNo;
}
 public String toString(){
	String result="";
	for(int i=0;i<vehicle.length;i++){
		result+=vehicle[i];
	}
	return "Garage Name - "+name+"\n"+"Address - "+address+"\n"+"Phone no - "+phnNo+"\n"+result; 
 }





}

