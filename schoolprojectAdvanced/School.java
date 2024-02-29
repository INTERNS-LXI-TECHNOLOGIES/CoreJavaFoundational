public class School{
	private String name;
	private String address;
	private int code;
	private Classroom[] classroom = new Classroom[2];
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name= name;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public int getCode(){
		return code;
	}
	public void setCode(int code){
		this.code=code;
	}
	
	public Classroom[] getClassroom(){
		return classroom;
	}
	
	
	public String toString(){
		String result="";
		for(int i=0;i<classroom.length;i++){
			result+=classroom[i];
		}
		return "\t	SCHOOL DETAILS	\n"+"SCHOOL NAME: "+name+"\n"+"ADDRESS: "+address+"\n"+"SCHOOL CODE: "+code+"\n"+result;
	}
}