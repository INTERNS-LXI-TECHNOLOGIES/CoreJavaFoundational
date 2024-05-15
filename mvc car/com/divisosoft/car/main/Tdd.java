package com.divisosoft.car.main;
import com.divisosoft.car.view.Carview;
import com.divisosoft.car.controller.Carcontroller;

public class Tdd{
	
	public static void main(String[]args){
		
		Carview carview = new Carview();
		carview.printCar();
		
		
		Carcontroller carcontroller = new Carcontroller();
		carcontroller.ShowcarBrandname();
		
	
		
	}
}