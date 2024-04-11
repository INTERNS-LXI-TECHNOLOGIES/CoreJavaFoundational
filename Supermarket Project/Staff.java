public class Staff{

private String name;
private int age;
private long salary;

public void setName(String name){
	this.name=name;
} 

public String getName(){
	return this.name;
}

public void setSalary(long salary){
	this.salary=salary;
}

public long getSalary(){
	return this.salary;
}

public void setAge(int age){
	this.age=age;
} 

public int getAge(){
	return this.age;
}

  public String toString(){
	  return "Staff Name : "+getName()+"\n"+"Staff Age : "+getAge()+"\n";
  }

























}