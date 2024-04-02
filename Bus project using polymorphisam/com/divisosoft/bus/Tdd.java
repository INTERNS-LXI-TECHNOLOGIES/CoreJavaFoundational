package com.divisosoft.bus;
public class Tdd{

public static void main(String[]args){
	
	Bus bus = new Bus();
	bus.colour="red";
	System.out.println(bus.colour);
	
	bus.part[0] = new Door();
	bus.part[0].colour="green";
	bus.part[0].brandName="Mahindra";
	((Door)bus.part[0]).length=40;
	System.out.println(((Door)bus.part[0]).length);
	
	
	bus.part[1]= new Door();
	bus.part[1].colour="green";
	bus.part[1].brandName="Mahindra";
	((Door)bus.part[1]).length=40;
	
	


	
	bus.part[2]= new Door();
	bus.part[2].colour="green";
	bus.part[2].brandName="Mahindra";
	((Door)bus.part[2]).length=40;

    bus.part[3]= new Tyre();
	bus.part[3].colour="black";
	bus.part[3].brandName="MRF";
	((Tyre)bus.part[3]).weight=110;
	
	bus.part[4]= new Tyre();
	bus.part[4].colour="black";
	bus.part[4].brandName="MRF";
	((Tyre)bus.part[4]).weight=110;
	
	bus.part[5]= new Tyre();
	bus.part[5].colour="black";
	bus.part[5].brandName="MRF";
	((Tyre)bus.part[5]).weight=110;
	
	bus.part[6] = new Tyre();
	bus.part[6].colour="black";
	bus.part[6].brandName="MRF";
	((Tyre)bus.part[6]).weight=110;
	
	bus.part[7]= new Steering();
	bus.part[7].colour="gray";
	bus.part[7].brandName="Volvax";	
	((Steering)bus.part[7]).shape="Circle";
	
	
	//System.out.println(bus);
	
	bus.part[0].addSum(14,5);
	((Door)bus.part[0]).addSum(50,52,7);
	
	((Steering)bus.part[7]).addSum(45,25,14,14,2);
	
	
	
	System.out.println("dbbsdkk\t:"+bus.part[0].addSum(14,5));
	System.out.println("dhhhhksdah\t:"+((Door)bus.part[0]).addSum(50,52,5));
	
	System.out.println("dshskda \t:"+((Tyre)bus.part[3]).addSum(20,40,77,5));
	
	System.out.println("jhsgdajg \t:"+((Steering)bus.part[7]).addSum(45,25,14,14,2));
	
	
				
}

}