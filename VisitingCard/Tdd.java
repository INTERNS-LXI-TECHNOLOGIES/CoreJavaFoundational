
import java.util.Scanner;

public class Tdd
{
public static void main (String[]args)
{
Scanner s = new Scanner(System.in);

System.out.println("Enter your name");

String name = s.nextLine();

Scanner b = new Scanner(System.in);

System.out.println("Enter your phone number");
long phoneNumber = b.nextLong();

Scanner a= new Scanner(System.in);

System.out.println("Enter your address");
String address = a.nextLine();

System.out.println(name);
System.out.println("Name:" + name);

System.out.println(phoneNumber);
System.out.println("Phone Number:" + phoneNumber);

System.out.println(address);
System.out.println("Address:" + address);

}
}

































//java.lang:automatically available.
//java.util:should import.