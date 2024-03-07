public class Vehicle{

private String brand;
private String model;
private String color;

public void setBrand(String brand){
	this.brand=brand;
}

public String getBrand(){
	return brand;
}

public void setModel(String model){
	this.model=model;
}

public String getModel(){
	return model;
}

public void setColor(String color){
	this.color=color;
}

public String getColor(){
	return color;
}

public String toString(){
	return "\n"+getBrand()+"\n"+getModel()+"\n"+getColor();

}






}