package com.divisosoft.fridge.fridgefor;
import com.divisosoft.fridge.fruitstray.Apple;

public class FridgeForApple{
	public String name;
	public String color;
	public Apple[] appletray=new Apple[3];

	public String toString(){
		return "\t	FRIDGE FOR APPLE	\n"+"BRAND NAME: "+name+"\n"+"FRIDGE COLOR: "+color;
	}
}