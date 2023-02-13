public class Tdd 
{
public static void main(String[] args)
{	
Car car = new Car("Hyundai Elantra", "Starry night", "SX", "KL 7 H789" );


for(int i=0; i<4; i++)
{
car.parts[i] = new Door();
//((Door)super.car.part[i]).partNumber = 100001122;	
((Door)car.parts[i]).brand = "Steel World";
((Door)car.parts[i]).colour = "Black";
}

for(int j=4; j<8; j++)
{
car.parts[j] = new Tyre();
//((Tyre)super.car.part[j]).partNumber = 100001123;
((Tyre)car.parts[j]).brand = "Global Tyres";
((Tyre)car.parts[j]).colour = "Black";
}

car.parts[8] = new Steering();
//((Steering)super.car.part[8]).partNumber = 100001124;
((Steering)car.parts[8]).brand = "Appolo";
((Steering)car.parts[8]).radius = 8.5;

System.out.println(car);

}	
}