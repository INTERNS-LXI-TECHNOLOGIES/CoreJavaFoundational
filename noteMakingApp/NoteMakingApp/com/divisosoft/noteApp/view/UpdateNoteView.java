package com.divisosoft.noteApp.view;
import com.divisosoft.noteApp.controler.Control;
import com.divisosoft.noteApp.model.Note;
import java.util.Scanner;

public class UpdateNoteView{
	Scanner s=new Scanner(System.in);
	
	public void updateDetails(Note[] notes) {
    System.out.print("SEARCH NOTES TO BE UPDATED BY ID: ");
    int updateId=s.nextInt();
    boolean noteFound=false;

    for (int i=0;i<notes.length;i++) {
        if (notes[i]!=null && notes[i].getId()==updateId) {
            noteFound=true;
            System.out.println("BEFORE UPDATE \n");
            printNoteDetails(notes[i]);
            System.out.print("SELECT DETAILS TO BE UPDATED (ID/AUTHOR/SUBJECT): ");
            String updateOption=s.next();

            if (updateOption.equalsIgnoreCase("ID")) {
                System.out.print("ENTER NEW ID: ");
                int newId=s.nextInt();
                notes[i].setId(newId);
            } else if (updateOption.equalsIgnoreCase("AUTHOR")) {
                System.out.print("ENTER NEW AUTHOR: ");
                String newAuthor=s.next();
                notes[i].setAuthor(newAuthor);
            } else if (updateOption.equalsIgnoreCase("SUBJECT")) {
                System.out.print("ENTER NEW SUBJECT: ");
                String newSubject=s.next();
                notes[i].setSubject(newSubject);
            } else {
                System.out.println("INVALID OPTION");
            }

            System.out.println("AFTER UPDATE \n");
            printNoteDetails(notes[i]);
            break;
        }
    }

    if (!noteFound) {
        System.out.println("DETAILS NOT FOUND");
    }
}

	public void printNoteDetails(Note note) {
		System.out.println(" ID: " + note.getId());
		System.out.println(" Note: " + note.getNote());
		System.out.println(" Author: " + note.getAuthor());
		System.out.println(" Subject: " + note.getSubject());
	}
}