public class File{
private String name;
private int year;
//Contact[] contact= new Contact[6];

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setYear(int year){
	this.year=year;
}
public int getYear(){
	return year;
}
 public String toString() {
        return  name + "\n" +""+ year + "\n";
    }
}