package com.lxisoft.ghost.view;
import com.lxisoft.ghost.controller.Ghostcontroller;
import java.util.Scanner;
public class Ghostview{
	
static Scanner sc = new Scanner(System.in);
public void ghostScanner(){
	
	Ghostcontroller ghostcontroller= new Ghostcontroller();
	boolean flag=true;
	while(flag){
		
		System.out.println("Welcome to Groveyard");
		System.out.println("Let's create the fear");
		System.out.println("press 1 to create ghost");
		System.out.println("press 2 to Read");
		
		
		String check = sc.nextLine();
	  switch(check){
		  
		  case "1":
		    ghostcontroller.Create();
			break;
			
		
		        
	  }
		
		
	}
	
}


	

public void printghostname(){
	
	Ghostcontroller ghostcontroller = new Ghostcontroller();
	
	ghostcontroller.showGhostname();
}

public void showAge(){
	
	System.out.println("age is\t:"+35);
}

}