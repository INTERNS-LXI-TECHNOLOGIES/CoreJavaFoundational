public class Main
{
public static void main(String[] args)
{
	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CAR DETAILS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 Car car = new Car();
	 car.model = 2014;
	 car.name ="VolksWagen";
	 car.colour ="black";
	 car.fix();
	
	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DOOR DETAILS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	for(int i = 0;i<3;i++)
	{
       car.doors[i]= new Door();   
       ((Door)car.doors[i]).name = "polo"+i;  //((Door)car).doors[i].name = "polo"+i;
       ((Door)car.doors[i]).colour = "orange"+i;
        car.doors[i].partNo = 4+i;
		car.parts[i]= car.doors[i];
        ((Door)car.parts[i]).doorsDetails();
	}	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~TYRE DETAILS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	for(int j =4,i=0;j<7;j++,i++)
	{
     car.tyres[i] = new Tyre();
     ((Tyre)car.tyres[i]).name = "MRF"+j;
     ((Tyre)car.tyres[i]).colour = "black"+j;
      car.tyres[i].partNo = 4+j;
	  car.parts[j]=car.tyres[i];
     ((Tyre)car.parts[j]).tyresDetails();
	}
	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~STEERING DETAILS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 car.s = new Steering();
     car.s.name =  "GT";
     car.s.colour = "blue";
     car.s.partNo = 1;
     car.s.printSteeringDetails();
	
}
}