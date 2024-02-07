package com.divisosoft.fridge.fridge;
import com.divisosoft.fridge.fruits.Fruit;

 public class Fridge{
	public String name;
	public String color;
	public Fruit fruit;	
	
	
	public void FridgeDetails(){
		System.out.println("\t	FRIDGE	\n");
		System.out.println("Fridge Name: "+name);
		System.out.println("Fridge color: "+color);
		System.out.println("\n"+"\t	FRUITS TRAY	\n");
	}

	
 }