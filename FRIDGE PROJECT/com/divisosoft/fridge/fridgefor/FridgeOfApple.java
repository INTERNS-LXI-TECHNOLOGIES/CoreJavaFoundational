package com.divisosoft.fridge.fridgefor;
import com.divisosoft.fridge.fruits.Apple;

public class FridgeOfApple{
	public String name;
	public String color;
	public Apple[] apple=new Apple[3];

	public void AppleFridge(){
		System.out.println("\n"+"\t	FRIDGE FOR APPLE	\n");
		System.out.println(name);
		System.out.println(color);
	}
	
}