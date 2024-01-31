import java.util.Scanner;
public class Tdd{


public static void main(String[]args){





Scanner sc = new Scanner(System.in);


switch(sc.nextLine())
{
	
	case "1":
	
Bike bi = new Bike();
bi.name ="pulser";

System.out.println(bi.name);

break;

       case "2":
	    Bus bu = new Bus();
		
		bu.name ="Tourist";
		 
		 System.out.println(bu.name);
		 
		 break;
           

		case "3":
		
		Car car = new Car();
		car.name =sc.nextLine();
		
		System.out.println(car.name);
		
		break;
		
		
		default:
		
		System.out.println("inavalid");
		
		


	
	
}


}
}