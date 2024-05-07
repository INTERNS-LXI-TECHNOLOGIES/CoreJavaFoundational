package com.lxisoft.garage.controller;
import com.lxisoft.garage.model.*;

public class Vehicleinfo
{

	public void printGarage(){
		
	Garage garrage=new Garage();

	
	garrage.setName("BABS AUTOMOTIVE");
	
	garrage.setPlace("Ottapalam");
	
	garrage.setPin(679102);
	
	garrage.getVehicle()[0]=new Car();
	
	garrage.getVehicle()[0].setBrand("TOYOTA");
	
	garrage.getVehicle()[0].setModel("Supra");
	
	garrage.getVehicle()[0].setRegisterno("KL 51 A 7777");
	
	int mileage1 =(int)(Math.random()*5)+10 ;
	
	garrage.getVehicle()[0].setMileage(mileage1);
	
	
		if(garrage.getVehicle()[0].getMileage()%2!=0)
				{
					garrage.getVehicle()[0].setInsurence(true);	
				}
				else
				{
					garrage.getVehicle()[0].setInsurence(false);
				}
				
					
	
	garrage.getVehicle()[1]=new Car();
	
	garrage.getVehicle()[1].setBrand("NISSAN");
	
	garrage.getVehicle()[1].setModel("GTR");
	
	garrage.getVehicle()[1].setRegisterno("KL 51 D 5656");
	
	int mileage2 =(int)(Math.random()*5)+10 ;
	
	garrage.getVehicle()[1].setMileage(mileage2);
	
		if(garrage.getVehicle()[1].getMileage()%2!=0)
				{
					garrage.getVehicle()[1].setInsurence(true);
				}
				else
				{
					garrage.getVehicle()[1].setInsurence(false);
				}
	
	
	
	
	garrage.getVehicle()[2]=new Car();
	
	garrage.getVehicle()[2].setBrand("Isuzu");
	
	garrage.getVehicle()[2].setModel("v-cross");
	
	garrage.getVehicle()[2].setRegisterno("KL 51 R 38");
	
	int mileage3 =(int)(Math.random()*8)+12 ;
	
	garrage.getVehicle()[2].setMileage(mileage3);
	
	
	
	if(garrage.getVehicle()[2].getMileage()%2!=0)
				{
					garrage.getVehicle()[2].setInsurence(true);
				}
				else
				{
					garrage.getVehicle()[2].setInsurence(false);
				}
	
	
	
	
	garrage.getVehicle()[3]=new Car();
	
	garrage.getVehicle()[3].setBrand("BMW");
	
	garrage.getVehicle()[3].setModel("M4");
	
	garrage.getVehicle()[3].setRegisterno("KL 51 C 5555");
	
	int mileage4 =(int)(Math.random()*7)+13 ;
	
	garrage.getVehicle()[3].setMileage(mileage4);
	
	
	
	if(garrage.getVehicle()[3].getMileage()%2!=0)
				{
					garrage.getVehicle()[3].setInsurence(true);
				}
				else
				{
					garrage.getVehicle()[3].setInsurence(false);
				}
	
	
	
	
	
	
	garrage.getVehicle()[4]=new Car();
	
	garrage.getVehicle()[4].setBrand("MAHINDRA");
	
	garrage.getVehicle()[4].setModel("Thar");
	
	garrage.getVehicle()[4].setRegisterno("KL 55 B 4525");
	
	int mileage5 =(int)(Math.random()*8)+15 ;
	
	garrage.getVehicle()[4].setMileage(mileage5);
	
	
	
	if(garrage.getVehicle()[4].getMileage()%2!=0)
				{
					garrage.getVehicle()[4].setInsurence(true);
				}
				else
				{
					garrage.getVehicle()[4].setInsurence(false);
				}
	
	
	
	
	
	garrage.getVehicle()[5]=new Bike();
	
	garrage.getVehicle()[5].setBrand("KAWASAKI");
	
	garrage.getVehicle()[5].setModel("Ninja");
	
	garrage.getVehicle()[5].setRegisterno("KL 52 F 1111");
	
	int mileage6 =(int)(Math.random()*12)+21 ;
	
	garrage.getVehicle()[5].setMileage(mileage6);
	
	
	
	if(garrage.getVehicle()[5].getMileage()%2!=0)
				{
					garrage.getVehicle()[5].setInsurence(true);
				}
				else
				{
					garrage.getVehicle()[5].setInsurence(false);
				}
	
	
	
	garrage.getVehicle()[6]=new Bike();
	
	garrage.getVehicle()[6].setBrand("DUCCATI");
	
	garrage.getVehicle()[6].setModel("Panigale");
	
	garrage.getVehicle()[6].setRegisterno("KL 55 A 1212");
	
	int mileage7 =(int)(Math.random()*12)+23 ;
	
	garrage.getVehicle()[6].setMileage(mileage7);
	
	
	
				if(garrage.getVehicle()[6].getMileage()%2!=0)
				{
					garrage.getVehicle()[6].setInsurence(true);
				}
				else
				{
					garrage.getVehicle()[6].setInsurence(false);
				}
	
	
	
	garrage.getVehicle()[7]=new Bike();
	
	garrage.getVehicle()[7].setBrand("ROYAL ENFIELD");
	
	garrage.getVehicle()[7].setModel("GT");
	
	garrage.getVehicle()[7].setRegisterno("KL 51 N 5005");
	
	int mileage8 =(int)(Math.random()*14)+28 ;
	
	garrage.getVehicle()[7].setMileage(mileage8);
	
	
	if(garrage.getVehicle()[7].getMileage()%2!=0)
				{
					garrage.getVehicle()[7].setInsurence(true);
				}
				else
				{
					garrage.getVehicle()[7].setInsurence(false);
				}
	
	
	
	garrage.getVehicle()[8]=new Bike();
	
	garrage.getVehicle()[8].setBrand("ROYAL ENFIELD");
	
	garrage.getVehicle()[8].setModel("Interceptor");
	
	garrage.getVehicle()[8].setRegisterno("KL 50 D 1234");
	
	int mileage9 =(int)(Math.random()*15)+30 ;
	
	garrage.getVehicle()[8].setMileage(mileage9);
	
	
	if(garrage.getVehicle()[8].getMileage()%2!=0)
				{
					garrage.getVehicle()[8].setInsurence(true);
				}
				else
				{
					garrage.getVehicle()[8].setInsurence(false);
				}
	
	
	
	garrage.getVehicle()[9]=new Bike();
	
	garrage.getVehicle()[9].setBrand("YAMAHA");
	
	garrage.getVehicle()[9].setModel("R1");
	
	garrage.getVehicle()[9].setRegisterno("KL 51 A 1010");
	
	int mileage10 =(int)(Math.random()*25)+15 ;
	
	garrage.getVehicle()[9].setMileage(mileage10);
	
	
	
	if(garrage.getVehicle()[9].getMileage()%2!=0)
		{
		garrage.getVehicle()[9].setInsurence(true);
		}			
		else
		{
		garrage.getVehicle()[9].setInsurence(false);
					
		}
	

		System.out.println(garrage);
	}
	
}

	