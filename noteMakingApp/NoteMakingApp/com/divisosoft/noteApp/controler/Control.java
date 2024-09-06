package com.divisosoft.noteApp.controler;
import com.divisosoft.noteApp.view.View;
import com.divisosoft.noteApp.model.Note;
import com.divisosoft.noteApp.view.AddNoteView;
import com.divisosoft.noteApp.view.SearchNoteView;
import com.divisosoft.noteApp.view.UpdateNoteView;
import com.divisosoft.noteApp.view.DeleteNoteView;
import java.util.Scanner;

public class Control{
	Scanner s=new Scanner(System.in);
	View v=new View();
	Note[] notes=new Note[50];
	AddNoteView addView = new AddNoteView();
	SearchNoteView searchView = new SearchNoteView();
	UpdateNoteView updateView = new UpdateNoteView();
	DeleteNoteView deleteView = new DeleteNoteView();
	boolean page=true;
	
	public void controlerMethod(){
		v.viewDetails();
		
		while(page){
			System.out.print("\n Enter your option: ");
			int option=s.nextInt();
			s.nextLine();
	
			if(option<6){
				System.out.println(" You Have Selected Option Number: "+option+"\n");
			}
		
			switch(option){
				case 1:
				addView.addDetails(notes);
				break;
			
				case 2:
				searchView.searchDetails(notes);
				break;
				
				case 3:
				updateView.updateDetails(notes);
				break;
			
				case 4:
				deleteView.deleteNoteView(notes);
				break;
				
				case 5:
				page=false;
				break;
			
				default:
				System.out.println("INVALID OPTION");
			}
		}
	}
}