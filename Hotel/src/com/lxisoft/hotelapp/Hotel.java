package com.Lxisoft.Hotelapp;
import com.Lxisoft.Admin.Admin;
import java.util.Scanner;
public class Hotel
{
	Menu menu=new Menu();
	Food item=new Food();
    Admin admin=new Admin();
    Order order=new Order();
	Scanner s=new Scanner(System.in);
	public void printHotel()
	{
		System.out.println("       ************************************************************************");
    	System.out.println("       *                                                                      *");
    	System.out.println("       *                          Top Chicken                                 *");   
    	System.out.println("       *                    Multi Cuisine Restuarent                          *");
    	System.out.println("       *         Mele Pattambi, Palakkad Road, Near juma Masjid               *");
    	System.out.println("       *                                                                      *");
    	System.out.println("       ************************************************************************");
		System.out.println("");
	}
	public void printDetails()
	{
		do
		{
			 System.out.println("\n________________________");
			 System.out.println("\n\n1. Customer Menu \n\n2. Admin \n\n3. Employees \n\n Press 0 for Exit \n");
			 choice=input.nextInt();
			 if(choice==1)
			 {
			 	menu.printMenu();
			 }
			 if(choice==2)
			 {
			 	admin.printAdmin();
			 }
			 if(choice==3)
			 {
			 	employee.printDetails();
			 }
			 else if(choice==0)
			 {
			 	System.out.println(" ");
			 }

		}while(choice>0);

		}
	}
