package com.divisosoft.car.view;
import com.divisosoft.car.controller.Carcontroller;

public class Carview{
	
	
	
	
	public void printCar(){
		
		Carcontroller carcontroller = new Carcontroller();
		carcontroller.ShowCarDetails();
	}
	
   public void printBrandname(){
	   
	   System.out.println("brandname is\t:"+"alto");
   }
	
}