public class Supermarket{

private String name;
private String location;
private String owner;
private long mobNumber;

Staff[] staff = new Staff[8];
Product[] product = new Product[25];

public void setName(String name){
	this.name=name;
} 

public String getName(){
	return this.name;
}

public void setLocation(String location){
	this.location=location;
}

public String getLocation(){
	return this.location;
}

public void setOwner(String name){
	this.owner=name;
}

public String getOwner(){
	return this.owner;
}

public void setMobNumber(long number){
	this.mobNumber=number;
}

public long getMobNumber(){
	return this.mobNumber;
}


  public String toString(){
	   String result = "";
	   String value = "";
  for(int i=0;i<staff.length;i++){
	  result += staff[i];
    }
	for(int i=0;i<product.length;i++){
		value += product[i];
	}
	  return "Name : "+getName()+"\n"+"Location : "+getLocation()+"\n"+"Owner : "+getOwner()+"\n"+"Mob : "+getMobNumber()+"\n"+result+"\n"+value;
  }


public void showAttendance(){
	for(int i = 0 ; i < staff.length ; i++){
	   if(staff[i] instanceof Female){
		   System.out.println(((Female)staff[i]).attendance());
	   }
    }
}

public void showSalaryDetails(){
	for(int i = 0 ; i < staff.length ; i++){
	   if(staff[i] instanceof Male){
		   System.out.println(((Male)staff[i]).salaryRecievedOrNot());
	   }
    }
}










}