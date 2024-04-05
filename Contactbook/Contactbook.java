public class Contactbook{
 String name;
 long mobNumber;
 String mailId;


public String toCSVFile(){
	return name+","+mobNumber+","+mailId+"\n";
}

public String toString(){
	return name + "," + mobNumber + "," + mailId + "\n";
}










}