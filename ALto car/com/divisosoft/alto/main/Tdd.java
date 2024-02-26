package com.divisosoft.alto.main;
import com.divisosoft.alto.Alto.*; 
public class Tdd{
	
	public static void main(String[]args){
		
		Car car = new Car();
		car.colour ="Blue";
		car.warrenty=100;
	     
		 if(car.warrenty>360 || car.warrenty>300){
			 
			 System.out.println("Get extra 20 point");
		 }
		 
		 else if(car.warrenty<250 && car.warrenty>150){
			 
			 System.out.println("Get extra 10 point");
			 
		 }
		 
		 else{
			 
			 System.out.println("Not get extra point");
		 }
		
		car.brandname="Alto";
		//System.out.println("Car brandname is\t:"+car.brandname);
		//System.out.println("Car colur is\t:"+car.colour);
		
		car.mirror = new Mirror();
		car.mirror.brandname="LG";
	   // System.out.println("Car mirror brandname is\t:"+car.mirror.brandname);
		//System.out.println("Car mirror brandname is\t:"+car.mirror.brandname);
		
		car.door[0] = new Door();
		car.door[0].doorOpen();
	 	car.door[0].doorName="altodoor1";
		car.door[0].number="1";
		//System.out.println(car.door[0].doorName);
	   //System.out.println("Car door number is\t:"+car.door[0].number);
		
		car.door[1] =new Door();
		car.door[1].doorName="altocar2";
		car.door[1].number="2";

		//System.out.println("Car door number is\t:"+car.door[1].number);
		
		car.door[2] = new Door();
		car.door[2].number="3";
		car.door[2].doorName="altocar3";
		//System.out.println(car.door[2].doorName);
		//System.out.println("Car dooe number is\t:"+car.door[2].number);
	
		
		car.door[3] = new Door();
		car.door[3].number ="4";
		car.door[3].doorName="altocar4";

		//System.out.println("Car  door number is\t:"+car.door[3].number);
	    
	
	
	
		
		car.body = new Body();
		car.body.colour="Orange";
		//car.body.bodycolour();
		//System.out.println("Car body clour is\t:"+car.body.colour);
		
	    car.tyre[0] = new Tyre();
		car.tyre[0].number ="1";
		//System.out.println("Car tyre number is\t:"+car.tyre[0].number);
		
		car.tyre[1] =new Tyre();
		car.tyre[1].number ="2";
		//System.out.println("Car tyre number is\t:"+car.tyre[0].number);
		
		car.tyre[2] = new Tyre();
		car.tyre[2].number ="3";
		//System.out.println("car tyre number is \t:"+car.tyre[2].number);
		
		car.tyre[3] = new Tyre();
		car.tyre[3].number ="4";
		//System.out.println("car tyre number is\t:"+car.tyre[3].number);
		
		//for(int i=0;i<car.tyre.length;i++){
			//System.out.println("Car tyre number is\t:"+car.tyre[i]);
		//}
		
		car.engine = new Engine();
		car.engine.colour="Red & white";
		
		//System.out.println("Car engine colour is\t:"+car.engine.colour);
		
		car.battery = new Battery();
		car.battery.warrenty="2yr";
		//car.battery.printwarrenty();
		//System.out.println("Car battery warrenty is\t:"+car.battery.warrenty);
		
		car.brek = new Break();
		car.brek.length="30cm";
		//car.brek.breaklength();
		//System.out.println("Car break length is\t:"+car.brek.length);
		
		car.fueltank = new Fueltank();
		car.fueltank.fuel ="Petrol";
		//System.out.println("Car Fuel is\t:"+car.fueltank.fuel);
		
		car.signal[0] = new Signal();
	    car.signal[0].number ="signa1";
		//System.out.println("Car signal number is\t:"+car.signal[0].number);
		
		car.signal[1] = new Signal();
		car.signal[1].number="signal2";
		//System.out.println("Car signal number is\t:"+car.signal[1].number);
			//car.printdoornumber();
			
			
			
		car.redbutton = new Redbutton();
        car.redbutton.colour="Red";	
		car.redbutton.buttonpress=true;
	    car.redbutton.clickButton();
		
	
		
		car.headlight = new Headlight();
		car.headlight.number=2;
		car.headlight.deliverlight();
		car.headlight.addtwonumber(15,20);
		System.out.println(car.headlight.addtwonumber(15,20));
		//System.out.println("Car Headlight number is\t:"+car.headlight.number);
	
	    car.seat = new Seat();
		car.seat.colour="black";
		//System.out.println("Seat colur is\t:"+car.seat.colour);
	    
		car.steiring = new Steiring();
		car.steiring.brandname="volvox";
		car.steiring.colour="black & white";
		car.steiring.number=1;
		//System.out.println(car.steiring.brandname);
         
	  	System.out.println(car);
		
	    car.carmove();
		
				
				
	
	}
	
}