public class Car 
{
private String model;
private String name;
private String registrationNumber;
private String colour;

Part[] part = new Part[9];

public Car(String partNumber,String model,String name,String registerNumber,String colour)
{
super.partNumber = partNumber;
this.model = model;
this.name = name;
this.registrationNumber = registrationNumber;
this.colour = colour; 	
}
public String getModel()
{
return model; 
}
public void setModel(String model)
{
this.model = model;
}
public String getName()
{
return name; 
}
public void setName(String name)
{
this.name = name;
}
public String getregistrationNumber()
{
return registrationNumber; 
}
public void setregistrationNumber(String registrationNumber)
{
this.registrationNumber = registrationNumber;
}
public String getColour()
{
return colour; 
}
public void setcolour(String colour)
{
this.colour = colour;
}
public Stirng toString()
{
return  "Model:" + model + "\t" + "name:" + name + "\t"+ "Registernumber:" + "\t" + registerNumber + "\t" + "Colour:" + colour;	
}	
}