package com.divisosoft.fridge.fridgefor;
import com.divisosoft.fridge.fruitstray.Mango;

public class FridgeForMango{
	public String name;
	public String color;
	public Mango[] mangotray=new Mango[5];

	public String toString(){
		return "\t	FRIDGE FOR MANGO	\n"+"BRAND NAME: "+name+"\n"+"FRIDGE COLOR: "+color;
	}
}