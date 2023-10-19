public class Car 
{
int model;
String name;
String colour;
Part[] parts = new Part[9];
Door[] doors = new Door[3];
Tyre[] tyres = new Tyre[3];
Steering s;

void fix()
{
	System.out.println("model no.is"+model);
		System.out.println("Name is"+name);
		System.out.println("Colour is"+colour);

}
}