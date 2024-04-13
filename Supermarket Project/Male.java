public class Male extends Staff{

private boolean isSalaryRecieved;

public void setIsSalaryRecieved(boolean salaryRecieved){
	this.isSalaryRecieved=salaryRecieved;
} 

public boolean getisSalaryRecieved(){
	return this.isSalaryRecieved;
}

public boolean maleSalary(){
	 	int x =(int)(Math.random()*8);
	if(x%2==0){
	 isSalaryRecieved=true;
	}
	else if(x%2==1){
	 isSalaryRecieved=false;
	}
	return isSalaryRecieved;
    }

public boolean salaryRecievedOrNot(){
	if(isSalaryRecieved==true){
		System.out.println("He got his Salary"); 
	}else if(isSalaryRecieved==false){
		System.out.println("He didn't recieve his Salary");
	}
	return isSalaryRecieved;
  }





}