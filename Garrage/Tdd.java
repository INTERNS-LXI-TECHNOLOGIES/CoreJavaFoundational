public class Tdd
{
	public static void main(String ar[])
	{
		Garrage garrage=new Garrage();
		
		garrage.setName("GARRAGE 51");
		
		
		garrage.vehicle[0]=new Vehicle(); 
		
		Vehicle car1=new Car();
		
		car1.setBrand("Toyota");
		car1.setName("Supra");
		car1.setColor("Red");
		
	
		
		((Car)car1).tyre[0]=new Tyre();
		
		((Car)car1).tyre[0].setBrand("Yokohama");
		((Car)car1).tyre[0].setSize(110);
		
		((Car)car1).tyre[1]=new Tyre();
		
		((Car)car1).tyre[1].setBrand("Michelin");
		((Car)car1).tyre[1].setSize(110);
	
		((Car)car1).tyre[2]=new Tyre();
		
		((Car)car1).tyre[2].setBrand("MRF");
		((Car)car1).tyre[2].setSize(110);
		
		((Car)car1).tyre[3]=new Tyre();
		
		((Car)car1).tyre[3].setBrand("Bridgestone");
		((Car)car1).tyre[3].setSize(110);
		
		((Car)car1).Mileage();
	
		
		garrage.vehicle[0]=car1;
		
		
		
		garrage.vehicle[1]=new Vehicle();
		
		Vehicle bike1=new Bike();
		
		
		bike1.setBrand("Kawasaki");
		bike1.setName("Ninja");
		bike1.setColor("Black&Green");
		
		((Bike)bike1).tyre[0]=new Tyre();
		
		((Bike)bike1).tyre[0].setBrand("MRF");
		((Bike)bike1).tyre[0].setSize(160);
		
		((Bike)bike1).tyre[1]=new Tyre();
		
		((Bike)bike1).tyre[1].setBrand("Ceat");
		((Bike)bike1).tyre[1].setSize(160);
		
		((Bike)bike1).Mileage();
		
		garrage.vehicle[1]=bike1;
		
		garrage.vehicle[2]=new Vehicle();

		Vehicle bike2=new Bike();
		
		bike2.setBrand("Benelli");
		bike2.setName("Benelli TNT 600i");
		bike2.setColor("Red");
		
		((Bike)bike2).tyre[0]=new Tyre();
		
		((Bike)bike2).tyre[0].setBrand("Bridgestone");
		((Bike)bike2).tyre[0].setSize(165);
		
		((Bike)bike2).tyre[1]=new Tyre();
		
		((Bike)bike2).tyre[1].setBrand("Michelin");
		((Bike)bike2).tyre[1].setSize(165);
		
		((Bike)bike2).Mileage();
		
		garrage.vehicle[2]=bike2;
		
		garrage.vehicle[3]=new Vehicle();
		
		Vehicle car2=new Car();
		
		((Car)car2).setBrand("Nissan");
		((Car)car2).setName("GTR Skyline");
		((Car)car2).setColor("Silver");
		
		((Car)car2).Mileage();
		
		((Car)car2).tyre[0]=new Tyre();
		
		((Car)car2).tyre[0].setBrand("Yohoham");
		((Car)car2).tyre[0].setSize(110);
		
		((Car)car2).tyre[1]=new Tyre();
		
		((Car)car2).tyre[1].setBrand("Michelin");
		((Car)car2).tyre[1].setSize(110);
	
		((Car)car2).tyre[2]=new Tyre();
		
		((Car)car2).tyre[2].setBrand("MRF");
		((Car)car2).tyre[2].setSize(110);
		
		((Car)car2).tyre[3]=new Tyre();
		
		((Car)car2).tyre[3].setBrand("Bridgestone");
		((Car)car2).tyre[3].setSize(110);
		
		
		garrage.vehicle[3]=car2;

		
		System.out.println(garrage);
	}



}