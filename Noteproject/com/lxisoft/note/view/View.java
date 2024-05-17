package com.lxisoft.note.view;

import java.util.Scanner;
import com.lxisoft.note.model.*;
import com.lxisoft.note.controller.Notesinfo;

public class View
{
	
	Scanner s=new Scanner(System.in);
	public void  menu()
	{
		System.out.println("\n\n\n\t*****NOTE APP*****");
		System.out.println("\n 1.Create Notes");
		System.out.println("\n 2.Read Notes");
		System.out.println("\n 3.Update Note");
		System.out.println("\n 4.Delete Note");
		System.out.println("\n 5.Exit");
		
	}
	
	
	
	
	public Note createNote()
	{
		Note note=new Note();
		
		
		
		System.out.println("\n\n\n\t****CREATE NOTE****");
		
		System.out.print("\nEnter Idno  : ");
		int idNo =s.nextInt();
		note.setId(idNo);
		
		System.out.print("Enter Note  : ");
		String notes=s.next();
		s.nextLine();
		note.setNote(notes);
		
		System.out.print("Author Name : ");
		String author=s.nextLine();
		note.setAuthor(author);
	
		System.out.print("Subject     : ");
		String subject=s.nextLine();
		note.setSubject(subject);
		
		return note;		
	}
	
	
	
	
	public Note update()
	{
		
		Note note=new Note();
		
		System.out.println("\n\n\n\t****UPDATE NOTE****");
		
		System.out.print("\nEnter New Idno  : ");
		int idNo =s.nextInt();
		note.setId(idNo);
		
		System.out.print("Enter New Note  : ");
		String notes=s.next();
		s.nextLine();
		note.setNote(notes);
		
		System.out.print("New Author Name : ");
		String author=s.nextLine();
		note.setAuthor(author);
	
		System.out.print("New Subject     : ");
		String subject=s.nextLine();
		note.setSubject(subject);
		
		return note;
	}
	
	
	
	
}