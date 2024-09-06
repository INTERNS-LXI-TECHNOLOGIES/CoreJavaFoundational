package com.divisosoft.fridge.fruits;
import com.divisosoft.fridge.fruits.Apple;
import com.divisosoft.fridge.fruits.Orange;
import com.divisosoft.fridge.fruits.Mango;

public class Fruit{
	 public String name;
	 
		public void Fruitdetails(){
			System.out.println(name);
		}
		
	public Apple[] apple=new Apple[3];
	public Orange[] orange=new Orange[2];
	public Mango[] mango=new Mango[5];
}