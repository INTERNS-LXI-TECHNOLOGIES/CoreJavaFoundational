package com.lxisoft.view;


public class Update{
	
	public void updateNote() {
        System.out.println("ENTER YOUR ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
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


}