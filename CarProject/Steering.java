public class Steering extends Part
{
private String brand;
private double radius;
	
public Steering(String brand, double radius)
{

super.partNumber = partNumber;
this.brand = brand;
this.radius = radius;
}	
	
public String getBrand()
{
return brand;
}
public void setBrand(String brand)
{
this.brand = brand;	
}

public double getRadius()
{
return radius;	
}
public void setRadius(double radius)
{
this.radius = radius;	
}

public String toString()
{
return super.toString + "Brand:"+ brand +"\n" + "Radius:" + radius;
}
}