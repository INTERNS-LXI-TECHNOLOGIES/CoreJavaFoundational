public class Supermarket{
private String name;
private String address;
private long contactno;
Staff[] staff =new Staff[10];

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}

public void setAddress(String address){
	this.address=address;
}
public String getAddress(){
	return address;
}

public void setContactno(long contactno){
	this.contactno=contactno;
}
public long getContactno(){
	return contactno;
}

public String toString(){
	
	String result="";
	
	for (int i=0;i<staff.length;i++){
		result+=staff[i];
	}
	return "Shop name: \t "+name+"\n"+"Shop Address: \t"+address+"\n"+"Shop contactno: \t"+contactno+"\n"+result+"\n";
}

}