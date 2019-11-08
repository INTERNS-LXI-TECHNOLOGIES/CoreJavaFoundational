package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.contactrepository.*;
import com.lxisoft.view.View;

public class ContactController
{
	View view=new View();
	FileRepository repository=new FileRepository();
	ArrayList<Contact> array=new ArrayList<Contact>();

	public ArrayList<Contact> checkFile()
	{
		array=repository.check();
		view.displayContact(array);
		return array;
	}
	
	public void features(ArrayList<Contact> array,int option)
	{
		switch(option)
		{
			case 1:saveContact();break;
			case 2:;break;
			case 3:array=contactDelete(array);sync(array);break;
			case 4:array=contactUpdate(array);sync(array);break;
			case 5:view.displayContact(array);break;
			case 6:repository.fileRead();break;
			case 7:merge(array);break;
		}
	}

	public void saveContact()
	{
		String[] temp=view.scan(i);
		Contact contact=new Contact();
		contact.setName(temp[0]);
		contact.setNumber(temp[1]);
		repository.save(contact);
	}

	public void allContacts()
	{
		array=repository.findAll();
		view.displayAll(array);
	}

	public void contactByName()
	{
		String name=view.scanElement(0);
		findByName(name)
	}

	public void sync(ArrayList<Contact> array)
	{
		int j=0;
		for(Contact contact: array)
		{
			//System.out.print(j+"sync Name- " +contact.getName());
			repository.syncFile(contact,j);
			j++;
		}
	}

	public ArrayList<Contact> contactAdd(ArrayList<Contact> array)
	{
		int n=view.inputContact();
		for (int i=0;i<n;i++)
		{
			String[] temp=view.scan(i);
			Contact contact=new Contact();
			contact.setName(temp[0]);
			contact.setNumber(temp[1]);
			array.add(array.size(),contact);
		}
		view.displayContact(array);
		return array;
	}

	public int[] contactSearch(ArrayList<Contact> array)
	{
		int i=0,flag=0,j=1;
		int[] ret=new int[2];
		String element=view.scanElement(0);
		for(Contact contact: array)
		{
			if((contact.getName()).equals(element))
			{
				flag=1;
				view.elementFound(contact,j);
				i++;
			}
			j++;
		}
		ret[0]=i;
		ret[1]=flag;
		return ret;
	}

	public ArrayList<Contact> contactDelete(ArrayList<Contact> array)
	{
		int[] ret=contactSearch(array);
		int i=ret[0];
		int flag=ret[1];
		if(flag==0)
		{
			view.noContact();
		}
		else if(flag==1)
		{
			if(i!=0)
			{
				array.remove(i-1);
			}
		}
		view.displayContact(array);
		return array;
	}

	public ArrayList<Contact> contactUpdate(ArrayList<Contact> array)
	{
		int[] ret=contactSearch(array);
		int i=ret[0];
		int flag=ret[1];
		if(flag==0)
		{
			view.noContact();
		}
		else if(flag==1)
		{
			int u=view.updateScan(); 
			String update=view.scanElement(1);
			if(u==0)
			{
				Contact contact=new Contact(); 
				contact=array.get((i-1));
				contact.setName(update);
				array.set((i-1),contact);
			}
			else if(u==1)
			{
				Contact contact=new Contact(); 
				contact=array.get((i-1));
				contact.setNumber(update);
				array.set((i-1),contact);
			}
		}
		view.displayContact(array);
		return array;
	}

	public void merge(ArrayList<Contact> array)
	{
		int i,j;
		for(i=0;i<array.size();i++)
		{
				
			for(j=0;j<array.size();j++)
			{
				if((i!=j) && (array.get(i).getNumber()).equals(array.get(j).getNumber()))
				{
						System.out.println(" i1 "+i); 
						System.out.println(" j2 "+j);   
					System.out.println(" duplictes "+(array.get(i).getNumber()));
					break;
				}
			}
		}
	}

}

