package com.divisosoft.notetaking.controller;
import com.divisosoft.notetaking.view.View;
import com.divisosoft.notetaking.model.Note;
import java.util.Scanner;
public class Controller{
Scanner scanner= new Scanner(System.in);
 Note[] notes=new Note[100];
 public View view=new View();
 
    public Controller() {
		
        for (int i = 0; i < notes.length; i++) {
			if(notes[i]==null){
             notes[i] = new Note();
		    }
		}
		
    }
 
public void createNote(){
	boolean x=true;
	for (int i=0; i < notes.length; i++) {
	 while(x){
         notes[i] = view.viewCreateNote() ;
		 System.out.println("\n" + "Saved......." + "\n");
		 System.out.println("Do you want to add another note? (yes/no)");
		  String addNew = scanner.nextLine();
		  
		switch(addNew){
			case "yes":
			x=true;
			break;
			case "no":
			x=false;
			break;
			default:
			x=false;
			System.out.println(".....Error.....");
			break;
		}
	}
		
    }
}	
	
public void readNote(){
	    for (int i = 0; i < notes.length; i++) {
            if (notes[i].getNotes() != null) {
                System.out.println(notes[i]);
			}
        }
}
	
public void updateNote() {
	System.out.println("Saved Notes..");
	   for (int i = 0; i < notes.length; i++) {
            if (notes[i].getNotes() != null) {
                System.out.println(notes[i]);
			}
        }
        System.out.println("Enter the author name of the note you want to update: ");
        String authorName = scanner.nextLine();
        boolean noteFound = false;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getAuthor().equals(authorName)) {
                notes[i] = view.viewUpdateNote(); 
               noteFound = true;
                break;
            }
        }
        if (!noteFound) {
            System.out.println("Note with author name " + authorName + " not found.");
        }
    }
	
public void deleteNote() {
	System.out.println("Saved Notes..");
	for (int i = 0; i < notes.length; i++) {
            if (notes[i].getNotes() != null) {
                System.out.println(notes[i]);
			}
        }
    System.out.println("Enter the author name of the note you want to delete: ");
    String authorName = scanner.nextLine();
    boolean noteFound = false;
    for (int i = 0; i < notes.length; i++) {
        if (notes[i] != null && notes[i].getAuthor().equals(authorName)) {
            notes[i] = null; 
            noteFound = true;
            System.out.println("Note with author name " + authorName + " deleted.");
            break;
        }
    }
    if (!noteFound) {
        System.out.println("Note with author name " + authorName + " not found.");
    }
}

boolean page=true;	
 public void notetaking() {
        while (page) {
            view.menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 
			System.out.println("You selected option " + choice + "."+"\n");
            switch (choice) {
                case 1:
				System.out.println("creating new note");
                    createNote();

                    break;
                case 2:
                    readNote();
                    break;
                case 3:
                    updateNote();
                    break;
                case 4:
                    deleteNote();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    page=false; 
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
	
}



