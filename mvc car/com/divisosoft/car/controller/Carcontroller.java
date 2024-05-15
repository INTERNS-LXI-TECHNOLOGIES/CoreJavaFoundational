package com.divisosoft.car.controller;
import com.divisosoft.car.view.Carview;
public class Carcontroller{
	
	public void ShowCarDetails(){
		
		System.out.println("Colour is \t:"+"Red");
	
		
	}
	
 public void ShowcarBrandname(){
	 
	 Carview carview = new Carview();
	 carview.printBrandname();
 }
	
	
}