package com.divisosoft.noteApp.view;
import com.divisosoft.noteApp.controler.Control;
import com.divisosoft.noteApp.model.Note;
import java.util.Scanner;

public class DeleteNoteView{
    Scanner s = new Scanner(System.in);
    
    public void deleteNoteView(Note[] notes){
        System.out.print(" SEARCH DETAILS TO BE DELETED--ID/AUTHOR/SUBJECT: ");
        String deleteNote = s.nextLine();
        if(deleteNote.equalsIgnoreCase("ID")){
            System.out.print(" ENTER ID: ");
            int id = s.nextInt();
            for(int i=0;i< notes.length;i++){
                if(notes[i]!=null && notes[i].getId()==id) {
                    notes[i]=null;
					System.out.println(" SUCCESSFULLY DELETED");
                    break;
                }
				else{
					System.out.println(" DETAILS NOT DELETED");
					break;
				}
            }
        }	
        else if(deleteNote.equalsIgnoreCase("AUTHOR")){
            System.out.print(" ENTER AUTHOR NAME: ");
            String author = s.nextLine();
            for(int i=0;i< notes.length;i++){
                if(notes[i]!=null && notes[i].getAuthor().equalsIgnoreCase(author)) {
                    notes[i]=null;
					System.out.println(" SUCCESSFULLY DELETED");
                    break;
                }
				else{
					System.out.println(" DETAILS NOT DELETED");
					break;
				}
            }
        }
        else if(deleteNote.equalsIgnoreCase("SUBJECT")){
            System.out.print(" ENTER SUBJECT NAME: ");
            String subject = s.nextLine();
            for(int i =0;i< notes.length;i++){
                if(notes[i]!=null && notes[i].getSubject().equalsIgnoreCase(subject)) {
                    notes[i]=null;
					System.out.println(" SUCCESSFULLY DELETED");
                    break;
                }
				else{
					System.out.println(" DETAILS NOT DELETED");
					break;
				}
            }
        }
		else{
			System.out.println(" INVALID DETAILS");
		}
    }
}
