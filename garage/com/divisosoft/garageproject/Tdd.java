public class Tdd{
public static void main (String[] agrs){
Garage garage=new Garage();
garage.setName("Royal Garage");
garage.setAddress("Pathiripala,Palakkad");
garage.setPhnNo(9874657428L);


String carName[]={"Polo","GT","Swift","Alto 800","BMW X3"};
String carColour[]={"Black","Red","Black","Red","White"};
String carRegNo[]={"KL54N3185","KL6D0258","KL89C558","KL01B8148","KL46M6258"};
    
	for(int i=0,x=0;i<=4;i++){
	 garage.vehicle[i]=new Car();
	 garage.vehicle[i].setName(carName[x]);
	 garage.vehicle[i].setColour(carColour[x]);
	 garage.vehicle[i].setRegNo(carRegNo[x]);
	 x++; 
    }
	
String bikeName[]={"RTR 310","R15","FZ","MT 15","DOMINAR 400"};
String bikeColour[]={"Black","Red","Black","Black","Green"};
String bikeRegNo[]={"KL54N3185","KL6D0258","KL89C558","KL01B8148","KL46M6258"};	
    for(int i=5,x=0;i<10;i++){
	 garage.vehicle[i]=new Bike();
	 garage.vehicle[i].setName(bikeName[x]);
	 garage.vehicle[i].setColour(bikeColour[x]);
	 garage.vehicle[i].setRegNo(bikeRegNo[x]);
	 x++;
    }
	
 for(int i=0;i<=4;i++){
	 ((Car)garage.vehicle[i]).carDetails();
 }
 for(int i=5;i<10;i++){
	 ((Bike)garage.vehicle[i]).bikeDetails();
 }

System.out.println(garage);


}
}