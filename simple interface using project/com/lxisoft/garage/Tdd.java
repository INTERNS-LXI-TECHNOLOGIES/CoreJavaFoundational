package com.lxisoft.garage;
public class Tdd{
public static void main(String[]args){

Garage garage = new Garage();
garage.name="jshg";
System.out.println(garage.name); 


garage.car[0]= new Car();
garage.car[0].owner="Anilkumar";
System.out.println(garage.car[0].owner);
garage.car[1]= new Car();
garage.car[1].owner="Madhavan";
garage.car[2]= new Car();
garage.car[2].owner="Rajan";

Tyre tyre = new Tyre();
tyre.drive();


}
}