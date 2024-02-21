package com.divisosoft.bike;
public class Tdd{
	
	public static void main(String[]args){
		
		Bike bike = new Bike();
		bike.model="Pulsar";
		bike.colour="Black";
		//System.out.println("Model name of bike is\t:"+bike.model);
		//System.out.println("colour of bike is\t:"+bike.colour);

	 
		bike.seat = new Seat();
		bike.seat.colour="Red";
		bike.seat.brandname="Sello";
		bike.seat.length=100;
	    //System.out.println("Bike seat colour is\t:"+bike.seat.colour);
		//System.out.println("Brand name of seat is\t:"+bike.seat.brandname);
		//System.out.println("Seat length is \t:"+bike.seat.length);
		
		bike.tyre = new Tyre();
		bike.tyre.brandname ="MRF";
		bike.tyre.tyrewidth="215/615R17";
		//System.out.println("Tyre brandname is\t:"+bike.tyre.brandname);
		//System.out.println("Tyre width of bike is \t:"+bike.tyre.tyrewidth);
		
		bike.engine = new Engine();
		bike.engine.enginename="Pulsarengine";
		//System.out.println("Bike Engine name is\t:"+bike.engine.enginename);
		
		bike.engine.cylinderengine =new Cylinderengine();
		bike.engine.cylinderengine.feature="2T/4T";
		//System.out.println("Cylinderengine feature is \t:"+bike.engine.cylinderengine.feature);
		
		bike.battery= new Battery();
		bike.battery.brandname="Yuvasa";
		//System.out.println("Brand name of bike battery is \t:"+bike.battery.brandname);
		
		bike.mirror = new Mirror();
		bike.mirror.mirrorcolour="black & White";
		bike.mirror.mirrornumber=2;
		//System.out.println("Mirror number is\t:"+bike.mirror.mirrornumber);
		//System.out.println("Mirror colourname is\t:"+bike.mirror.mirrorcolour);
		
		bike.speedmeter = new Speedmeter();
		bike.speedmeter.glassname= new Glass();
		bike.speedmeter.glassname.brandname="Philips";
		bike.speedmeter.name="ajin";
		//System.out.println("bike speedmeter glass brandname\t:"+bike.speedmeter.glass.brandname);
		
		bike.fueltank = new Fueltank();
		bike.fueltank.fuelname="Petrol";
		//System.out.println("Bike fueltank Fuel is \t:"+bike.fueltank.fuelname);
		
		bike.signal= new Signal();
		bike.signal.rightsignal=new Rightsignal();
		bike.signal.leftsignal =new Leftsignal();
		bike.signal.leftsignal.leftsignalcolour="Orange & black";
		bike.signal.rightsignal.signalcolour ="Orange & black";
		//System.out.println("Rightsignal colour is \t:"+bike.signal.rightsignal.signalcolour);
		//System.out.println("Left signal colour is\t:"+bike.signal.leftsignal.leftsignalcolour);
		
		bike.wheal = new Wheal();
		bike.wheal.brandname ="hero Grand";
		
		bike.breaks = new Breakes();
		bike.breaks.breaknumber=2;
		bike.breaks.breakecolour="White";
	

     	System.out.println(bike);
		System.out.println("Bike of wheal name is\t:"+bike.wheal.brandname);
		System.out.println("Bike of breake number is\t:"+bike.breaks.breaknumber);
		System.out.println("bike of breakecolour is\t:"+bike.breaks.breakecolour);

		System.out.println(bike.seat);
		System.out.println(bike.tyre);
		System.out.println(bike.engine);
		System.out.println(bike.battery);
		System.out.println(bike.mirror);
		System.out.println(bike.fueltank);
		//System.out.println(bike.signal);
			
			
			
			
		
	}
}