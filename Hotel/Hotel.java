import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Hotel
{
String hotelName="!!!!!!!!!!!!Arabian Grills!!!!!!!!!!!!!";
int select;
Scanner sc=new Scanner(System.in);

Admin a=new Admin();
Customer c=new Customer();

public void hotelDetails()
{
	System.out.println("-------------------------------------------------------------");
	System.out.println("-----------Welcome to"+hotelName+"---------------");
	System.out.println("-------------------------------------------------------------");
	System.out.println("Please enter 1. if you are the Admin");
	System.out.println("Please enter 2. if you are a Customer");
	select=sc.nextInt();
	if(select==1)
	{
		a.adminAuthenticate();
	}
	else
	{ 
		c.customerName();
		a.printMenu();
		a.customerOrder();
	}
}

}