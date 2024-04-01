public class Bike extends Vehicle
{
	Tyre[] tyre=new Tyre[2]; 

	public  int Mileage()
	{
		setMileage((int)(Math.random()*80-40)+40);
		return getMileage();
	}



	public String toString()
	{
		String c="";
		for(int i=0;i<tyre.length;i++)
		{
			c+=tyre[i];
		}
		return "\n\n BIKE BRAND : "+super.getBrand()+"\n BIKE NAME  : "+super.getName()+"\n BIKE COLOR : "+super.getColor()+"\n MILEAGE    : "+getMileage()+c;
	}


}