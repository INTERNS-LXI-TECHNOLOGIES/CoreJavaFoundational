package com.divisosoft.notesApp.controller;
import com.divisosoft.notesApp.view.View;
import com.divisosoft.notesApp.model.Notes;
import java.util.Scanner;

public class Controller{
	
	View view = new View();
	Notes [] notes = new Notes[100];
    Scanner scan = new Scanner(System.in);

	
  public Controller(){
	   for(int i=0; i<notes.length; i++){
		   notes[i]= new Notes();
	    }
	}
 
 public void createNotes(){
	 
	  boolean x = true;
	  
	  while(x){
	      for(int i = 0 ; i < notes.length ; i++){
	           if(notes[i] == null || notes[i].getAuthor() == null){
		            notes[i] = view.viewCreateNote();
			        System.out.println("\n"+"Note Saved"+"\n");
				    break;

                }
				
		    }
		
		  System.out.println("Do you want to create another note(yes/no) : ");
		  String data = scan.nextLine();
		  
		  switch(data){
			  case "yes":
			      x = true;
				  break;
			  case "no":
			      x = false;
				  break;
			  default:
			      x = false;
				  System.out.println("... ERROR ...");
				  break;
		    }
		}
    }

  public void showAllNotes(){
	 
	  for(int i = 0 ; i < notes.length ; i++){
		  if(notes[i] != null && notes[i].getAuthor() != null){
		      System.out.println(notes[i]);
		    }
		}
    }

  public void editNotes(){
	  
	  for(int i = 0 ; i < notes.length ; i++){
		  if(notes[i] != null && notes[i].getAuthor() != null){
		      System.out.println(notes[i]);
		    }
		}
	  
	  System.out.println("Enter the id of the note to be edited : ");
	  String athr = scan.nextLine();
	  boolean id = false;

	   for(int i = 0 ; i < notes.length ; i++){
		  if(notes[i] != null && notes[i].getAuthor().equals(athr)){
			  notes[i] = view.viewEditNote();
			  id = true;
			  System.out.println("Note with Auhtor name "+ athr +" has been edited");
			  break;
		    }
	    }
	  if(!id){
		  System.out.println("Note with Author name "+ athr +" has not found");
	    }
	    
	  
    }

  public void deleteNotes(){
	  for(int i = 0 ; i < notes.length ; i++){
		  if(notes[i] != null && notes[i].getAuthor() != null){
		      System.out.println(notes[i]);
		    }
		}
	  
	  System.out.println("Enter the Author of the note to be deleted : ");
	  String auth = scan.nextLine();
	  boolean y = false;

	   for(int i = 0 ; i < notes.length ; i++){
		  if(notes[i] != null && notes[i].getAuthor().equals(auth)){
			  notes[i] = null;
			  y = true;
			  System.out.println("Note with  Author name "+ auth +" has been deleted");
			  break;
		    }
	    }	
	   if(!y){
		  System.out.println("Note with id Author name "+ auth +" has not found");
		}
	    
		
	  
    }
	 public void Menu(){
	 boolean  not = true;
	 while(not){
		  view.viewMenu();
		  int value = scan.nextInt();
		  scan.nextLine();
		  
		  switch(value){
			  case 1:
			       createNotes();
				   break;
			  case 2:
			       showAllNotes();
				   break;
			  case 3:
			       editNotes();
				   break;
			  case 4:
			       deleteNotes();
				   break;
			  case 5:
			       not = false;
			       System.out.println("Thank you for using Note Taking App.");
				   break;
			  default :
		           System.out.println("Invalid input. Please set an option from the below menu.");
				   break;
		    }
		} 
	}
	

}