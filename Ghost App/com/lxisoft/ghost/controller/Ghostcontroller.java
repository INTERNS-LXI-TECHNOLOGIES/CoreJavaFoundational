package com.lxisoft.ghost.controller;
import com.lxisoft.ghost.view.Ghostview;
import java.util.Scanner;
import com.lxisoft.ghost.model.Ghostmodel;
public class Ghostcontroller{

Ghostmodel ghostmodel = new Ghostmodel();

		
		
public void showGhostname(){
	
	System.out.println("ghost name is\t:"+"Neelima");
}


public void printAge(){
	
	 Ghostview ghostview = new Ghostview();
	 ghostview.showAge();
	
}

static Scanner scanner = new Scanner(System.in);

public void Create(){
	
	System.out.println("Enter the ghostname");  
	ghostmodel.setName(scanner.nextLine());
	
    System.out.println(ghostmodel.getName());
	System.out.println("Enter the ghostage");
	int y=scanner.nextInt(); 
	System.out.println("Enter the Deathreason");
	ghostmodel.setDeathreason(scanner.next());
	scanner.nextLine();
	System.out.println(ghostmodel.getDeathreason());	
	
}




} 