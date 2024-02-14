package com.divisosoft.fridge.fridgefor;
import com.divisosoft.fridge.fruitstray.Orange;

public class FridgeForOrange{
	public String name;
	public String color;
	public Orange[] orangetray=new Orange[2];

	public String toString(){
		return "\t	FRIDGE FOR ORANGE	\n"+"BRAND NAME: "+name+"\n"+"FRIDGE COLOR: "+color;
	}
}