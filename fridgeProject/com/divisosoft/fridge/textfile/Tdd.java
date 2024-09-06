package com.divisosoft.fridge.textfile;
import com.divisosoft.fridge.fruitstray.*;
import com.divisosoft.fridge.fridgefor.*;
import com.divisosoft.fridge.fridge.Fridge;

public class Tdd{
	public static void main(String[]args){

		Fridge fridge=new Fridge();
		fridge.name="LG";
		fridge.color="SILVER";
		System.out.println(fridge);

			for(int i=0; i< fridge.fruitstray.length; i++){
				if (i<3){
					fridge.fruitstray[i]= new Apple();
					fridge.fruitstray[i].name="APPLE";
				}
				else if(i<5){
					fridge.fruitstray[i]= new Orange();
					fridge.fruitstray[i].name="ORANGE";
				}
				else{
					fridge.fruitstray[i]= new Mango();
					fridge.fruitstray[i].name="MANGO";
				}
				System.out.println(fridge.fruitstray[i]);
			}
		
		FridgeForApple fridgeforapple=new FridgeForApple();
		fridgeforapple.name="SAMSUNG";
		fridgeforapple.color="RED";
		System.out.println(fridgeforapple);
	
			for(int i=0, a=0; i<fridge.fruitstray.length;i++){
				if(fridge.fruitstray[i] instanceof Apple){
					fridgeforapple.appletray[a] = (Apple)fridge.fruitstray[i];
					System.out.println(fridgeforapple.appletray[a]);
					a++;
				}
			}
	
		FridgeForOrange fridgefororange=new FridgeForOrange();
		fridgefororange.name="ONEPLUS";
		fridgefororange.color="ORANGE";
		System.out.println(fridgefororange);
	
			for(int i=0,o=0; i<fridge.fruitstray.length; i++){
				if(fridge.fruitstray[i] instanceof Orange){
					fridgefororange.orangetray[o]=(Orange)fridge.fruitstray[i];
					System.out.println(fridgefororange.orangetray[o]);
					o++;
				}
			}
		
		FridgeForMango fridgeformango=new FridgeForMango();
		fridgeformango.name="REALME";
		fridgeformango.color="YELLOW";
		System.out.println(fridgeformango);
		
			for(int i=0,m=0; i<fridge.fruitstray.length; i++){
				if(fridge.fruitstray[i] instanceof Mango){
					fridgeformango.mangotray[m]=(Mango)fridge.fruitstray[i];
					System.out.println(fridgeformango.mangotray[m]);
					m++;
				}	
			}
	}
}