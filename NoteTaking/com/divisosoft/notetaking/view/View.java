package com.divisosoft.notetaking.view;
import com.divisosoft.notetaking.view.View;
import com.divisosoft.notetaking.model.Note;
import com.divisosoft.notetaking.controller.Controller;
import java.util.Scanner;
public class View{
Scanner scanner= new Scanner(System.in);


public void menu(){
	    
	 System.out.println("*****Notes Recording App******");
	 System.out.println("1.Create Notes");
	 System.out.println("2.Read Notes");
	 System.out.println("3.Update Notes");
	 System.out.println("4.Delete Notes");
	 System.out.println("5.Exit");
	 System.out.println("Choose a option");
	}
	
public  Note viewCreateNote(){
     Note note=new Note();
     System.out.println("Enter ID: ");
     note.setidNumber(scanner.nextInt());
	 scanner.nextLine();
     System.out.println("Enter Author: ");
     note.setAuthor(scanner.nextLine());
     System.out.println("Enter Subject: ");
     note.setSubject(scanner.nextLine());
     System.out.println("Enter Note: ");
     note.setNotes(scanner.nextLine());
     return note; 
    }
	
	public  Note viewUpdateNote(){
     Note note=new Note();
     System.out.println("Enter New ID: ");
     note.setidNumber(scanner.nextInt());
	 scanner.nextLine();
     System.out.println("Enter New Author: ");
     note.setAuthor(scanner.nextLine());
     System.out.println("Enter New Subject: ");
     note.setSubject(scanner.nextLine());
     System.out.println("Enter New Note: ");
     note.setNotes(scanner.nextLine());
     return note; 
    }


}