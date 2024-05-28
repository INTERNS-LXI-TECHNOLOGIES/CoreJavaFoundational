package com.divisosoft.notesapps.view;
import com.divisosoft.notesapps.model.*;
import com.divisosoft.notesapps.controller.*;
import java.util.Scanner;

public class View{
   Scanner scanner=new Scanner(System.in);
   Notes[] notes=new Notes[5];
   
   
   public void viewFeatures(){
	   
   System.out.println("1:create note");
   System.out.println("2:read note");
   System.out.println("3:update note");
   System.out.println("4:delete note");
   System.out.println("5:exit application");
	   }
  
   
   public void createNote(Notes[] notes){
	   
	   System.out.println("Enterid:");
	   int id=scanner.nextInt();
	   scanner.nextLine();
	   
	   System.out.println("Enter Author");
	   String name=scanner.nextLine(); 
	   
	   System.out.println("enter subject");
	   String sub=scanner.nextLine();
	   
	   System.out.println("enter the notes");
	   String notess=scanner.nextLine();
	   
	   for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                notes[i] = new Notes(); 
                notes[i].setIdNumber(id);
                notes[i].setAuthor(name);
                notes[i].setSubject(sub);
                notes[i].setNote(notess);
                System.out.println("Saved successfully");
                break;
            }
        }
	  
   }
   
   public void readMethod(Notes[] notes){
	System.out.println("select id/author/subject to which note is you read");
	String selct=scanner.nextLine();
	

	if (selct.equalsIgnoreCase("AUTHOR")) {
        System.out.println("enter the Author name");
        String name = scanner.nextLine();

 
        for (int i = 0; i < notes.length; i++) {
			 
            if (notes[i] != null && notes[i].getAuthor().equals(name)) {
				
                System.out.println("ID: " + notes[i].getIdNumber());
                System.out.println("Author: " + notes[i].getAuthor());
                System.out.println("Subject: " + notes[i].getSubject());
                System.out.println("Note: " + notes[i].getNote());
                break;
            }
        }
    }

	else if(selct.equalsIgnoreCase("ID")){
		System.out.println("enter id");
		int id=scanner.nextInt();
		 
		   for (int i = 0; i < notes.length; i++)  {
                if (notes[i] != null && notes[i].getIdNumber() == id){
                    System.out.println("ID: " + notes[i].getIdNumber());
                    System.out.println("Author: " + notes[i].getAuthor());
                    System.out.println("Subject: " + notes[i].getSubject());
                    System.out.println("Note: " + notes[i].getNote());
                    break;
                }
            }
	}
	
				else if (selct.equalsIgnoreCase("Subject")) {
        System.out.println("enter the subject name");
        String sub = scanner.nextLine();

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null && notes[i].getSubject().equalsIgnoreCase(sub)) {
                System.out.println("ID: " + notes[i].getIdNumber());
                System.out.println("Author: " + notes[i].getAuthor());
                System.out.println("Subject: " + notes[i].getSubject());
                System.out.println("Note: " + notes[i].getNote());
                //selct = true; 
                break;
            }
        }
    } 
	else {
        System.out.println("Invalid selection."); 
    }
   }
	public void updateNotes(Notes[] notes) {
	System.out.println("Select 'id', 'author', or 'subject' to choose which note to update:");
        String select = scanner.nextLine();

        Notes noteToUpdate = null;

        // Locate the note to update based on user selection
        if (select.equalsIgnoreCase("AUTHOR")) {
            System.out.println("Enter the author name:");
            String name = scanner.nextLine();

            for (int i = 0; i < notes.length; i++) {
                if (notes[i] != null && notes[i].getAuthor().equalsIgnoreCase(name)) {
                    noteToUpdate = notes[i];
                    break;
                }
            }
        } else if (select.equalsIgnoreCase("ID")) {
            System.out.println("Enter the ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline

            for (int i = 0; i < notes.length; i++) {
                if (notes[i] != null && notes[i].getIdNumber() == id) {
                    noteToUpdate = notes[i];
                    break;
                }
            }
        } else if (select.equalsIgnoreCase("Subject")) {
            System.out.println("Enter the subject name:");
            String sub = scanner.nextLine();

            for (int i = 0; i < notes.length; i++) {
                if (notes[i] != null && notes[i].getSubject().equalsIgnoreCase(sub)) {
                    noteToUpdate = notes[i];
                    break;
                }
            }
        } else {
            System.out.println("Invalid selection.");
            return;
        }

        if (noteToUpdate != null) {
            System.out.println("ID: " + noteToUpdate.getIdNumber());
            System.out.println("Author: " + noteToUpdate.getAuthor());
            System.out.println("Subject: " + noteToUpdate.getSubject());
            System.out.println("Note: " + noteToUpdate.getNote());

            System.out.println("What do you want to update (id, author, subject, note)?");
            String updateInfo = scanner.nextLine();

            // Update the specific field of the note
            if (updateInfo.equalsIgnoreCase("id")) {
                System.out.println("Enter new ID:");
                int newId = Integer.parseInt(scanner.nextLine());
                noteToUpdate.setIdNumber(newId);
            } else if (updateInfo.equalsIgnoreCase("author")) {
                System.out.println("Enter new author:");
                String newAuthor = scanner.nextLine();
                noteToUpdate.setAuthor(newAuthor);
            } else if (updateInfo.equalsIgnoreCase("subject")) {
                System.out.println("Enter new subject:");
                String newSubject = scanner.nextLine();
                noteToUpdate.setSubject(newSubject);
            } else if (updateInfo.equalsIgnoreCase("note")) {
                System.out.println("Enter new note:");
                String newNote = scanner.nextLine();
                noteToUpdate.setNote(newNote);
            } else {
                System.out.println("Invalid update option.");
            }
        } else {
            System.out.println("Note not found.");
        }
    }
    public void deleteNotes(Notes[] notes){
	
	
			System.out.println("enter the author name which note is deleted");
	        String n=scanner.nextLine();
			boolean x = false;
	    for (int i = 0; i < notes.length; i++) {
			
			if (notes[i] != null && notes[i].getAuthor().equals(n)){
				notes[i]=null;
				System.out.println("the note successfully deleted");
				x = true;
				break;
				
		    }
	}			
	if (!x){
			System.out.println("Error... ");
		
	}
	}
}




//notes.setIdNumber(scanner.nextInt());
//notes.setAuthor(scanner.nextLine());
 // notes.setSubject(scanner.nextLine());
 // notes.setNote(scanner.nextLine());