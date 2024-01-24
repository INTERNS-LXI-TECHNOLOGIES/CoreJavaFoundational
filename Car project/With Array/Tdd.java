public class Tdd{

public static void main(String[]args){

Car car = new Car();
car.brand = "Land Rover";
car.model = "Range Rover Evoque";
car.colour = "Red";
System.out.println("    CAR DETAILS"+"\n"+car.brand+"\n"+car.model+"\n"+car.colour);

car.steering = new Steering();
car.steering.name = "JLR";
car.steering.colour = "Beige";
System.out.println("\n"+"Steering Details");
System.out.println(car.steering.name+"\n"+car.steering.colour);


car.door[0]=new Door();
car.door[0].size=15;
car.door[0].colour= "Red";
System.out.println("\n"+"Door Details"+"\n"+"Right Front Door");
System.out.println(car.door[0].size+"\n"+car.door[0].colour);

car.door[1]= new Door();
car.door[1].size=15;
car.door[1].colour= "Red";
System.out.println("\n"+"Left Front Door");
System.out.println(car.door[1].size+"\n"+car.door[1].colour);

car.door[2] = new Door();
car.door[2].size = 15;
car.door[2].colour= "Red";
System.out.println("\n"+"Right Back Door");
System.out.println(car.door[2].size+"\n"+car.door[2].colour);

car.door[3] = new Door();
car.door[3].size = 15;
car.door[3].colour= "Red";
System.out.println("\n"+"Left Back Door");
System.out.println(car.door[3].size+"\n"+car.door[3].colour);

car.tyre[0] = new Tyre();
car.tyre[0].brand= "Pirelli";
car.tyre[0].size = "300/100/R20";
System.out.println("\n"+"Tyre Details"+"\n"+"Front Right Tyre");
System.out.println(car.tyre[0].brand+"\n"+car.tyre[0].size);

car.tyre[1] = new Tyre();
car.tyre[1].brand = "Pirelli";
car.tyre[1].size = "300/100/R20";
System.out.println("\n"+"Front Left Tyre"+"\n"+car.tyre[1].brand+"\n"+car.tyre[1].size);


car.tyre[2] = new Tyre();
car.tyre[2].brand = "Pirelli";
car.tyre[2].size = "300/100/R20";
System.out.println("\n"+"Back Right Tyre"+"\n"+car.tyre[2].brand+"\n"+car.tyre[2].size);

car.tyre[3] = new Tyre();
car.tyre[3].brand = "Pirelli";
car.tyre[3].size = "300/100/R20";
System.out.println("\n"+"Back Left Tyre"+"\n"+car.tyre[3].brand+"\n"+car.tyre[3].size);

}
}