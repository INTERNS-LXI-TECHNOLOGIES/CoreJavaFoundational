package com.lxisoft.contactbook.view;
import java.util.Scanner;
import com.lxisoft.contactbook.model.Contact;

public class View {
	Scanner s = new Scanner(System.in);
	
	public void contact(){
		
		System.out.println("\n\n\n******CONTACT APP******");
		System.out.println("\n 1. Create Contact");
		System.out.println("\n 2. Read Contacts");
		System.out.println("\n 3. Update Contacts ");
		System.out.println("\n 4. Delete Contact");
		System.out.println("\n 5. Exit ");
	}
	
	
	
	
	public Contact createContact(){
		
		Contact contact = new Contact();
		
		System.out.println("\n\n\n******CREATING CONTACT******");
		
		System.out.print("\n Enter The Number : ");
		int number = Integer.parseInt(s.nextLine());
		contact.setNumber(number);
		
		System.out.print("\n Enter The Name : ");
		String name = s.nextLine();
		contact.setName(name);
		
		System.out.print("\n Enter Email Id : ");
		String email = s.nextLine();
		contact.setEmail(email);
		
		return contact;
	}






public Contact updateContact()
{
	Contact contact = new Contact();
	System.out.println("\n\n\n******UPDATING CONTACT******");
		
		System.out.print("\n Enter The New Number : ");
		int number = Integer.parseInt(s.nextLine());
		contact.setNumber(number);
		
		System.out.print("\n Enter The New Name : ");
		String name = s.nextLine();
		contact.setName(name);
		
		System.out.print("\n Enter New Email Id : ");
		String email = s.nextLine();
		contact.setEmail(email);
		
		return contact;
	}
}