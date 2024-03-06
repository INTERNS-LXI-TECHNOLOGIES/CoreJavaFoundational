public class Vehicle{
	private String name;
	private String regplate;

	public void setName(String name){
		this.name=name;
	}
	public void setRegplate(String regplate){
		this.regplate=regplate;
	}

	public String toString(){
		return "\n VEHICLE NAME: "+name+"\n"+" REGISTRATION PLATE: "+regplate;
	}
}