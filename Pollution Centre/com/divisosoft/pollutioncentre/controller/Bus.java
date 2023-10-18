package com.divisosoft.pollutioncentre.controller;
import com.divisosoft.pollutioncentre.model.Vehicle;
import java.util.Scanner ;

public class Bus extends Vehicle
{
	Scanner scan = new Scanner(System.in);
	
	void CreateBus()
	{
		System.out.println("Enter Owner Name");
		String name = scan.nextLine();
		setName(name);
		getName();
		System.out.println("Enter Register Number");
		String regno = scan.nextLine();
		setRegno(regno);
		getRegno();
	}
	
}