package com.lxisoft.contactapp.repository;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.sql.*;
import java.util.*;
import java.util.Collections;
import java.io.*;
/**
 * class Repository is created to do database operations that implements MySqlRepo
 */
public class MySqlRepo implements Repository
{  
	String driver_Class="com.mysql.jdbc.Driver";
	String userName="root";
	String password="root";
	String db_URL="jdbc:mysql://localhost:3306/contacts";
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	static int id=0;
	ArrayList<Contact> contacts=new ArrayList<Contact>();

	public void dB_Connection() throws SQLException,ClassNotFoundException
	{
		try
		{
			Class.forName(driver_Class);
			con=DriverManager.getConnection(db_URL,userName,password);
			System.out.println("DB Connection created successfully");
			boolean tableExists=checkTableExists();
			if(tableExists)
			{
				System.out.println("table exist");
			}
			else
			{
		    	createTable();
			}
		}catch(SQLException ex) 
		{ 
	   		System.out.println("Error: unable to load driver class!"); 
		}
	}
	/**
	 * Add contact details from file.
	 * @param contact contact
	 * @param tbexists
	 */
	public void insertContactDetails(Contact contact,boolean tbexists)throws SQLException
	{	
	
		try
		{	
			if(tbexists==false)
			{
				id=getId();
				stmt=con.prepareStatement("insert into Contactlist values(?,?,?)");  
				stmt.setInt(1,id);
				stmt.setString (2,contact.getName());
				stmt.setString(3,contact.getNo());
				stmt.executeUpdate();
			}else
			{
				stmt=con.prepareStatement("insert into Contactlist values(?,?,?)");  
				stmt.setInt(1,contact.getId());
				stmt.setString (2,contact.getName());
				stmt.setString(3,contact.getNo());
				stmt.executeUpdate();
			}
		}catch(SQLException ex) 
		{ 
	   		System.out.println(ex);
	   		ex.printStackTrace();
		}
	}
	public void createTable()throws SQLException
	{
		try
		{
			String create_Table="create table Contactlist(ID int(3),NAME varchar(50),NUMBER varchar(10))";
			stmt=con.prepareStatement(create_Table);
			stmt.execute();
			System.out.println("table craeted successfully");
		}
		catch(SQLException ex) 
		{ 
		   	System.out.println("Error: SQLSyntax error!"); 
		}
	}
	public boolean checkTableExists()
	{
		boolean exists=false;
		try
		{
			rs =  con.getMetaData().getTables(null, null, "Contactlist", null);
		    if (rs.next()) 
		    {
		     exists=true;
		    }
		}catch(SQLException e)
		{
			System.out.println("error"+e);
		}
		return exists;
	}
	public int getId()
	{
		try
		{
			contacts=getAllContacts();
			rs = stmt.executeQuery("select * from Contactlist");
			while(rs.next()) 
			{ 
	 			id = rs.getInt("ID");
			}id++;
		}catch(SQLException e)
		{
			System.out.println("Exception"+e);
		}
		return id;	
	}
	public ArrayList<Contact> getAllContacts()throws SQLException
	{
		try
		{
		
			contacts.clear();
			stmt=con.prepareStatement(" use Contactlist");
			rs = stmt.executeQuery("select * from Contactlist");
			while(rs.next()) 
			{ 
				Contact	contact=new Contact();
				contact.setId(rs.getInt("ID"));
				contact.setName(rs.getString("NAME"));
				contact.setNo(rs.getString("NUMBER"));
				contacts.add(contact);
			}	
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contacts;
	}
	public void updateRepo(int i,Contact contact)throws SQLException
	{
		try
		{
			stmt=con.prepareStatement("update Contactlist set name=?,number=? where id=?");
			stmt.setString(1,contact.getName());
			stmt.setString(2,contact.getNo());
			stmt.setInt(3,contacts.get(i).getId());
			stmt.executeUpdate();
			System.out.println("contact updated");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void deleteContact(int i)throws SQLException
	{
		try
		{
			stmt=con.prepareStatement("delete from Contactlist where id=?");
			stmt.setInt(1,contacts.get(i).getId());
			stmt.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void clearRepository()throws SQLException
	{
		try
		{
			id=0;
			stmt=con.prepareStatement("truncate table Contactlist");
			stmt.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Contact> sortContactByName()throws SQLException
	{
		try
		{
			contacts=getAllContacts();
			Collections.sort(contacts,new SortByName());
			clearRepository();
			for(Contact contact : contacts)
			{
				boolean val=true;
				insertContactDetails(contact,val);
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contacts;
	}

	public ArrayList<Contact> sortContactByNumber()throws SQLException
	{
		try
		{
			contacts=getAllContacts();
			Collections.sort(contacts,new SortByNumber());
			clearRepository();
	 		for(Contact contact : contacts)
			{
				boolean val=true;
				insertContactDetails(contact,val);
			}
		}catch(SQLException e)
		{
			System.out.println(e);
		}		
		return contacts;
	}
	public ArrayList<Contact> sortContactById()throws SQLException
	{
		try
		{
			contacts=getAllContacts();
			Collections.sort(contacts,new SortById());
			clearRepository();
	 		for(Contact contact : contacts)
			{
				boolean val=true;
				insertContactDetails(contact,val);
			}	
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contacts;
	}
	public void addContactDetails(Contact contact)throws SQLException
	{
		contacts.add(contact);	
		boolean val=false;
		insertContactDetails(contact,val);
	}
}