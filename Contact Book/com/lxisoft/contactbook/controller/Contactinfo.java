package com.lxisoft.contactbook.controller;

import java.util.Scanner;

import com.lxisoft.contactbook.model.*;

public class Contactinfo
{
	
	public void contactDetails()
	{
	
	Phone phone=new Phone();
	
	Scanner s=new Scanner(System.in);
	 
	 for(int i=0;i<5;i++)
	 {
		phone.getContact()[i]=new Contact();
		
		System.out.print("\nEnter the name : ");
	
		String name=s.next();
		
		s.nextLine();
		
		phone.getContact()[i].setName(name);
	
		System.out.print("\nEnter the number : ");
		
		long number=s.nextLong();
	
		phone.getContact()[i].setNumber(number);
		
		System.out.println("\nContact Added SuccessFully");
		
		
	 }
	 
	 System.out.println("\n\n\n\t CONTACT DETAILS");
	 System.out.println(phone);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
