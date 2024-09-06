package com.divisosoft.fridge.fridgefor;
import com.divisosoft.fridge.fruits.Mango;

public class FridgeOfMango{
	public String name;
	public String color;
	public Mango[] mango=new Mango[5];

	public void MangoFridge(){
		System.out.println("\n"+"\t	FRIDGE FOR MANGO	\n");
		System.out.println(name);
		System.out.println(color);
	}
}
