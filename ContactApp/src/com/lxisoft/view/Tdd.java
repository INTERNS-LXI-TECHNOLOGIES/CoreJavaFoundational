package com.lxisoft.view;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import java.util.*;


public class Tdd
{
	public static Controller con = new Controller();
	public static void main(String[] args)
	{
		System.out.println("  \n \t \t -----CONTACT LIST------");
		do{
		System.out.println(" \n \n 1 = ADD NEW CONTACT \n 2 = SEARCH \n 3 = DISPLAY ");
		Scanner read= new Scanner(System.in);
		int n = read.nextInt();
		switch(n)
		{
			case 1 : addContact(); break;
			case 2 : search();break;
			case 3 : display(); break;
			default: System.out.println("INVALID CHOICE");
		}
		}while(true);
	}
	public static void addContact()
	{
		
		System.out.println("ENTER NAME");
		Scanner read = new Scanner(System.in);
		String name= read.nextLine();
		System.out.println("ENTER NUMBER");
		String number=read.nextLine();
		con.addContact(name,number);
	}
	public static void search()
	{
		String[] args=null;
		int f=0;
		System.out.println("ENTER NAME");
		Scanner set = new Scanner(System.in);
		String name= set.nextLine();
		for(int i=0;i<con.getArraySize();i++)
		{
			if(name.equals(con.array.get(i).getName()))
			 {
			 	edit(i);
			 	System.out.println(" NUMBER : "+con.array.get(i).getNumber());
			 	f=1;
			 }	 
		}
		if(f!=1)
		{
			System.out.println("NOT FOUND");
		}
		do{
		System.out.println(" \n \n 1 = EDIT \n 2 = DELETE \n 3 = BACK TO MAIN MENU ");
		Scanner read= new Scanner(System.in);
		int n = read.nextInt();
		switch(n)
		{
			case 1 :edit(n); break;
			case 2 : delete();break;
			case 3 :main(args) ; break;
			default: System.out.println("INVALID CHOICE");
		}
		} while(true);
	}
	public static void display()
	{
		 for(int i=0;i<(con.getArraySize());i++)
		{ 	
		 System.out.println("\t"+con.array.get(i).getName()+"  "+con.array.get(i).getNumber());
		}
	}
	public static void edit(int i)
	{
		
		 System.out.println("ENTER THE NEW NAME");
		 Scanner read= new Scanner(System.in);
		 String name= read.nextLine();
		 System.out.println("ENTER THE NEW NUMBER");
		 String number = read.nextLine();
		 con.editContact(name,number);
	}
	public static void delete()
	{

	}
		
}