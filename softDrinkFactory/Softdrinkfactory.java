public class Softdrinkfactory{

	private String name;
	private long phnum;
	private Softdrink[] softdrink = new Softdrink[10];
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public long getPhnum(){
		return phnum;
	}
	public void setPhnum(long phnum){
		this.phnum=phnum;
	}
	
	public String toString(){
		System.out.println("\t	FACTORY DETAILS	\n");
		return "FACTORY NAME: "+name+"\n"+"FACTORY PH.NUMB: "+phnum;
	}
	
}