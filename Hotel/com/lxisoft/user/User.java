package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class User
{

	

	
	Scanner sc= new Scanner(System.in);
	
	public void createUser(FoodMenu foodmenu,int noOfUser,Food food,Order[] order)
	{
		
		for(int i=0;i<=noOfUser;i++)
		{
			order[i] = new Order();
			order[i].createOrder(foodmenu,noOfUser,food,order);	
		}
		


	}

	public void displayUser(FoodMenu foodmenu,int noOfUser,Order[] order)

	{
		for(int i=0;i<noOfUser;i++)
		{
			order[i].displayOrder(foodmenu,noOfUser);
			System.out.println("\t______________________");
			System.out.print("\tAmount To Pay :");System.out.println(order[i].totalBill);	
		}
		

		
	}


}