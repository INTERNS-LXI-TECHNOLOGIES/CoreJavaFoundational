public class Tdd 
{
public static void main(String[] args)
{	
Car car = new Car("Hyundai Elantra", "Starry night", "SX", "KL 7 H789" );
Part door = new Door("1011088881", "Steel World", "Black");
Part tyre = new Tyre("1011088882", "Global Tyres", "Black");
Part steering = new Steering("1011088883", "Appolo" , 8.5);

/*for(int i=0; i<4; i++)
{
car.part[i] = new Door();	
((Door)car.part[i]=
}

for(int j=4; j<8; j++)
{
car.part[j] = new Tyre();
((Tyre)car.part[j] =	
}

car.part[8] = new Steering();
((Steering)car.part[8] = */

System.out.println(car);

}	
}