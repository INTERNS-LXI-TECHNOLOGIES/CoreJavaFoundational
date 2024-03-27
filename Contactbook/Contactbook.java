public class Contactbook{

private String name;
private long number;
private String mailId;

   public void setName(String name){
	this.name=name;
    }

public String getName(){
	return this.name;
}

   public void setMailId(String id){
	this.mailId=id;
   }

public String getMailId(){
	return this.mailId;
}

   public void setNumber(long number){
	this.number=number;
   }

public long getNumber(){
	return this.number;
}

  public String toString() {
    return "/n" + getName() + "\n" + getNumber() + "\n" + getMailId();
}

























}