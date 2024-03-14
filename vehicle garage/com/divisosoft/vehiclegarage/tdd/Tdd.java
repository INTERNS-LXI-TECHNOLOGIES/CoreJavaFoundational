package com.divisosoft.vehiclegarage.tdd;
import com.divisosoft.vehiclegarage.vehicle.Vehicle;

import com.divisosoft.vehiclegarage.garage.Garage;
import com.divisosoft.vehiclegarage.motorcycle.MotorCycle;
import com.divisosoft.vehiclegarage.car.Car;



public class Tdd{
public static void main(String [] args){
	
System.out.println("");
System.out.println("*******Details of garage*******");
System.out.println("");

Garage garage=new Garage();
garage.setName("JANATHA GARAGE");
garage.setAddress("Pathripala palakkad ");
garage.setPhnno(9678436231L);


String carBrand[]={"Audi","Maruthi","Benz","polo","Toyoto"};
String colors[]={"red","white","silver","green","black"};
String regno[]={"kL51324","kL41342","kL14342","kL6A123","kL16000"};

for(int i=0,q=0;i<=4;i++){
garage.vehicle[i] =new Car();


garage.vehicle[i].setName(carBrand[q]);
garage.vehicle[i].setColor(colors[q]);
garage.vehicle[i].setRegno(regno[q]);
((Car)garage.vehicle[i]).checkIsTaxi();
q++;
}

String bikeBrand[]={"Enfield","yamaha","pulsar","honda","splender"};

for(int i=5,q=0;i<10;i++){
garage.vehicle[i] =new MotorCycle();
garage.vehicle[i].setName(bikeBrand[q]);
garage.vehicle[i].setColor(colors[q]);
garage.vehicle[i].setRegno(regno[q]);
((MotorCycle)garage.vehicle[i]).checkIsGeared();
q++;
}
//System.out.println(garage);
garage.showCar();

garage.showMotorcycle();

}
}
