package com.divisosoft.car;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
public class Tdd
{
 public static void main(String[] args) throws FileNotFoundException,IOException
 {
	Car<Part> carGarage = new Car<>("polo");
	Part door = new Door();
	door.setModelNo(12);
	door.getModelNo();
	((Door)door).setColour("blue");
	((Door)door).getColour();
	
	Part tyre = new Tyre();
	tyre.setModelNo(113);
	((Tyre)tyre).setSize(10);
	
	Part tyre1 = new Tyre();
	tyre1.setModelNo(130);
	((Tyre)tyre1).setSize(10);
	
	Part steering = new Steering();
	steering.setModelNo(200);
	((Steering)steering).setDesignerName("BoB12");
	
		carGarage.list.add(door);
		carGarage.list.add(tyre);
		carGarage.list.add(tyre1);

			carGarage.list = carGarage.list.stream()
			.filter(par -> par instanceof Door)
			.collect(Collectors.toList());
				
				carGarage.list.forEach(part ->   // with Streams lamda expression
				{ 
				System.out.println( carGarage);
				System.out.println( door);
				System.out.println( tyre);
				System.out.println( tyre1);
                System.out.println( steering);
            
							try
								{	
									FileReader file = new FileReader("D:\\Lxi\\CoreJava\\CarProjectTask1\\versionone\\com\\divisosoft\\car\\MOCK_DATA (1).csv") ;
									Scanner scanner = new Scanner(file);
		
								while (scanner.hasNextLine()) 
								{
									String data = scanner.nextLine();
									System.out.println(data);
								}
								}
									catch(FileNotFoundException e)
									{
										e.printStackTrace();      
									}	
	
				});
			carGarage.start();
			carGarage.drive();
			carGarage.accelerate();
			carGarage.brake();
			carGarage.turnOnLight();
			carGarage.turnOffLight();
			carGarage.horn();
			carGarage.checkFuelLevel();
			carGarage.openWindows();
			carGarage.closeWindows();
			carGarage.stop();
 }	
}  
		  
		 
		 
	