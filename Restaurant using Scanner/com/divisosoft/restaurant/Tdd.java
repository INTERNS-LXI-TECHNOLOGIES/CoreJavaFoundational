package com.divisosoft.restaurant;
import java.util.Scanner;

public class Tdd
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Restaurant resto = new Restaurant();
		
		
		
		System.out.println("\t"+"--- WELCOME TO PALAKKAD ---"+"\n");
		System.out.println("ENTER YOUR NAME");
		resto.name = scan.nextLine();
		
		System.out.println("Ok "+resto.name+" . Lets Start Our Journey ."+"\n");
		
		boolean check = true;
		while(check)
		{
		
			System.out.println("PRESS 1 : View Restuarants ");
			System.out.println("PRESS 2 : Exit or Continue ");
			String choice = scan.nextLine();
			
			
			switch(choice)
			{
				case " 1" :
				
				System.out.println("PRESS 1 : Kismees  Resto Cafe");
				System.out.println("PRESS 2 : Juicy");
				System.out.println("PRESS 3 : Arabian Restuarant");
				System.out.println("PRESS 4 : Noora Restaurant ");
				System.out.println("PRESS 5 : Pisharodies Restaurant");
				resto.press = scan.nextInt();
				
				resto.printMenudetails();
				
					
				System.out.println("PRESS 1 : View Another Restaurant ");
				System.out.println("PRESS 2 : Exit ");
				resto.print = scan.nextInt();
					
				check = resto.printExitdetails();
				
				break;
	
				case "2" :
				
									
					System.out.println("PRESS Y : Continue ");
					System.out.println("PRESS N : Exit ");
					resto.choice = scan.next();
					scan.nextLine();
				
					check=resto.printExitContinuedetails();
					
				break;
			
				default :
				
					System.out.println("Sorry "+resto.name+" . Invalid Choice . Choose a Valid Choice "+"\n");
				
			}	
		}
	}	
}
		