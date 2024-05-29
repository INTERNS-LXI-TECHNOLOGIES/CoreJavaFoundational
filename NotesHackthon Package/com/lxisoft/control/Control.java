package com.lxisoft.control;

import com.lxisoft.view.View;
import com.lxisoft.model.Note;
import java.util.Scanner;

public class Control {
     Scanner scanner = new Scanner(System.in);
     View view = new View();
     ControlView controlView = new ControlView();
     ControlRead controlRead = new ControlRead();

     Note[] notes = new Note[100];
     int noteCount = 0;
     boolean running = true;

    public void controlNotes() {
        while (running) {
            view.showNotesDetails();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (noteCount < notes.length) {
                        notes[noteCount] = controlView.createNote();
                        noteCount++;
                        System.out.println("Note created successfully!");
                    } else {
                        System.out.println("Note storage is full!");
                    }
                    break;
                case 2:
                    controlRead.readNotes(notes);
                    break;
                case 3:
                    updateNote();
                    break;
                case 4:
                    deleteNote();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    public void updateNote() {
		
        System.out.println("ENTER YOUR ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
		
        for (int i = 0; i < noteCount; i++) {
			
            if (notes[i] != null && notes[i].getId() == id) {
                System.out.println("ENTER YOUR UPDATED NOTES HERE");
                String noteText = scanner.nextLine();
                System.out.println("ENTER YOUR UPDATED AUTHOR NAME");
                String author = scanner.nextLine();
                System.out.println("ENTER YOUR UPDATED SUBJECT");
                String subject = scanner.nextLine();
                notes[i] = new Note(id, noteText, author, subject);
                System.out.println("Note updated successfully!");
                return;
            }
        }
        System.out.println("Note not found.");
    }

    public void deleteNote() {
		
        System.out.println("ENTER YOUR ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
		
        for (int i = 0; i < noteCount; i++) {
			
            if (notes[i] != null && notes[i].getId() == id) {
                notes[i] = null;
                System.out.println("Note deleted successfully!");
                return;
            }
        }
        System.out.println("Note not found.");
    }
}
