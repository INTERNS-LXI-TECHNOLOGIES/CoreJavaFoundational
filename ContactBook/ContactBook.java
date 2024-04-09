public class ContactBook{

	private String name;
	private long phoneNumber;
	private String emailId;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public long getphoneNumber(){
		return phoneNumber;
	}
	
	public void setEmailId(String emailId){
		this.emailId = emailId;
	}
	public String getEmailId(){
		return emailId;
	}
}