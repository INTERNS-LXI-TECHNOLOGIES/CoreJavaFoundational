public class Contact{
String name;
long number;

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setNumber(long number){
	this.number=number;
}
public long getNumber(){
	return number;
}

    public String toString() {
        return  name + "\n"+"" + number + "\n";
    }

}