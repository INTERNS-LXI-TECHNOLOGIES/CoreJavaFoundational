package com.divisosoft.fridge.fridge; 
import com.divisosoft.fridge.fruitstray.FruitsTray;

public class Fridge{
public String name;
public String color;
public FruitsTray[] fruitstray=new FruitsTray[10];

public String toString(){
	return "\t	FRIDGE	\n"+"BRAND NAME: "+name+"\n"+"BRAND NAME: "+color+"\n"+"\t	FRUITS TRAY	";
}
}