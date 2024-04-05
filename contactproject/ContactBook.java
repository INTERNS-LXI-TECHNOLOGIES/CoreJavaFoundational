public class ContactBook{
	private String name;
	private long phnNo;
	private String email;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public long getPhnNo(){
		return phnNo;
	}
	public void setPhnNo(long phnNo){
		this.phnNo=phnNo;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	public String toString(){
		return name+"\n"+phnNo+"\n"+email;
	}

}