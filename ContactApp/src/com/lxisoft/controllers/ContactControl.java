package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import com.lxisoft.view.*;
import com.lxisoft.models.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class ContactControl
{
    /**
 * class controller
 */
    FileRepository repository=new FileRepository();
    MysqlRepository myrepo=new MysqlRepository();
    ContactView view=new ContactView();
   /**
 * to get all contacts
 */
	public void getContactDetails()
	{     
        List<Contact>contactList=myrepo.getAllContact();
        ContactListModel listModel=new ContactListModel();
        for(int i=0;i<contactList.size();i++)
        {
            ContactModel model=new ContactModel();
            model.setId(contactList.get(i).getId());
            model.setName(contactList.get(i).getName());
            listModel.setContactsList(model);
       }
        contactList=myrepo.getAllContact();
        view.getAllContacts(listModel.getContactsList());
        display();
    }
    /**
 * to select choices
 */
    public void display()
    {
        int ch;
        do
        {
            ch=view.display();
            switch(ch)
            {
                case 1:ContactByIdDetails();break;     
                case 2:addDetails();break; 
                case 3:searchDetails();break;
                case 4:sort();break;
                case 5:getContactDetails();break;
            } 
        }while(ch!=6); 
    }
    public void sort()
    {
        int c=0;
        List<Contact>contactList=null;
        do
        {
            c=view.sort();
            switch(c)
            {
                // case 1:contactList=repository.idSort();break;
                // case 2:contactList=repository.nameSort();break;
                // case 3:contactList=repository.numberSort();break;
                case 1:contactList=myrepo.idSort();break;
                case 2:contactList=myrepo.nameSort();break;
                case 3:contactList=myrepo.numberSort();break;
            }
        }while(c!=4);
        view.sortContact(contactList);
    }
    /**
 * contact select by id and operations delete and update
 */
    public void ContactByIdDetails()
    {
        List<Contact>contactList=myrepo.getAllContact();
        String d=view.getContactId();
        Contact c=new Contact();
        for(int i=0;i<contactList.size();i++)
        {
            if((contactList.get(i).getId()).equals(d))
            {
                c=contactList.get(i);
            }
        }
        view.getContactById(c);
        int ch=0;
        ch=view.getOperations();
        switch(ch)
        {
            case 1: updateDetails(c,d); break;
            case 2: deleteDetails(d); break;
        }
    }
    /**
 * add contact
 */
    public void addDetails()
    {
    	Contact c=new Contact();
    	c=view.addContact();
        // repository.create(c);
        // myrepo.create();
        myrepo.insertContact(c);
    }
     /**
 * delete contact
 */
    public void deleteDetails(String d)
    {
        List<Contact>contactList=myrepo.getAllContact();
        // List<Contact>contactList=repository.read();
        for(int i=0;i<contactList.size();i++)
    	{
            if(d.equals(contactList.get(i).getId()))
            {
                contactList.remove(i);
            }
    	}
        myrepo.deleteContact(d);
    //     repository.resetFile();
    //     for(int i=0;i<contactList.size();i++)
    //     {
    //         repository.rewriteFile(contactList.get(i));
    //     }
    //     view.deleteContact();
    }
     /**
 * update contact
 */
      /**
 * @param d selected id
 */
    public void updateDetails(Contact c,String d)
    {
        // List<Contact>contactList=repository.read();
        List<Contact>contactList=myrepo.getAllContact();
        String contactNo=view.updateContact();
  		for(int i=0;i<contactList.size();i++)
    	{
            if(d.equals(contactList.get(i).getId()))
            {
                c=contactList.get(i);
                c.setContactNo(contactNo);
                contactList.set(i,c);
            }   
    	}
        myrepo.updateContact(d,c);
        // repository.resetFile();
        // for(int i=0;i<contactList.size();i++)
        // {
        //     repository.rewriteFile(contactList.get(i));
        // }
    }
     /**
 * search a contact 
 */
    public void searchDetails()
    {
        String d=view.getContactName();
        List<String>c=new ArrayList<String>();
        List<Contact>contactList=myrepo.getAllContact();
        for(int i=0;i<contactList.size();i++)
        {
            if(contactList.get(i).getName().contains(d))
            {
                c.add(contactList.get(i).getName());
            }
        }
        // myrepo.searchContact(d);
        view.searchContact(c);
    }
} 