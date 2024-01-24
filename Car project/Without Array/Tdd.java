public class Tdd{
	
public static void main(String[]argc){
	
Car car = new Car();
car.brand = "Land Rover";
car.model = "Defender";
car.colour = "White";
System.out.println("  CAR DETAILS   ");
System.out.println(car.brand);
System.out.println(car.model);
System.out.println(car.colour);

car.steering = new Steering();
car.steering.name = "JLR";
car.steering.colour = "Beige";
System.out.println("\n"+"Steering Details");
System.out.println(car.steering.name);
System.out.println(car.steering.colour);

car.d1 = new Door();
car.d1.size = 15;
car.d1.colour = "White";
System.out.println("\n"+"Door Details");
System.out.println("Front Right Door");
System.out.println(car.d1.size+"\n"+car.d1.colour);

car.d2 = new Door();
car.d2.size = 15;
car.d2.colour = "White";
System.out.println("\n"+"Front Left Door");
System.out.println(car.d2.size+"\n"+car.d2.colour);

car.d3 = new Door();
car.d3.size = 15;
car.d3.colour= "White";
System.out.println("\n"+"Back Right Door");
System.out.println(car.d3.size+"\n"+car.d3.colour);

car.d4 = new Door();
car.d4.size = 15;
car.d4.colour = "White";
System.out.println("\n"+"Back Left Door");
System.out.println(car.d4.size+"\n"+car.d4.colour);

car.t1 = new Tyre();
car.t1.brand = "Yokohama";
car.t1.size = "280/80/R20";
System.out.println("\n"+"Tyre Details");
System.out.println("Front Right Tyre"+"\n"+car.t1.brand+"\n"+car.t1.size);

car.t2 = new Tyre();
car.t2.brand = "Yokohama";
car.t2.size = "280/80/R20";
System.out.println("\n"+"Front Left Tyre"+"\n"+car.t2.brand+"\n"+car.t2.size);


car.t3 = new Tyre();
car.t3.brand = "Michelin";
car.t3.size = "280/80/R20";
System.out.println("\n"+"Back Right Tyre"+"\n"+car.t3.brand+"\n"+car.t3.size);

car.t4 = new Tyre();
car.t4.brand = "Yokohama";
car.t4.size = "280/80/R20";
System.out.println("\n"+"Back Left Tyre"+"\n"+car.t4.brand+"\n"+car.t4.size);





}


}