package com.lxisoft.view;

import com.lxisoft.model.Note;
import java.util.Scanner;

public class CreateView {
     Scanner scanner = new Scanner(System.in);

    public Note createNote() {
		
        System.out.println("ENTER YOUR ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ENTER YOUR NOTES HERE");
        String noteText = scanner.nextLine();
        System.out.println("ENTER YOUR AUTHOR NAME");
        String author = scanner.nextLine();
        System.out.println("ENTER YOUR SUBJECT");
        String subject = scanner.nextLine();

        return new Note(id, noteText, author, subject);
    }
}
