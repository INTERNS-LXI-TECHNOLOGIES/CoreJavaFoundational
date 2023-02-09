public class Tyre extends Part
{
private String model;
private String brand;

public Tyre(String partNumber,String model,String brand)
{
super.partNumber = partNumber;
this.model = model;
this.brand = brand;
}	

public String getModel()
{
return model;	
}
public void setModel(String model)
{
this.model = model;	
}
public String getBrand()
{
return brand;
}

public void String setBrand(String brand)
{
this.brand = brand;
} 	
public String toString()
{
	
return super.toString "Partnumber:" + partNumber +"\t" + "Model:" + model +"\t"+  "Brand:" + brand;
}
}