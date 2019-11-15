package com.lxisoft.contactapp.controller;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import com.lxisoft.contactapp.repository.*;
import com.lxisoft.contactapp.view.*;
import java.io.*;
import java.util.*;
public class ContactController
{
	public Repository filerepo=new Repository();
	public ContactView view=new ContactView();
	public void getAllcontacts()
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		ContactsListModel contact=new ContactsListModel();
		contact.setAllContacts(contacts);
		ArrayList<ContactModel> contactlist1=contact.getAllContacts();
		view.showAllContacts(contactlist1);
	}
	public void getContactById(String id)
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		Contact contact=new Contact();
		//int value=0,val=0;
		for(int i=0;i<contacts.size();i++)
		{
			if(id.equals(contacts.get(i).getId()))
			{
				view.getContactById(contacts.get(i));
			}
		}
	}
	public void updateContact(String id,String name,String number)
	{
		filerepo.updateContact(id,name,number);
	}
	public void addContactDetails(String id,String name,String number)
	{
		filerepo.addContactDetails(id,name,number);
	}
	public void deleteContact(String id)
	{
		filerepo.deleteContact(id);
	}
	public String getName(String id)
	{
		String name=filerepo.getName(id);
		return name;
	}
	public String getNo(String id)
	{
		String num=filerepo.getNo(id);
		return num;
	}
	// public String getId(String id)
	// {
	// 	id=filerepo.getId(id);
	// 	return id;
	// }
}