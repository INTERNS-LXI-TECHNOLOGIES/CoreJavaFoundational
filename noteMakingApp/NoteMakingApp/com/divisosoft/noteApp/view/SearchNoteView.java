package com.divisosoft.noteApp.view;
import com.divisosoft.noteApp.controler.Control;
import com.divisosoft.noteApp.model.Note;
import java.util.Scanner;

public class SearchNoteView{
	Scanner s=new Scanner(System.in);

	public void searchDetails(Note[] notes){
		System.out.print(" DO YOU WANT TO SEARCH BY ID/AUTHOR/SUBJECT: ");
		String searchNote =s.nextLine();
		s.nextLine();
		if(searchNote.equalsIgnoreCase("ID")){
			System.out.print(" ENTER ID: ");
			int id=s.nextInt();
			for(int i=0;i<notes.length;i++){
				if(notes[i]!=null && notes[i].getId()==id) {
					printNoteDetails(notes[i]);
					break;
				}
				else{
					System.out.print(" DETAILS NOT FOUND");
					break;
				}
			}	
		}
		else if(searchNote.equalsIgnoreCase("AUTHOR")){
			System.out.print(" ENTER AUTHOR NAME: ");
			String author=s.nextLine();
			for(int i=0;i<notes.length;i++){
				if(notes[i]!=null && notes[i].getAuthor().equalsIgnoreCase(author)) {
					printNoteDetails(notes[i]);
					break;
				}
				else{
					System.out.print(" DETAILS NOT FOUND");
					break;
				}
			}
		}
		else{
			System.out.print(" ENTER SUBJECT NAME: ");
			String subject=s.nextLine();
			for(int i=0;i<notes.length;i++){
				if(notes[i]!=null && notes[i].getSubject().equalsIgnoreCase(subject)) {
					printNoteDetails(notes[i]);
					break;
				}
				else{
					System.out.print(" DETAILS NOT FOUND");
					break;
				}
			}
		}	
	}
	public void printNoteDetails(Note note) {
		System.out.println(" ID: " + note.getId());
		System.out.println(" Note: " + note.getNote());
		System.out.println(" Author: " + note.getAuthor());
		System.out.println(" Subject: " + note.getSubject());
	}
}