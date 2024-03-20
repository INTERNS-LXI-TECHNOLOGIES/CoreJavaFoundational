public class Tdd
{
	public  static void main(String[] args)
	{
		Car car=new Car();
		car.setName("SWIFT");
		car.setColor("RED");
		car.setBrand("MARUTI SUZUKI");
		
		System.out.println("\n\t CAR DETAILS");
		System.out.println(car.toString());
	
		System.out.println("\n\tDOOR DETAILS");
		
		
		
		car.door[0]=new Door();
		
		car.door[0].setName("Front left side");
		car.door[0].setColor("Red");
		
		car.door[1]=new Door();
		
		car.door[1].setName("Front right side");
		car.door[1].setColor("Red");
		
		car.door[2]=new Door();
		
		car.door[2].setName("Back left side");
		car.door[2].setColor("Red");
		
		car.door[3]=new Door();
		
		car.door[3].setName("Back right side");
		car.door[3].setColor("Red");
		
		for(int i=0;i<car.door.length;i++)
		{
		System.out.println(car.door[i].toString());
		}
		
		
		
		car.tyre[0]=new Tyre();
		
		car.tyre[0].setPosition("Front left side");
		car.tyre[0].setBrand("Yokohama");
		car.tyre[0].setSize(100);
		
		car.tyre[1]=new Tyre();
		
		car.tyre[1].setPosition("Front right side");
		car.tyre[1].setBrand("MRF");
		car.tyre[1].setSize(100);
		
		car.tyre[2]=new Tyre();
		
		car.tyre[2].setPosition("Back left side");
		car.tyre[2].setBrand("Michelin");
		car.tyre[2].setSize(100);
		
		
		car.tyre[3]=new Tyre();
		
		car.tyre[3].setPosition("Back right side");
		car.tyre[3].setBrand("Bridgestone");
		car.tyre[3].setSize(100);
		
		System.out.println("\n\tTYRE DETAILS" );
		
		for(int i=0;i<car.tyre.length;i++)
		{
			System.out.println(car.tyre[i].toString());
		}
	
		
		car. steering=new Steering();
		
		car.steering.setColor("Black");
		
		System.out.println("\n\t STEERING DETAILS");		
		

     System.out.println(car.steering.toString());	 
	
	}
}