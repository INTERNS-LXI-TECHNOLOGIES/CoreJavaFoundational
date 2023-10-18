package com.divisosoft.carlifeproject ;

public class Car
{
	String name ;
	String carname ;
    double km ;
	String press ;
	
	Door door ;
	Tyre tyre ;
	Steering steer ;
	
	boolean printExitDetails()
	{
	
		if(press.equalsIgnoreCase("N"))
		{
			System.out.println("Ok "+name+" . Thank You .");
			return false ;
		}
		else if (press.equalsIgnoreCase("Y"))
		{
			System.out.println("Lets Continue Our Journey"+"\n");
			return true ;
		}
		else
		{
			System.out.println("Sorry... Invalid Choice ."+"\n");
			return true ;
		}
	}
}