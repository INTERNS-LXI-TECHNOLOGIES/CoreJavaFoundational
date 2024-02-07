package com.divisosoft.fridge.textfile;
import com.divisosoft.fridge.fridge.Fridge;
import com.divisosoft.fridge.fruits.*;
import com.divisosoft.fridge.fridgefor.*;

public class Tdd{
public static void main(String[]args){
	
	Fridge fridge=new Fridge();
	fridge.name="LG";
	fridge.color="SILVER";
	fridge.FridgeDetails();
	
	Fruit fruit=new Fruit();

	for (int i = 0; i < fruit.apple.length; i++) {
		fruit.apple[i] = new Apple();
		fruit.apple[i].name = "APPLE ";
		fruit.apple[i].Fruitdetails();
	}

	for (int i=0;i<fruit.orange.length;i++){
		fruit.orange[i]=new Orange();
		fruit.orange[i].name="ORANGE";
		fruit.orange[i].Fruitdetails();
	}
	
	for (int i=0;i<fruit.mango.length;i++){
		fruit.mango[i]= new Mango();
		fruit.mango[i].name="MANGO";
		fruit.mango[i].Fruitdetails();
	}
	
	
	FridgeOfApple fridgeofapple=new FridgeOfApple();
	fridgeofapple.name="BRAND NAME: "+"SAMSUNG";
	fridgeofapple.color="COLOR OF FRIDGE: "+"RED";
		
	FridgeOfMango fridgeofmango=new FridgeOfMango();
	fridgeofmango.name="BRAND NAME: "+"ONEPLUS";
	fridgeofmango.color="COLOR OF FRIDGE: "+"YELLOW";
	
	FridgeOfOrange fridgeoforange=new FridgeOfOrange();
	fridgeoforange.name="BRAND NAME: "+"YONIX";
	fridgeoforange.color="COLOR OF FRIDGE: "+"ORANGE";
	
		fridgeofapple.AppleFridge();
		for(int i=0; i<fruit.apple.length;i++){
			if(fruit.apple[i] instanceof Apple){
				for(int a=0; a<fridgeofapple.apple.length; a++){
					fridgeofapple.apple[a]=fruit.apple[i];
				}
				fruit.apple[i].Fruitdetails();
			}
		}
		fridgeoforange.OrangeFridge();
		for(int i=0; i<fruit.orange.length;i++){
			if(fruit.orange[i] instanceof Orange){
				for(int o=0; o<fridgeoforange.orange.length; o++){
					fridgeoforange.orange[o]=fruit.orange[i];
				}
				fruit.orange[i].Fruitdetails();
			}
		}
		fridgeofmango.MangoFridge();
		for(int i=0; i<fruit.mango.length;i++){
			if(fruit.mango[i] instanceof Mango){
				for(int m=0; m<fridgeofmango.mango.length; m++){
					fridgeofmango.mango[m]=fruit.mango[i];
				}
				fruit.mango[i].Fruitdetails();
			}
		}
	}
} 