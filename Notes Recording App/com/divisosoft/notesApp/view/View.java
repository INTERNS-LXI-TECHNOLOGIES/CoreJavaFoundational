package com.divisosoft.notesApp.view;
import java.util.Scanner;
import com.divisosoft.notesApp.model.Notes;


public class View{
   
  Scanner scanner = new Scanner(System.in);

  
   public void viewMenu(){
	  System.out.println("\n"+"...******Notes Recording App******..."+"\n"); 
	  System.out.println("1.Create Notes ");
	  System.out.println("2.Read Notes "); 
	  System.out.println("3.Update Notes "); 
	  System.out.println("4.Delete Notes "); 
	  System.out.println("5.Exit Application");
	  System.out.println("Enter your Choice : ");
	 
    }


   public Notes viewCreateNote(){
      
	  Notes note = new Notes();

	  System.out.println("Enter ID Number : ");
	  int number = Integer.parseInt(scanner.nextLine());
	  note.setIdNumber(number);
	
	  System.out.println("Enter Author : ");
	  note.setAuthor(scanner.nextLine());
	
	  System.out.println("Enter Subject : ");
	  note.setSubject(scanner.nextLine());
	  
	  System.out.println("Enter Note : ");
   	  note.setNote(scanner.nextLine());
	 
	 return note;  
    }

   public Notes viewEditNote(){
	   
  	  Notes note = new Notes();

	  System.out.println("Enter New ID Number : ");
	  int idnum = Integer.parseInt(scanner.nextLine());
	  note.setIdNumber(idnum);
	  System.out.println("Enter New Author : ");
	  note.setAuthor(scanner.nextLine());
	  System.out.println("Enter New Subject : ");
	  note.setSubject(scanner.nextLine());
	  System.out.println("Enter New Note : ");
   	  note.setNote(scanner.nextLine());
	 
	 return note;  
	   
   }

}