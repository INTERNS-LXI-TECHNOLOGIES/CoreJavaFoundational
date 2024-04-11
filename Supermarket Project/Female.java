
public class Female extends Staff{

private boolean isPresent;

public void setIsPresent(boolean present){
	this.isPresent=present;
}

public boolean getIsPresent(){
	return this.isPresent;
}

 public boolean femaleAttendance(){
	 	int x =(int)(Math.random()*5);
	if(x%2==0){
	 isPresent=true;
	}
	else if(x%2==1){
	 isPresent=false;
	}
	return isPresent;
    }
 
 public boolean attendance(){
	if(isPresent==true){
		System.out.println("She is present"); 
	}else if(isPresent==false){
		System.out.println("She is not present");
	}
	return isPresent;
}
 
 
 
 
 
 }