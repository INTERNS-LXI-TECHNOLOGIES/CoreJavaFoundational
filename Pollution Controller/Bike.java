public class  Bike extends Vehicle
{

private String brand;

public String getBrand()
    {
	  return brand;
    }
    public void setBrand(String brand)
        {
	      this.brand = brand;
		}

public String toString()
{
	
return "Brand:" + brand + "\n"+
        super.toString();	
	
}
}
