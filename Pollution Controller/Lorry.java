public class  Lorry extends Vehicle 
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
	
return "Brand" + brand+super.toString();	
	
}

	
}