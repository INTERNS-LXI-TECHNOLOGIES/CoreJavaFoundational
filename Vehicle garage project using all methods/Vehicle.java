public class Vehicle{
private String name;
private String color;

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setColor(String color){
	this.color=color;
}
public String getColor(){
	return color;
}
public String toString(){
	
	return name+"\n"+color+"\n";
}


}

