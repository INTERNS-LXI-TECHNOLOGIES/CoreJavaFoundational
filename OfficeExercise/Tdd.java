import java.util.Scanner;
public class Tdd
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);

System.out.println("Enter your name");

String name = s.nextLine();
//System.out.println(name);

System.out.println("Enter your address");

String address = s.nextLine();
//System.out.println(address);

System.out.println("Enter your phone number");

String sPhoneNumber = s.nextLine();
long phoneNumber = Long.parseLong(sPhoneNumber);

//System.out.println(phoneNumber);

System.out.println(name);
System.out.println(address);
System.out.println(phoneNumber);
}
}













//System
//String