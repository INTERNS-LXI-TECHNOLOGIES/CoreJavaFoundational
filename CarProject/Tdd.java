public class Tdd
{
public static void main(String[] args){
Car car = new Car ();
car.setName("polo");
car.setColour("colour  -  blue");
System.out.println("\n"+car);


car.door[0]= new Door();
car.door[0].setDoorName("Door 1  -  Left side");
car.door[0].setColour("blue");
System.out.println("\n"+car.door[0]);

car.door[1]=new Door();
car.door[1].setDoorName("Door 2  -  Left side");
car.door[1].setColour("blue");
System.out.println("\n"+car.door[1]);

car.door[2]=new Door();
car.door[2].setDoorName("Door 3  -  Right side");
car.door[2].setColour("blue");
System.out.println("\n"+car.door[2]);

car.door[3]=new Door();
car.door[3].setDoorName("Door 4  -  Right side");
car.door[3].setColour("blue");
System.out.println("\n"+car.door[3]);



car.tyre[0] = new Tyre();
car.tyre[0].setName("MRF  -  ");
car.tyre[0].setTyre("Tyre 1");
System.out.println("\n"+car.tyre[0]);

car.tyre[1] = new Tyre();
car.tyre[1].setName("MRF  -  ");
car.tyre[1].setTyre("Tyre 2");
System.out.println("\n"+car.tyre[1]);

car.tyre[2] = new Tyre();
car.tyre[2].setName("MRF  -  ");
car.tyre[2].setTyre("Tyre 3"); 
System.out.println("\n"+car.tyre[2]);

car.tyre[3] = new Tyre();
car.tyre[3].setName("MRF  -  ");
car.tyre[3].setTyre("Tyre 4");
System.out.println("\n"+car.tyre[3]);

car.window[0] = new Window ();
car.window[0].setWindow("Window - Left Side");
car.window[0].setSize(10);
System.out.println("\n"+car.window[0]);

car.window[1] = new Window ();
car.window[1].setWindow("Window - Left Side");
car.window[1].setSize(10);
System.out.println("\n"+car.window[1]);

car.window[2] = new Window ();
car.window[2].setWindow("Window - Right Side");
car.window[2].setSize(10);
System.out.println("\n"+car.window[2]);

car.window[3] = new Window ();
car.window[3].setWindow("Window - Right Side");
car.window[3].setSize(10);
System.out.println("\n"+car.window[3]);



} 
}
