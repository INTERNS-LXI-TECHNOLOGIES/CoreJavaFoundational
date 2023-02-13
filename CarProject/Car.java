public class Car
{
private String model;
private String colour;	
private String variant;
private String registrationNumber;

Part[] parts = new Part[9];

public Car(String model, String colour, String variant, String registrationNumber)
{	
this.model = model;
this.colour = colour;
this.variant = variant;
this.registrationNumber = registrationNumber;
}

public String getModel()
{
return model;
}	
public void setModel(String model)
{
this.model = model;
}

public String getColour()
{
return colour;
}	
public void setColour(String colour)
{
this.colour = colour;
}

public String getVariant()
{
return variant;
}	
public void setVariant(String variant)
{
this.variant= variant;
}

public String getRegistrationNumber()
{
return registrationNumber;
}	
public void setRegistrationNumber(String registrationNumber)
{
this.registrationNumber = registrationNumber;
}



public String toString()
{
return "Model:" + model + "\n" + "Colour:" + colour + "\n" + "Variant:" + variant + "\t" + "Registration Number:" + registrationNumber;
}
}