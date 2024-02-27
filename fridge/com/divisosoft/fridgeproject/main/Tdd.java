package com.divisosoft.fridgeproject.main;
import com.divisosoft.fridgeproject.fridge.Fridge;
import com.divisosoft.fridgeproject.fridge.tray.Tray;
import com.divisosoft.fridgeproject.fridge.tray.fruit.Fruit;
import com.divisosoft.fridgeproject.fridge.tray.fruit.Apple;
import com.divisosoft.fridgeproject.fridge.tray.fruit.Orange;
import com.divisosoft.fridgeproject.fridge.tray.fruit.Grape;
import com.divisosoft.fridgeproject.fridge.tray.vegetable.Vegetable;
import com.divisosoft.fridgeproject.fridge.tray.vegetable.Carrot;
import com.divisosoft.fridgeproject.fridge.tray.vegetable.Chilly;
import com.divisosoft.fridgeproject.fridge.tray.vegetable.Cucumber;
import com.divisosoft.fridgeproject.fridge.tray.grocery.Grocery;
import com.divisosoft.fridgeproject.fridge.tray.grocery.Juice;
import com.divisosoft.fridgeproject.fridge.tray.grocery.Milk;
import com.divisosoft.fridgeproject.fridge.tray.grocery.Chocolate;


public class Tdd{

public static void main(String[]args){

Fridge fridge = new Fridge(); 
fridge.name = "SAMSUNG";
fridge.colour = "Grey";

System.out.println("\n"+"**********FRIDGE**********");
System.out.println(fridge);
System.out.println("***Fruits***"+"\n");
   
fridge.tray = new Tray();
for(int i=0; i<=3; i++){ 
      fridge.tray.fruit[i] = new Apple();
     Apple apple = ((Apple)fridge.tray.fruit[i]);
     apple.name = "Apple";
     System.out.println(apple.name);
}
for(int i=4; i<=6; i++){
     fridge.tray.fruit[i] = new Orange();
     Orange orange = ((Orange)fridge.tray.fruit[i]);
     orange.name = "Orange";
     System.out.println(orange.name);
}	
for(int i=7; i<=9; i++){
     fridge.tray.fruit[i] = new Grape();
     Grape grape = ((Grape)fridge.tray.fruit[i]);
     grape.name = "Grape";
     System.out.println(grape.name);
}
System.out.println("\n"+"***Vegetables***"+"\n");

for(int i=0; i<10; i++){
	 if (i%3==0){
         fridge.tray.vegetable[i] = new Carrot();
         Carrot carrot = ((Carrot)fridge.tray.vegetable[i]);
         carrot.name = "Carrot";
         System.out.println(carrot.name);
         }
	 else if(i%3==1){
         fridge.tray.vegetable[i] = new Chilly();
         Chilly chilly = ((Chilly)fridge.tray.vegetable[i]);
         chilly.name = "Chilly";
         System.out.println(chilly.name);
         }
     else{
         fridge.tray.vegetable[i] = new Cucumber();
         Cucumber cucumber = ((Cucumber)fridge.tray.vegetable[i]);
         cucumber.name = "Cucucmber";
         System.out.println(cucumber.name);
         }
     
	 }	 
 System.out.println("\n"+"   ***Grocery***"+"\n");
 
for(int i=0; i<11; i++){
	if(i%3==0){
		 fridge.tray.grocery[i] = new Milk();
         Milk milk = ((Milk)fridge.tray.grocery[i]);
         milk.name = "Cowma Milk";
         System.out.println(milk.name);
         }
     else if(i%3==1){
         fridge.tray.grocery[i] = new Juice();
         Juice juice = ((Juice)fridge.tray.grocery[i]);
         juice.name = "Watermelon Juice";
         System.out.println(juice.name);
         }
	 else{
         fridge.tray.grocery[i] = new Chocolate();
         Chocolate chocolate = ((Chocolate)fridge.tray.grocery[i]);
         chocolate.name = "Toblerone";
         System.out.println(chocolate.name);
         }
	
	
}

Fridge applefridge = new Fridge();
applefridge.tray = new Tray();


Fridge orangefridge = new Fridge();
orangefridge.tray = new Tray();


Fridge grapefridge = new Fridge();
grapefridge.tray = new Tray();


System.out.println("\n"+"   ***FRIDGE OF APPLE***");

for(int i=0; i<fridge.tray.fruit.length; i++){
	 if(fridge.tray.fruit[i] instanceof Apple){
          applefridge.tray.appleTray[i] = ((Apple)fridge.tray.fruit[i]);
	      System.out.println(applefridge.tray.appleTray[i]);
	     }
     }

System.out.println("\n"+"   ***FRIDGE OF ORANGE***");
for(int i=0,k=0;i<fridge.tray.fruit.length; i++){
	 if(fridge.tray.fruit[i] instanceof Orange){
          orangefridge.tray.orangeTray[k] = ((Orange)fridge.tray.fruit[i]);
		  System.out.println(orangefridge.tray.orangeTray[k]);
		  k++;
	     }
     }
 
 System.out.println("\n"+"   ***FRIDGE OF GRAPE***");
 for(int i=0,j=0;i<fridge.tray.fruit.length; i++){
	  if(fridge.tray.fruit[i] instanceof Grape){ 
	      grapefridge.tray.grapeTray[j] = ((Grape)fridge.tray.fruit[i]);
		  System.out.println(grapefridge.tray.grapeTray[j]);
		  j++;
	     }
     }
Fridge chillyFridge = new Fridge();
chillyFridge.tray = new Tray();

Fridge carrotFridge = new Fridge();
carrotFridge.tray = new Tray();

Fridge cucumberFridge = new Fridge();
cucumberFridge.tray = new Tray();

System.out.println("\n"+"   ***FRIDGE OF CHILLY***");

for(int i=0,h=0; i<fridge.tray.vegetable.length; i++){
	 if(fridge.tray.vegetable[i] instanceof Chilly){
          chillyFridge.tray.chillyTray[h] = ((Chilly)fridge.tray.vegetable[i]);
	      System.out.println(chillyFridge.tray.chillyTray[h]);
		  h++;
	     }
     }

		System.out.println("\n"+"   ***FRIDGE OF CARROT***");

for(int i=0,b=0; i<fridge.tray.vegetable.length; i++){
	 if(fridge.tray.vegetable[i] instanceof Carrot){
          carrotFridge.tray.carrotTray[b] = ((Carrot)fridge.tray.vegetable[i]);
	      System.out.println(carrotFridge.tray.carrotTray[b]);
		  b++;
	     }
     }

System.out.println("\n"+"   ***FRIDGE OF CUCUMBER***");

for(int i=0,a=0; i<fridge.tray.vegetable.length; i++){
	 if(fridge.tray.vegetable[i] instanceof Cucumber){
          cucumberFridge.tray.cucumberTray[a] = ((Cucumber)fridge.tray.vegetable[i]);
	      System.out.println(cucumberFridge.tray.cucumberTray[a]);
		  a++;
	     }
     }
 Fridge milkfridge = new Fridge();
 milkfridge.tray = new Tray();
 
 Fridge juiceFridge = new Fridge();
 juiceFridge.tray = new Tray();
 
 Fridge chocolateFridge = new Fridge();
 chocolateFridge.tray = new Tray();
 
 System.out.println("\n"+"   ***FRIDGE OF MILK***");
 
 for(int i=0,q=0;i<fridge.tray.grocery.length;i++){
	 if(fridge.tray.grocery[i] instanceof Milk){
		 milkfridge.tray.milkTray[q]=((Milk)fridge.tray.grocery[i]);
		 System.out.println(milkfridge.tray.milkTray[q]);
		 q++;
	 }
 }
  System.out.println("\n"+"   ***FRIDGE OF JUICE***");
 
 for(int i=0,w=0;i<fridge.tray.grocery.length;i++){
	 if(fridge.tray.grocery[i] instanceof Juice){
		 juiceFridge.tray.juiceTray[w]=((Juice)fridge.tray.grocery[i]);
		 System.out.println(juiceFridge.tray.juiceTray[w]);
		 w++;
	 }
 }
  System.out.println("\n"+"   ***FRIDGE OF CHOCOLATE***");
 
 for(int i=0,r=0;i<fridge.tray.grocery.length;i++){
	 if(fridge.tray.grocery[i] instanceof Chocolate){
		 chocolateFridge.tray.chocolateTray[r]=((Chocolate)fridge.tray.grocery[i]);
		 System.out.println(chocolateFridge.tray.chocolateTray[r]);
		 r++;
	 }
 }

}
}

 



