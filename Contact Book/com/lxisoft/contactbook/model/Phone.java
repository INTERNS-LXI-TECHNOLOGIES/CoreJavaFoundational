package com.lxisoft.contactbook.model;

public class Phone 
{
	private Contact[] contact=new Contact[5];
	
	
	
	public Contact[] getContact()
	{
		return contact;
	}
		
		
		public String toString()
		{
		String a="";
		
		for (int i=0;i<contact.length;i++)
		{
			a+=contact[i];
		}
		
		return a;
		}
	
}
		
	
	
	
	