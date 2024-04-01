public class Car extends Vehicle
{

	Tyre[] tyre=new Tyre[4];

	
	public int Mileage()
	{
		setMileage((int)(Math.random()*25-10+1)+10);
		
		return getMileage();
		
	}



	
	
	public String toString()
	{	
		String a="";
	
	for(int i=0;i<tyre.length;i++)
	{
		a+=tyre[i];
	}
		return  "\n\n CAR BRAND  : "+super.getBrand()+"\n CAR NAME   : "+super.getName()+"\n CAR COLOUR : "+super.getColor()+"\n MILEAGE    : "+getMileage()+a;
	}
}