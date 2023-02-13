public class Door extends Part
{
private String brand;
private String colour;

public Door( String partNumber, String brand, String colour)
{

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
return super.toString() + "Part Number:" + partNumber + "\n" + "Brand:" + brand + "\n" + "Colour:" + colour ;

}
}