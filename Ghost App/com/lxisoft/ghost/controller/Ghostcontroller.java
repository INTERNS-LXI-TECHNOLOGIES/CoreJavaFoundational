package com.lxisoft.ghost.controller;
import com.lxisoft.ghost.view.Ghostview;
import java.util.Scanner;
import com.lxisoft.ghost.model.Ghostmodel;
public class Ghostcontroller{


		
		
public void showGhostname(){
	
	System.out.println("ghost name is\t:"+"Neelima");
}


public void printAge(){
	
	 Ghostview ghostview = new Ghostview();
	 ghostview.showAge();
	
}

static Scanner scanner = new Scanner(System.in);


Ghostmodel[] ghost= new Ghostmodel[2];
public void Create(){
	
	
	for(int i=0;i<ghost.length;i++){
		    Ghostmodel ghostmodel = new Ghostmodel();

		System.out.println("Enter the ghostname");
		ghostmodel.setName(scanner.nextLine()); 
		
		System.out.println("Enter the Age");
		ghostmodel.setAge(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter the Death reason");
		ghostmodel.setDeath(scanner.nextLine());
		ghost[i]=ghostmodel;
		
		
	}
}	
	
	public void read(){
		
		for(int i=0;i<ghost.length;i++){
			
			System.out.println(ghost[i].toString());
		}
	}




} 