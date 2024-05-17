package com.lxi.notes.view;
import com.lxi.notes.model.Notes;
import java.util.Scanner;
public class View{
public Notes notes=new Notes();
 public Scanner scanner=new Scanner(System.in);

    public void menu(){

		System.out.println("1.create notes");
	    
		System.out.println("2.read notes");
	    
		System.out.println("3.update notes");
	   
		System.out.println("4.delete notes");
	    
		System.out.println("5.Exist");
		
    }	
	
    public Notes createnotes(){
		System.out.println("Enter note id");
	    notes.setNoteid(scanner.nextLine());
		System.out.println("Enter note author");
	     notes.setAuthor(scanner.nextLine());
		System.out.println("Enter note subject");
	      notes.setSubjects(scanner.nextLine());
		System.out.println("Enter note notes");
	 	 notes.setNotes(scanner.nextLine());
		 return notes;
	}
    public Notes updatenotes(){
		
		System.out.println("Enter new note author");
	    notes.setAuthor(scanner.nextLine());
	    System.out.println("Enter new note id");
	    notes.setNoteid(scanner.nextLine());
		System.out.println("Enter new note subject");
	    notes.setSubjects(scanner.nextLine());
		System.out.println("Enter new note notes");
	 	notes.setNotes(scanner.nextLine());
		 return notes;	
	
    }	
    }
	
	
	
	
