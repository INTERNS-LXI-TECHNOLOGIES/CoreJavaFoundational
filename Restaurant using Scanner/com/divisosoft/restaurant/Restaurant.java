package com.divisosoft.restaurant;
public class Restaurant
{
	String name ;
	int press;
	void printMenudetails()
	{
		
	if(press==1)
	{
		System.out.println("MILK SHAKE"+"\n"+"ALFAHAM"+"\n"+"FRESH JUICE"+"\n"+"SHAWARMA"+"\n"+"AVIL MILK"+"\n");
	}
	else if(press==2)
	{
		System.out.println("MALBA"+"\n"+"MILK SHAKE"+"\n"+"FRESH JUICE"+"\n"+"TENDER COCONUT SPECIAL"+"\n"+"KOLKATHA ROLL"+"\n");
	}
	else if(press==3)
	{
		System.out.println("SOUPS"+"\n"+"SHAWARMA"+"\n"+"MANDHI"+"\n"+"BIRIYANI"+"\n"+"BARBEQUE"+"\n");
	}
	else if(press==4)
	{
		System.out.println("BIRIYANI"+"\n"+"SHAWARMA"+"\n"+"MANDHI"+"\n"+"BARBEQUE"+"\n"+"SHAWAI"+"\n");
	}
	else if(press==5)
	{
		System.out.println("TEA N COFFEE"+"\n"+"FRESH JUICE"+"\n"+"MASALA DOSA"+"\n"+"GHEE ROAST"+"\n"+"SPECIAL DOSA"+"\n");
	}
	else
	{
		System.out.println("Sorry... Invalid Choice"+"\n");
	}
	}
	
	int print ;
	
	public boolean printExitdetails()
	{
	
	if(print==1)
	{
		return true;
	}
	else if(print==2)
	{
		return false;
	}
	else
	{
		System.out.println("Sorry... Invalid Choice"+"\n");
		return true;
	}
	
	}
	
	String choice;
	boolean printExitContinuedetails()
	{
		
		if(choice.equals("Y"))
		{
			
			System.out.println("Ok  Continue Our Journey"+"\n");
			return true;
		}
		else if(choice.equals("N"))
		{
			System.out.println("Ok "+name+" . Thank you "+"\n");
			return false;
		}				
		else
		{
			
			System.out.println("Sorry "+name+" . Invalid Choice"+"\n");
			return true;
		}
	}
}	
