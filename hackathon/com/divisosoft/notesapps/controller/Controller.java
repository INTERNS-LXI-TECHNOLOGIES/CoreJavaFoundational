package com.divisosoft.notesapps.controller;
import com.divisosoft.notesapps.view.View;
import com.divisosoft.notesapps.model.Notes;
import java.util.Scanner;

public class Controller{
Notes[] notes=new Notes[3];
View view=new View();
Scanner scanner=new Scanner(System.in);
boolean page= true;

    
   public void ControllerViewMenu(){
	
	System.out.println("*********WELCOME TO NOTESAPP**********");
	
	while(page){
	System.out.println("");	
	view.viewFeatures();	
	System.out.println("Select any option: ");
	
	int option=scanner.nextInt();
	scanner.nextLine();
	
	
		switch(option){
		
		case 1:
		view.createNote(notes);
		break;
		
		case 2:
		view.readMethod(notes);
		break;
		
		case 3:
		view.updateNotes(notes);
		break;
		
		case 4:
		view.deleteNotes(notes);
		break;
		
		case 5:
		page=false;
		break;
		
		default:
		System.out.println("invalid option");
		
		}
	}
	
}


}