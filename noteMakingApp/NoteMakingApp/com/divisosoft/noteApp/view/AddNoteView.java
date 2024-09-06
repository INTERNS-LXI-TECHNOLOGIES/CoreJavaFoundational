package com.divisosoft.noteApp.view;
import com.divisosoft.noteApp.controler.Control;
import com.divisosoft.noteApp.model.Note;
import java.util.Scanner;

public class AddNoteView{
	Scanner s=new Scanner(System.in);

	public void addDetails(Note[] notes){
		System.out.print(" ENTER ID: ");
		int id=s.nextInt();
		s.nextLine();
		System.out.print(" ENTER NOTE: ");
		String note=s.nextLine();
		System.out.print(" ENTER AUTHOR: ");
		String author=s.nextLine();
		System.out.print(" ENTER SUBJECT: ");
		String subject=s.nextLine();
		
		for(int i = 0; i < notes.length; i++) {
			if(notes[i] == null) {
				notes[i] = new Note();
				notes[i].setId(id);
				notes[i].setNote(note);
				notes[i].setAuthor(author);
				notes[i].setSubject(subject);
			}
		}
	}
}