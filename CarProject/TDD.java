public class TDD
{
public static void main(String[] args)
{
	//first car
	
Car a=new Car();
a.carName="maruthi";
a.drive();

Color c=new Color();
c.colorOfCar("Blue");
c.carColor="Blue Color";

Engine e=new Engine();
e.engType="Normal Engine";
e.startEngine("Normal");

Fuel f=new Fuel();
f.fuelType="Petrol";
f.carFuel("Power Petrol");

Driver d=new Driver();
d.license=true;
d.checkLicense(true);

Tyre t=new Tyre();
t.tyreType="Flat";
t.typeOfTyre();


//second car


Car b=new Car();
b.carName="Toyota Innova";
b.drive();

Color i=new Color();
i.colorOfCar("Light Yellow");
i.carColor="Yellow Color";

Engine en=new Engine();
en.engType="High Power";
en.startEngine("Power Engine");

Fuel fu=new Fuel();
fu.fuelType="Petrol";
fu.carFuel("Power Petrol");

Driver dr=new Driver();
dr.license=true;
dr.checkLicense(true);

Tyre tr=new Tyre();
tr.tyreType=" High Grip ";
tr.typeOfTyre();

}
}