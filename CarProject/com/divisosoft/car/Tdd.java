package com.divisosoft.car;
public class Tdd
{
public static void main(String[]args)
{
Car car = new Car();  
car.ownerName="ARSHAF";
car.initial="M";
car.carColour="RED";
car.chassisNumber=7856512;
car.printMethod();

car.door[0] = new Door();
car.door[0].name="OME";
car.door[0].colour="RED";
car.door[0].printMethod();



car.door[1] = new Door();
car.door[1].name="OME";
car.door[1].colour="RED";
car.door[1].printMethod();



car.door[2] = new Door();
car.door[2].name="OME";
car.door[2].colour="RED";
car.door[2].printMethod();

car.door[3] = new Door();
car.door[3].name="OME";
car.door[3].colour="RED";
car.door[3].printMethod();

car.tyre[0] = new Tyre();
car.tyre[0].name="Apollo";
car.tyre[0].printMethod();

car.tyre[1] = new Tyre();
car.tyre[1].name="Apollo";
car.tyre[0].printMethod();

car.tyre[2] = new Tyre();
car.tyre[2].name="Apollo";
car.tyre[0].printMethod();

car.tyre[3] = new Tyre();
car.tyre[3].name="Apollo";
car.tyre[0].printMethod();


Steering steering = new Steering();
steering.name="ERC";
steering.colour="Black";
steering.printMethod();
}
}