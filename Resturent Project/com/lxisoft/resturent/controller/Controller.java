package com.lxisoft.resturent.controller;

import com.lxisoft.resturent.view.View;
import java.util.Scanner;

public class Controller
{
	View view = new View();
	Scanner s = new Scanner(System.in);
	
	public void mainMethod()
	{
		
		view.district();
		System.out.print("\nChoose the district  you need : ");
		String respons = s.nextLine();
		int response = Integer.parseInt(respons);
		
		switch(response)
		{
			case 1:
				System.out.println("\n -You Choose Palakkad District-");
				view.resturentPkd();
				restpickPkd();
				continues();
				break;
				
			case 2:
				System.out.println("\n -You Choose Thrissur district-");
				view.resturentThrissur();
				restpickThr();
				continues();
				break;
				
			case 3:
				System.out.println("\n -You Choose Malappuram district-");
				view.resturentMalappuram();
				restpickThr();
				continues();
				break;
				
			default :
				System.out.println("\n -Wrong Input");
				break;
		}
	}

	public void restpickPkd()
	{
		System.out.print("\nChoose The Resturent you need : ");
		String respons = s.nextLine();
		int response = Integer.parseInt(respons);
		
		switch(response)
		{
			case 1:
				System.out.println("\n -You Choose Hotel Arabian-");
				vegornonveg();
				break;
			case 2 :
				System.out.println("\n -You Choose Hotel Noora-");
				vegornonveg();
				break;
			case 3:
				System.out.println("\n -You Choose Hotel Legacy-");
				vegornonveg();
				break;
			case 4:
				System.out.println("\n -You Choose Hotel Final Spot-");
				vegornonveg();
				break;
			default :
				System.out.println("\n -Wrong Input");
				break;
		}
	}



	public void restpickThr()
	{
		System.out.print("\nChoose The Resturent you need : ");
		String respons = s.nextLine();
		int response = Integer.parseInt(respons);
		
		switch(response)
		{
			case 1:
				System.out.println("\n -You Choose Hotel Albaik-");
				vegornonveg();
				break;
			case 2 :
				System.out.println("\n  -You Choose Hotel Shalimar-");
				vegornonveg();
				break;
			case 3:
				System.out.println("\n -You Choose Hotel Air-dine-");
				vegornonveg();
				break;
			case 4:
				System.out.println("\n -You Choose Hotel Kismees- ");
				vegornonveg();
				break;
			default :
				System.out.println("\n -Wrong Input");
				break;
		}
	}

	
	
	
	
	public void restpickMlp()
	{
		System.out.print("\nChoose The Resturent you need : ");
		String respons = s.nextLine();
		int response = Integer.parseInt(respons);
		
		switch(response)
		{
			case 1:
				System.out.println("\n -You Choose Hotel Airlines-");
				vegornonveg();
				break;
			case 2 :
				System.out.println("\n -You Choose Hotel Delicia-");
				vegornonveg();
				break;
			case 3:
				System.out.println("\n -You Choose Hotel Mazali-");
				vegornonveg();
				break;
			case 4:
				System.out.println("\n -You Choose Hotel Rydges- ");
				vegornonveg();
				break;
			default :
				System.out.println("\n -Wrong Input");
				break;
		}
	}

	
	
	
	
	public void vegornonveg()
	{
		boolean x = true;
		
		
		System.out.print("\nDO You Preffer Veg or Non : ");
		String response=s.nextLine();
		
		switch(response)
		{
			case "veg":
				System.out.println("\n -You Choose veg-");
				view.vegMenu();
				yesornoVeg();
				break;
				
			case "non":
				System.out.println("\n -You Choose non-veg-");
				view.nonvegMenu();
				yesornoNon();
				break;
				
			default :
				System.out.println("\n-Wrong Input-");
				break;
		}
	}
	
	
	public void vegFood()
	{
		System.out.print("\nSelect food : ");
		String respons = s.nextLine();
		int response = Integer.parseInt(respons);
		
		switch(response)
		{
			case 1:
				System.out.println("\n -You Selected Poratta-");
				break;
			case 2:
				System.out.println("\n -You Selected Chappathi-");
				break;
			case 3:
				System.out.println("\n -You Selected Vegbiryani-");
				break;
			case 4:
				System.out.println("\n -You Selected Ghee Rice-");
				break;
			default :
				System.out.println("\n -Wrong Input-");
				break;
		}
	}		
	
	
	
	
	
	public void nonFood()
	{
		System.out.print("\nSelect food : ");
		String respons = s.nextLine();
		int response = Integer.parseInt(respons);
		
		switch(response)
		{
			case 1:
				System.out.println("\n-You Selected Biriyani-");
				break;
			case 2:
				System.out.println("\n-You Selected Mandhi-");
				break;
			case 3:
				System.out.println("\n-You Selected Shawarma-");
				break;
			case 4:
				System.out.println("\n -You Selected  Shawai-");
				break;
			default :
				System.out.println("\n-Wrong Input-");
				break;
		}
	}		
	
	
	public void continues()
	{
		System.out.println("\n Do you Want to continue ? (yes/no)");
		String response = s.nextLine();
		
		switch(response)
		{
			case "yes":
				mainMethod();
				break;
			case "no":
				System.out.println("\n -Exited-");
				break;
			default :
				System.out.println("\n -Wrong Input-");
				break;
		}
	}			

	
	
	
	public void yesornoVeg()
	{
		System.out.println("\n Do You Contineu  With Veg Menu ?(yes/no)");
		String response = s.nextLine();
		
		switch (response)
		{
			case "yes":
				vegFood();
				break;
			case "no":
				vegornonveg();
				break;
			default:
				System.out.println("\n -Wrong Input-");
				break;
			
		}
	}
	
	
	
	
	public void yesornoNon()
	{
		System.out.println("\n Do You Contineu  With Non-Veg Menu ?(yes/no)");
		String response = s.nextLine();
		
		switch (response)
		{
			case "yes":
				nonFood();
				break;
			case "no":
				vegornonveg();
				break;
			default:
				System.out.println("\n -Wrong Input-");
				break;
			
		}
	}
}	

