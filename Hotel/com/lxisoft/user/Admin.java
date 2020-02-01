package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class Admin
{
	public String adminPassword="admin";
	boolean flag;
	static Scanner sc= new Scanner(System.in);
	public void adminLogin()
	{
		
		System.out.println("\tEnter Password:");
		System.out.print("\t");String setPass = sc.next();
		if(setPass.equals(adminPassword))
		{
			flag  = true;
			System.out.println("\tLogin Successfull");
			System.out.println("\t****Admin UI****");
			System.out.println("\t-----------------");
		}
		else
		{
			System.out.println("Authentication Failed");
			System.exit(0);
		}
	}
	
	public void createAdmin(FoodMenu foodmenu,User[] user,int noOfUser,Order[] order)
	{

			adminLogin();
			int ch;
			do
			{
			System.out.print("\n\t1.View Food\n\t2.Modify Food Menu\n\t3.View Order\n\t4.Back to Menu\n\tEnter Ur choice");
			System.out.print("\t\t");ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:	System.out.println("\t*****HOTEL MENU*****");
						System.out.println("\t________________________\n");

						foodmenu.displayFoodMenu();break;
				
				case 2:System.out.println("\n\t*****MODIFY FOOD*****");
					   System.out.println("\t___________________");
					   System.out.println("\n\t1.Add Food\n\t2.Delete Food\n\t3.Edit Food\n\tEnter Ur Choice\t");
					   System.out.print("\t");int c = sc.nextInt();
					   if(c == 1) 
					   	{
					   		foodmenu.addFood();
					   	}
					   	else if(c == 2)
					   	{
					   		foodmenu.deleteFood();
					   		
					   	}
					   	else if(c==3)
					   	{
					   		foodmenu.editFood();
					   	}
					   	else
					   	{
					   		System.out.println("Please give valid input!!!!");	
					   	}

					   	break;

				case 3:	
						if(noOfUser == 0)
						{
							System.out.println("N0 Orders");
						}
						else
						{
							for(int i=0;i<noOfUser;i++)
							{
							user[i].displayUser(foodmenu,noOfUser,order);	
							}
							
						}	
						break;   	

				case 4:	Hotel hotel = new Hotel();
						hotel.menu();break;
						
				default:System.out.println("Please give valid input!!!!");break;

			}
	
			}while(ch!=0);
			
	}
		
}
