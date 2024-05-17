package com.lxisoft.note.controller;

import com.lxisoft.note.model.Note;
import com.lxisoft.note.view.View;
import java.util.Scanner;

public class Notesinfo{
    Scanner scanner = new Scanner(System.in);



	
	
	View view=new View();
	Note[] note=new Note[100];
	Scanner s=new Scanner(System.in);
	
	
	public Notesinfo()
	{
		for (int i=0;i<note.length;i++)
		{
			note[i]=new Note();
		}
	}

	
	public void addNote() 
	{
		boolean x = true;
		Scanner s = new Scanner(System.in);

		while (x) 
		{
			for (int i = 0; i < note.length; i++)
			{
				if (note[i]==null || note[i].getAuthor() == null) 
				{ 
					note[i]= view.createNote();
        
					System.out.println("\nItem successfully saved"); 
					break; 
				}
			}

			System.out.println("\nDo You Want To Continue? (yes/no)");
			String response = s.nextLine();

			switch (response)
			{
				case "yes":
					x = true;
					break;
				case "no":
					x = false;
					break;
				default:
					x = false;
					System.out.println("WRONG Input");
					break;	
			}
		}
	}
	
	
	
	
	
	
	public void readNote()
	{
		System.out.println("\n\t****NOTES****");
		for(int i=0;i<note.length;i++ )
		{
			if(note[i] != null && note[i].getAuthor() != null)

			System.out.println(note[i]);
			
		}
	}
	
	
	
	public void updateNote()
	{
		readNote();
		System.out.print("\n\nWhich Note You Want To Edit ?"+"\n\nEnter the Idno : ");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		for(int i=0;i<note.length;i++)
		{
			if(note[i].getId()==id)	
			{
				note[i]=view.update();
				
			}
		}
	}
	
	
	public void deleteNote()
	{
		readNote();
		
		System.out.print("\n\nWhich Note You Want To Delete ?"+"\n\nEnter Idno : ");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		for(int i=0;i<note.length;i++)
		{
			if(note[i].getId()==id)
			{
				note[i]=null;
				System.out.println("Item Successfully Deleted");
			}
			
		}
		
	}
	
	
	
	
	public void mainMethod()
	{
		
		boolean x=true;
		while(x)
		{
			view.menu();
			Scanner s = new Scanner(System.in);
		
			System.out.print("\n Choose a option : ");
			int no = s.nextInt();
			System.out.println("\n\tYou Choose Option  "+no);
		
			switch(no)
			{
				case 1:
				addNote();
				break;
				case 2:
				this.readNote();
				break;
				case 3:
				this.updateNote();
				break;
				case 4:
				this.deleteNote();
				break;
				case 5:
				x=false;
				System.out.println("Exited");
				break;
				default:
				System.out.println("Wrong Input");
				break;
			}
		}
	}		
}
	
	
 
	
	
	
	