public class Main
{
public static void main(String[] args)
{
		   
	 System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~CAR NAME~~~~~~~~~~~~~~~~~~~~~~");
	
    Car car = new Car();
	car.name = "MercedesBenz";
		  
		  System.out.println(car.name);
		  
	System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~~~DOOR~~~~~~~~~~~~~~~~~~~~~~~~");
		Door door= new Door();
    car.doors[0] = new Door();
    car.doors[0].name = "gilli";
    car.doors[0].size = 22;
	
	car.doors[1] = new Door();
    car.doors[1].name = "milli";
    car.doors[1].size = 24;
	
	car.doors[2] = new Door();
    car.doors[2].name = "villi";
    car.doors[2].size = 26;
	
	car.doors[3] = new Door();
    car.doors[3].name = "Alli";
    car.doors[3].size = 28;
	
	 for(Door d:car.doors){
	System.out.println(d);
	 }

System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~STEERING~~~~~~~~~~~~~~~~~~~~~~"); 
    Steering steering = new Steering();
    steering.name = "mass";
	  
	  
	System.out.println(steering);
	   
	   
	    System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~~~TYRE~~~~~~~~~~~~~~~~~~~~~~~~"); 
		
	  Tyre tyre = new Tyre();
     car.tyres[0] = new Tyre();
     car.tyres[0].name = "MRF";
     car.tyres[0].tyrecount = 1;
	 
	 car.tyres[1] = new Tyre();
     car.tyres[1].name = "APOLLO";
     car.tyres[1].tyrecount = 2;
	 
	 car.tyres[2] = new Tyre();
     car.tyres[2].name = "CEAT";
     car.tyres[2].tyrecount = 3;
	 
	 car.tyres[3] = new Tyre();
     car.tyres[3].name = "STONE";
     car.tyres[3].tyrecount = 4;
	 
	 for(Tyre t:car.tyres){
	System.out.println(t);
	 }
	
	//System.out.println(tyre);
	 
  }
}