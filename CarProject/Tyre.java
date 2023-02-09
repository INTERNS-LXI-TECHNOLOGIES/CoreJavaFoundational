public class Tyre extends Part
{
private String brand;
private String colour;

public Tyre(String partNumber, String brand, String colour)
{
super.partNumber = partNumber;
this.brand = brand;
this.colour = colour;	
}

public String getBrand()
{
return brand;
}	
public void setBrand(String brand)
{
this.brand = brand;
}

public String getColour()
{
return colour;
}
public void setColour(String colour)
{
this.colour = colour;
}

public String toString()
{
return super.toString "Part Number" + partNumber + "\t" + "Brand:" + brand + "\t" + "Colour:" + colour;	
}
}