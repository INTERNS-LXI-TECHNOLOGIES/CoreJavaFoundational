package com.lxisoft.repository;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 /**
 * Repository for Database operation
 */
public class MysqlRepository implements Repository
{
	List<Contact>contactList=new ArrayList<Contact>();
	Contact c;
	ResultSet rs=null;
	PreparedStatement stmt=null;
	Connection conn=null;
	{
		try
		{
			connectionDB();
		}
		catch(Exception e)
		{
			System.out.println("not connected");	
		}
	}
	public MysqlRepository()
	{
		c=new Contact();
	}

	  /**
 * connect to database 
 */
	public void connectionDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");	
 	    }
 	    catch(Exception e)
 	    {
 	    	System.out.println("Database not connected");
 	    }
 	}
 	public void create()
 	{
 		try
 		{ 
 			String cr="CREATE TABLE contactlist(ID int,Name varchar(25),Number varchar(25))";
			stmt.execute();
 		}
 		catch(SQLException e)
 		{
 			e.printStackTrace();
 		}
 	}
	
	  /**
 * get all contact 
 */
	   /**
 * @return contactList 
 */
	public List<Contact> getAllContact()
	{
		try
		{
			contactList.clear();
			Statement smt=conn.createStatement();
			// ResultSet 
			rs=smt.executeQuery("select * from contactlist");
			while(rs.next())
			{
				Contact c=new Contact();
				c.setId(String.valueOf(rs.getInt("ID")));
				c.setName(rs.getString("NAME"));	
				c.setContactNo(rs.getString("NUMBER"));
				contactList.add(c);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Contact list empty!!!!");
		}
		return contactList; 
	}
	  /**
 * add contact 
 */
 	public void insertContact(Contact c)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into contactlist(Name,Number)values(?,?)");
	 		// stmt.setInt(1,Integer.parseInt(c.getId()));
	 		stmt.setString(1,c.getName());
	 	    stmt.setString(2,c.getContactNo());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 			System.out.println("Insert Failed"+e);
 		}
 		// return contactList;
 	}
  /**
 * Edit contact 
 */
  	public void updateContact(String d,Contact c)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("update contactlist set Number=? where ID=?");
	 		stmt.setString(1,c.getContactNo());
	 		stmt.setString(2,d);
	 	    stmt.executeUpdate();
	 		System.out.println("Successfully Updated");
 		}
 		catch(Exception e)
 		{
 			System.out.println("Updation Failed"+e);
 		}
 	}
 	  /**
 * delete contact 
 */
 	public void deleteContact(String d)
	{
		try
		{
			stmt=conn.prepareStatement("delete from Contactlist where ID=?");
			stmt.setString(1,d);
			stmt.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	// public void searchContact(String d)
	// {
	// 	try
	// 	{
	// 		// Statement smt=conn.createStatement();
	// 		// ResultSet 
	// 		rs=stmt.executeQuery("select Name,Number from contactlist where ID=?");
	// 		stmt.setString(1,d);
	// 		c.setName(rs.getString("Name"));
	// 		c.setContactNo(rs.getString("Number"));	
	// 	}
	// 	catch(SQLException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	// return contactList;
	// }

	  /**
 * sort id 
 */
	   /**
 * @return contactList 
 */
	public List<Contact> idSort()
  	{
  		contactList=getAllContact();
  		Collections.sort(contactList,new IdComparator());
		// resetFile();
		return contactList;
  	}
      /**
 * sort name 
 */
       /**
 * @return contactList 
 */
  	public List<Contact> nameSort()
  	{
  		contactList=getAllContact();
  		Collections.sort(contactList,new NameComparator());
		// resetFile();
		return contactList;
  	}
      /**
 * sort number 
 */
       /**
 * @return contactList 
 */
  	public List<Contact> numberSort()
  	{
  		contactList=getAllContact();
  		Collections.sort(contactList,new NoComparator());
		// resetFile();
		return contactList;
  	}
}