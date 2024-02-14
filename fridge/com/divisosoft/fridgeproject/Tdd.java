package com.divisosoft.fridgeproject;
public class Tdd{

public static void main(String[]args){

Fridge fridge = new Fridge(); 
fridge.name = "SAMSUNG";
fridge.colour = "Grey";

System.out.println("\n"+"         FRIDGE");
System.out.println("\n"+fridge.name);
System.out.println(fridge.colour);
 
fridge.tray = new Tray();
fridge.tray.fruit[0] = new Apple();
Apple apple = ((Apple)fridge.tray.fruit[0]);
apple.name = "Apple";
System.out.println("\n"+apple.name);

fridge.tray.fruit[1] = new Apple();
Apple apple1 = ((Apple)fridge.tray.fruit[1]);
apple1.name = "Apple";
System.out.println(apple1.name);

fridge.tray.fruit[2] = new Apple();
Apple apple2 = ((Apple)fridge.tray.fruit[2]);
apple2.name = "Apple";
System.out.println(apple2.name);
 
fridge.tray.fruit[3] = new Apple();
Apple apple3 = ((Apple)fridge.tray.fruit[3]);
apple3.name = "Apple";
System.out.println(apple3.name);

fridge.tray.fruit[4] = new Orange();
Orange orange = ((Orange)fridge.tray.fruit[4]);
orange.name = "Orange";
System.out.println(orange.name);

fridge.tray.fruit[5] = new Orange();
Orange orange1 = ((Orange)fridge.tray.fruit[5]);
orange1.name = "Orange";
System.out.println(orange1.name);

fridge.tray.fruit[6] = new Orange();
Orange orange2 = ((Orange)fridge.tray.fruit[6]);
orange2.name = "Orange";
System.out.println(orange2.name);

fridge.tray.fruit[7] = new Grape();
Grape grape = ((Grape)fridge.tray.fruit[7]);
grape.name = "Grape";
System.out.println(grape.name);

fridge.tray.fruit[8] = new Grape();
Grape grape1 = ((Grape)fridge.tray.fruit[8]);
grape1.name = "Grape";
System.out.println(grape1.name);

fridge.tray.fruit[9] = new Grape();
Grape grape2 = ((Grape)fridge.tray.fruit[9]);
grape2.name = "Grape";
System.out.println(grape2.name);


Fridge applefridge = new Fridge();
applefridge.tray = new Tray();
applefridge.tray.appleTray[0]= new Apple();
applefridge.tray.appleTray[1]= new Apple();
applefridge.tray.appleTray[2]= new Apple();
applefridge.tray.appleTray[3]= new Apple();

Fridge orangefridge = new Fridge();
orangefridge.tray = new Tray();
orangefridge.tray.orangeTray[0]= new Orange();
orangefridge.tray.orangeTray[1]= new Orange();
orangefridge.tray.orangeTray[2]= new Orange();

Fridge grapefridge = new Fridge();
grapefridge.tray = new Tray();
grapefridge.tray.grapeTray[0]= new Grape();
grapefridge.tray.grapeTray[1]= new Grape();
grapefridge.tray.grapeTray[2]= new Grape();

System.out.println("\n"+"      FRIDGE OF APPLE");

for(int i=0; i<fridge.tray.fruit.length; i++){
	if(fridge.tray.fruit[i] instanceof Apple){
    applefridge.tray.appleTray[i] = ((Apple)fridge.tray.fruit[i]);
	System.out.println(applefridge.tray.appleTray[i]);
	}
}



System.out.println("\n"+"      FRIDGE OF ORANGE");
int sum=0;
for(int i=0;i<fridge.tray.fruit.length; i++){
	if(fridge.tray.fruit[i] instanceof Orange){
    orangefridge.tray.orangeTray[sum] = ((Orange)fridge.tray.fruit[i]);
		System.out.println(orangefridge.tray.orangeTray[sum]);
		sum++;
	}
}
 
 
 System.out.println("\n"+"       FRIDGE OF GRAPE");
 int num=0;
 for(int i=0;i<fridge.tray.fruit.length; i++){
	if(fridge.tray.fruit[i] instanceof Grape){ 
	grapefridge.tray.grapeTray[num] = ((Grape)fridge.tray.fruit[i]);
		System.out.println(grapefridge.tray.grapeTray[num]);
		num++;
	}
}



	
  		
}
}

 



