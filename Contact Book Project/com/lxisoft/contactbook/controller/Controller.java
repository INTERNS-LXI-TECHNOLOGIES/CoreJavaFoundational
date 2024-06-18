package com.lxisoft.contactbook.controller;

import com.lxisoft.contactbook.view.View;
import com.lxisoft.contactbook.model.Contact;
import java.util.Scanner;
import java.io.*;

public class Controller
{
	View view = new View();
	Contact[] contact = new Contact[100];
	Scanner s = new Scanner(System.in);	





public Controller()

{
	for(int i=0;i<contact.length;i++)
	{
		contact[i] = new Contact();
	}
}
	
	




	
public void addContact() {
	
boolean x = true;
    while (x) 
	{
        for (int i = 0; i < contact.length; i++)
		{
            if (contact[i] == null || contact[i].getName() == null) 
			{
                contact[i] = view.createContact();
                break;
            }
        }
		boolean a = true;
		while(a)
		{
		
			System.out.println("\n Do You Want To Continue? (yes/no) ");
			String response = s.nextLine();

			switch (response)
			{
				case "yes":
					x = true;
					a = false;
					break;
				case "no":
					x = false;
					a = false;
					break;
				default:
					System.out.println("\n\n Invalid Input. Please enter 'yes' or 'no'.");
					a = true;
					break;
			}
			
        }
    }
}










public void showContact(){
	
	System.out.println("\n\n\n******CONTACTS******");
	
	for(Contact i : contact){
		if(i != null && i.getName() != null){
			System.out.println(i);
		}
		
	}
}


public void updateContact()
{
	
	showContact();
	boolean x = true;
	while(x)
	{
		System.out.println("\n\n Which Contact Do you Want To Edit ?\n\n Enter The Name :");
		String name = s.nextLine();
		boolean found = false;
	
		for(int i=0;i<contact.length;i++)
		{
			if(contact[i] != null && contact[i].getName().equals(name))
			{
				contact[i] = view.updateContact();
				found = true;
				break;
			}
			else
			{
			System.out.println("\n Wrong Input");
			x = true;
			break;
		}
		}	
		
		
	}
}








	public void deleteContact()
	{
		showContact();
		System.out.println("Which Contact Do you Want To Delete ?\n Enter The Name :");
		String name = s.nextLine();
		for(int i=0;i<contact.length;i++)
		{
			if(contact[i] != null && contact[i].getName().equals(name))
			{
				contact[i] = null;
				System.out.println("\nContact Succesfully Deleted");
				break;
			}
		}
	}
	
	
	





public void mainMethod()
{
	readFile();
	boolean x = true;
	while(x)
	{
		view.contact();
		System.out.print("\n  Choose option : ");
		int option = Integer.parseInt(s.nextLine());
	
		switch(option)
		{
			case 1:
				addContact();
				break;
			case 2:
				showContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				deleteContact();
				break;
			case 5:
				x = false;
				System.out.println("Existing");
				break;
			default:
				System.out.println("\n Wrong Input");
				x = true;
				break;
		}
	}
	writeFile();
	
}






public void createFile()
{
	
	File f = new File("D:\\LXI\\Core-Java\\Contact Book Project\\com\\lxisoft\\contactbook\\contactbook.csv");

	
	try
	{
		boolean status = f.createNewFile();
		
		if(status)
		{
			System.out.println("File Created");
		}
		else
		{
			System.out.println("File alredy Created");
		}
	}
	catch(Exception e)
	{
		System.out.println("An Error Occured");
	}
	
}


public void writeFile()
{
	try
	{
		FileWriter fw = new FileWriter("D:\\LXI\\Core-Java\\Contact Book Project\\com\\lxisoft\\contactbook\\contactbook.csv");
		
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		
		for(int i = 0;i<contact.length;i++)
		{
			if(contact[i].getName()!= null)
			{
			bufferedWriter.write(contact[i].csvFile());
			bufferedWriter.newLine();
			}
		}
			bufferedWriter.flush();
			bufferedWriter.close();
	}
	catch(Exception e)
	{
		System.out.println("Write file  exception");
	}
}




public void readFile()
{
 String[] data ;
 try
 {
	FileReader fr = new FileReader("D:\\LXI\\Core-Java\\Contact Book Project\\com\\lxisoft\\contactbook\\contactbook.csv");
	BufferedReader bufferedReader = new  BufferedReader(fr);
	String line;
	
	while((line = bufferedReader.readLine()) != null)
	{
		data = line.split(",");
		for ( int i = 0; i<contact.length;i++)
		{
			if(contact[i].getName()== null)
			{
				contact[i].setName(data[0]);
				contact[i].setNumber(Long.parseLong(data[1]));
				contact[i].setEmail(data[2]);
				break;
			}
		}
		
	}
	
 }
 catch(Exception e)
 {
	 System.out.println("Read file exception");
 }
	 
}
}

	
	
	