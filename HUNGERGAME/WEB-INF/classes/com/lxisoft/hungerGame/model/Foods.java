package com.lxisoft.hungerGame.model;

public class Foods{

private String icon;
private String name;
private int foodHungerLevel;

public Foods(String icon, String name, int foodHungerLevel){
		this.icon = icon;
		this.name = name;
        this.foodHungerLevel = foodHungerLevel;
}

		public void setIcon(String icon){
			this.icon = icon;
		}
		public String getIcon(){
			return icon;
		}
	
	
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
	
	
		public void setFodHungerLevel(int foodHungerLevel){
			this.foodHungerLevel = foodHungerLevel;
		}
		public int getFoodHungerLevel(){
			return foodHungerLevel;
		}
}

