package com.lxi.notes.main;
import com.lxi.notes.controller.Controller;
public class Tdd{
	public static void main(String args[]){
		System.out.println("...WELCOME TO NOTES TAKING APP...");
		Controller controller=new Controller();
		//controller.viewnotes();
		controller.main();
		
	}
}