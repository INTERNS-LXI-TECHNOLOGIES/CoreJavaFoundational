import java.util.ArrayList;
public class Tdd{

public static void main(String[]args){
	
 ArrayList<Car> car = new ArrayList<>();
  
  // Adding car details directly without using methode
  
  Car car1 = new Car();
  car1.make="Toyota";
  car1.modal="camry";
  car1.year=2022;
  car1.colour="Red";
  car1.ragNumber="1";
  //cars.add(car1);
  
  Car car2 = new Car();
  car2.ragNumber="2";
  car2.make="Honda";
  car2.modal="Accord";
  car2.year=2020;
  car2.colour="Blue";
  //cars.add(car2);
  
  Car car3 = new Car();
  car3.make="Ford";
  car3.ragNumber="2";
  car3.modal="mustang";
  car3.year=2021;
  car3.colour="black";
 // cars.add(car3);


  Car car4 = new Car();
  car4.make="Alto";
  car4.modal="maruthi";
  car4.year=214;
  car4.colour="white";
  //cars.add(car4);
  
  

//print all Car details

  for (Car car :cars){
	  if(car.equals(car1)){
		 cars.add(car1);
	  }
	  else
	  {
		System.out.println("alresdy exist");
	  }
	  
	System.out.println(cars);
  }  


} 
}