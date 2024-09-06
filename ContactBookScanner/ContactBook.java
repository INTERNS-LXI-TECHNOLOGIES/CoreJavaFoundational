public class ContactBook{
	private String name;
	private long phnumber;
	private String emailid;
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name =name;
	}
	
	public long getPhnumber(){
		return this.phnumber;
	}
	public void setPhnumber(long phnumber){
		this.phnumber =phnumber;
	}
	
	public String getEmailid(){
		return this.emailid;
	}
	public void setEmailid(String emailid){
		this.emailid =emailid;
	}
	
	public String toString(){
		return "NAME: "+name+"\n"+"PH.NUMBER: "+phnumber+"\n"+"EMAIL ID: "+emailid+"\n";
	}
}