public class Student{
	private String name;
	private String gender;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	
	public String toString(){
		return "STUDENT NAME: "+name+"\n"+"GENDER: "+gender+"\n";
	}
}