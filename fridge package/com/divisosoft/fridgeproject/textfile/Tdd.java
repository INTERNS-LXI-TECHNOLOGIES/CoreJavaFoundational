package com.divisosoft.fridgeproject.textfile;
import com.divisosoft.fridgeproject.fridge.Fridge;
import com.divisosoft.fridgeproject.tray.*;
import com.divisosoft.fridgeproject.fruit.*;
import com.divisosoft.fridgeproject.vegetable.*;
import com.divisosoft.fridgeproject.groceries.*;

public class Tdd{
	public static void main(String[]argc){
	
		Fridge fridge = new Fridge();
		fridge.name = "Samsung";
		fridge.colour = "Red";

		System.out.println("\n      FridgeDetails      ");
		System.out.println(fridge.name);
		System.out.println(fridge.colour);
	
		Fruits fruits=new Fruits();

		System.out.println("\n     FRUITS      ");
	for(int i = 0 ; i<4 ; i++) {
		
		fridge.fruits[i] = new Apple();
		fridge.fruits[i].name = "Apple";
		System.out.println(fridge.fruits[i].name);
	}
	for(int i = 4 ; i<7 ; i++) {
		
		fridge.fruits[i] = new Orange();
		fridge.fruits[i].name = "Orange";
		System.out.println(fridge.fruits[i].name);
	}
	for(int i = 7 ; i<10; i++) {
		
		fridge.fruits[i] = new Mango();
		fridge.fruits[i].name = "Mango";
		System.out.println(fridge.fruits[i].name);
		
	}
		Fridge appleFridge = new Fridge();
		Fridge orangeFridge = new Fridge();
		Fridge mangoFridge = new Fridge();
		
		System.out.println("\n      APPLE FRIDGE      ");
	for(int i=0,a=0; i<fridge.fruits.length ; i++){
		
		if(fridge.fruits[i] instanceof Apple){
		appleFridge.appleTray[a] = (Apple)fridge.fruits[i];
		System.out.println(appleFridge.appleTray[a]);
	}
	}
	    System.out.println("\n      ORANGE FRIDGE      ");
	for(int i=0,b=0; i<fridge.fruits.length ; i++){
		
		if(fridge.fruits[i] instanceof Orange){
		orangeFridge.orangeTray[b] =(Orange)fridge.fruits[i];
		System.out.println(orangeFridge.orangeTray[b]);	
	}	
	}
	    System.out.println("\n      MANGO FRIDGE      ");
	for(int i=0,c=0; i<fridge.fruits.length ; i++){
		
		if(fridge.fruits[i] instanceof Mango){
		mangoFridge.mangoeTray[c] =(Mango)fridge.fruits[i];
  		System.out.println(mangoFridge.mangoeTray[c]);		
	}
  }
		Vegtables vegtables=new Vegtables();
		
		System.out.println("\n     VEGETABLES      ");
		for(int i = 0 ; i<4 ; i++) {
		
		fridge.vegtables[i] = new Cucumber();
		fridge.vegtables[i].name = "Cucumber";
		System.out.println(fridge.vegtables[i].name);
	}
	for(int i = 4 ; i<7 ; i++) {
		fridge.vegtables[i] = new Brinjal();
		fridge.vegtables[i].name = "Brinjal";
		System.out.println(fridge.vegtables[i].name);
	}
	for(int i = 7 ; i<10; i++) {
		fridge.vegtables[i] = new Tomato();
		fridge.vegtables[i].name = "Tomato";
		System.out.println(fridge.vegtables[i].name);
	}
		Fridge cucumberFridge = new Fridge();
		Fridge brinjalFridge = new Fridge();
		Fridge tomatoFridge = new Fridge();
  
       	System.out.println("\n      CUCUMBER FRIDGE      ");
    for(int i=0,a=0; i<fridge.vegtables.length ; i++){
		
		if(fridge.vegtables[i] instanceof Cucumber){
		cucumberFridge.cucumberTray[a] = (Cucumber)fridge.vegtables[i];
		System.out.println(cucumberFridge.cucumberTray[a]);
	}
    }
        System.out.println("\n      BRINJAL FRIDGE      ");
    for(int i=0,b=0; i<fridge.vegtables.length ; i++){
		
		if(fridge.vegtables[i] instanceof Brinjal){
		brinjalFridge.brinjalTray[b] =(Brinjal)fridge.vegtables[i];
		System.out.println(brinjalFridge.brinjalTray[b]);	
	}	
    }
       	System.out.println("\n      TOMATO FRIDGE      ");
    for(int i=0,c=0; i<fridge.vegtables.length ; i++){
		
		if(fridge.vegtables[i] instanceof Tomato){
		tomatoFridge.tomatoTray[c] =(Tomato)fridge.vegtables[i];
  		System.out.println(tomatoFridge.tomatoTray[c]);		
    }
  }
        Grocery grocery =new Grocery();
		
		System.out.println("\n     GROCERIES      ");
		for(int i = 0 ; i<4 ; i++) {
		
		fridge.grocery[i] = new Milk();
		fridge.grocery[i].name = "Milk";
		System.out.println(fridge.grocery[i].name);
	}
	for(int i = 4 ; i<7 ; i++) {
		fridge.grocery[i] = new Chocolate();
		fridge.grocery[i].name = "Chocolate";
		System.out.println(fridge.grocery[i].name);
	}
	for(int i = 7 ; i<10; i++) {
		fridge.grocery[i] = new Egg();
		fridge.grocery[i].name = "Egg";
		System.out.println(fridge.grocery[i].name);
	}
		Fridge milkFridge = new Fridge();
		Fridge chocolateFridge = new Fridge();
		Fridge eggFridge = new Fridge();
 
       	System.out.println("\n      MILK FRIDGE      ");
    for(int i=0,a=0; i<fridge.grocery.length ; i++){
		
		if(fridge.grocery[i] instanceof Milk){
		milkFridge.milkTray[a] = (Milk)fridge.grocery[i];
		System.out.println(milkFridge.milkTray[a]);
	}
    }
        System.out.println("\n      CHOCOLATE FRIDGE      ");
    for(int i=0,b=0; i<fridge.grocery.length ; i++){
		
		if(fridge.grocery[i] instanceof Chocolate){
		chocolateFridge.chocolateTray[b] =(Chocolate)fridge.grocery[i];
		System.out.println(chocolateFridge.chocolateTray[b]);	
	}	
    }
        System.out.println("\n      EGG FRIDGE      ");
    for(int i=0,c=0; i<fridge.grocery.length ; i++){
		
		if(fridge.grocery[i] instanceof Egg){
		eggFridge.eggTray[c] =(Egg)fridge.grocery[i];
  		System.out.println(eggFridge.eggTray[c]);		
    }
  }
 }
 }