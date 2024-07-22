package com.lxisoft.hungerGame.model;

public class Hunter{

private String icon;
private String name;
private int hunterHungerLevel;

public Hunter(String icon, String name, int hunterHungerLevel){
		this.icon = icon;
		this.name = name;
		this.hunterHungerLevel = hunterHungerLevel;
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
		

		public void setHunterHungerLevel(int hunterHungerLevel){
			this.hunterHungerLevel = hunterHungerLevel;
		}
		public int getHunterHungerLevel(){
			return hunterHungerLevel;
		}
}

