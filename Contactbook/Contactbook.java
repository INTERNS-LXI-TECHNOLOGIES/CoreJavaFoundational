public class Contactbook{
 String name;
 long mobNumber;
 String mailId;

  public void setName(String name){
	  this.name = name;
  }
  
  public String getName(){
	  return this.name;
  }

  public void setMobNumber(long number){
	  this.mobNumber = number;
  }

  public long getMobNumber(){
	  return this.mobNumber;
  }
  
  public void setMailId(String mailId){
	  this.mailId = mailId;
  }
  
  public String getMailId(){
	  return this.mailId;
  }

  


public String toCSVFile(){
	return name+","+mobNumber+","+mailId+"\n";
}

public String toString(){
	return getName() + "," + getMobNumber() + "," + getMailId() + "\n";
}










}