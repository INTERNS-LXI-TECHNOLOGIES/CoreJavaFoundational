public class Tdd
{
public static void main(String ar[])
{
Car car=new Car();
 
 car.setName("Polo");
 car.setColor("Red");
 car.setBrand("Volkswagen");
 System.out.println("\n\t CAR DETAILS");
 System.out.print("\nCar Name: "+car.getName());
 System.out.println("\nCar Colour: "+car.getColor());
 System.out.println("Car Brand: "+car.getBrand());
 
 
 car.getDoor()[0]=new Door();
 
 car.getDoor()[0].setName("Front left side ");
 car.getDoor()[0].setColor("Red");
 
 car.getDoor()[1]=new Door();
 
 car.getDoor()[1].setName("Front right side");
 car.getDoor()[1].setColor("Red");
 
 car.getDoor()[2]=new Door();
 
 car.getDoor()[2].setName("Back left side");
 car.getDoor()[2].setColor("Red");
 
 
car.getDoor()[3]=new Door();

car.getDoor()[3].setName("Back right side");
car.getDoor()[3].setColor("red");


System.out.println("\n\t DOOR DETAILS");


for(int i=0;i<car.getDoor().length;i++)
{
	System.out.println("\nDoor Position: "+car.getDoor()[i].getName());
	System.out.println("Door Colour: "+car.getDoor()[i].getColor());
}
car.getTyre()[0]=new Tyre();

car.getTyre()[0].setPosition("Front left side");
car.getTyre()[0].setSize(110);

car.getTyre()[1]=new Tyre();

car.getTyre()[1].setPosition("Front right side");
car.getTyre()[1].setSize(110);

car.getTyre()[2]=new Tyre();

car.getTyre()[2].setPosition("Back left side");
car.getTyre()[2].setSize(110);

car.getTyre()[3]=new Tyre();

car.getTyre()[3].setPosition("Back right side");
car.getTyre()[3].setSize(110);


System.out.println("\n\t TYRE DETAILS");


for(int i=0;i<car.getTyre().length;i++)
{
	 System.out.println("\nTyre Position: "+car.getTyre()[i].getPosition());
	 System.out.println("Tyre Size: "+car.getTyre()[i].getSize());
}

 car.setSteering (new Steering());

car.getSteering().setColor("Black");

System.out.println("\n\t STEERING DETAILS");

System.out.println("\nColour: "+car.getSteering().getColor());
	
}
}
 