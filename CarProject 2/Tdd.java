public class Tdd
{
public static void main(String ar[])
{
	Car car=new Car();
	
	car.name="Beleno";
	car.color="Black";
	car.brand="Maruti Suzuki";
	
	car.door[0]=new Door();
	
	car.door[0].name="Front left side";
	car.door[0].color="Black";
	
	car.door[1]=new Door();
	
	car.door[1].name="Front right side";
	car.door[1].color="Black";
	
	car.door[2]=new Door();
	
	car.door[2].name="Back left side";
	car.door[2].color="Black";
	
	car.door[3]=new Door();
	
	car.door[3].name="Back right side";
	car.door[3].color="Black";
	
	
	car.tyre[0]=new Tyre();
	
	car.tyre[0].position="Front left side";
	car.tyre[0].size=110;
	car.tyre[0].brand="Bridgestone";
	
	car.tyre[1]=new Tyre();
	
	car.tyre[1].position="Front right side";
	car.tyre[1].size=110;
	car.tyre[1].brand="MRF";
	
	car.tyre[2]=new Tyre();
	
	car.tyre[2].position="Back left side";
	car.tyre[2].size=110;
	car.tyre[2].brand="yokohama";
	
	car.tyre[3]=new Tyre();
	
	car.tyre[3].position="Back right side";
	car.tyre[3].size=110;
	car.tyre[3].brand="Michelin";
	
	car.steering=new Steering();
	
	car.steering.color="Black";
	
	System.out.println("\n\tCAR DETAILS");
	
	System.out.println("\nCAR NAME : "+car.name);
	System.out.println("COLOUR : "+car.color);
	System.out.println("BRAND : "+car.name);
	
	System.out.println("\n\tDOOR DETAILS");
	
	
	for(int i=0;i<car.door.length;i++)
	{
	System.out.println("\nDOOR POSITION: "+car.door[i].name);
	System.out.println("DOOR COLOUR: "+car.door[i].color);
	}
	
	System.out.println("\n\tTYRE DETAILS");
	
	for(int i=0;i<car.tyre.length;i++)
	{
	System.out.println("\nTYRE POSITION: "+car.tyre[i].position);
	System.out.println("TYRE SIZE: "+car.tyre[i].size);
	System.out.println("TYRE BRAND: "+car.tyre[i].brand);
	}
	
	
	System.out.println("\n\tSTEERING DETAILS");
	
	System.out.println("\nTYRE POSITION: "+car.steering.color);
}
}
	
	
	
	