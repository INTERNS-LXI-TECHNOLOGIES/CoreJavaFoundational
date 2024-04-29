public class Main1{
public static void main(String args[]){

Car1 car=new Car1();
car.name="benz";
car.color="white";
System.out.println(car);
System.out.println(car);

Door[] door = new Door[4];
for (int i = 0; i < door.length; i++) {
    door[i] = new Door(); 
    door[i].color = "red"; 
	
	System.out.println(door[i].color);
}



Tyre tyre[]  = new Tyre[4];
for (int i = 0; i < door.length; i++) {
    tyre[i] = new Tyre(); 
    tyre[i].brand = "mrf"; 
	
	System.out.println(tyre[i].brand);

}
 }
 }
 
 
