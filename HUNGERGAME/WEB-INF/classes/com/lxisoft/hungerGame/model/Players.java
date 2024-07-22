package com.lxisoft.hungerGame.model;

public class Players{

private String icon;
private String name;
private int playerCellCount = 0;
private int playerHungerLevel = 0;
private boolean isActive  = false;
private  int result;


public Players(String name , String icon) {
	
	this.name = name;
	this.icon = icon;

}
	
		public void setIcon(String icon) {  
			this.icon = icon;
		}
		public String getIcon() {
				return icon;
		}
			
			
		public void setName(String name){
				this.name = name;
		}
		public String getName() {
				return name;
		}
			
			
		public void setIsActive(boolean isActive){
				this.isActive = isActive;
		}
		public boolean isActive() {
				return isActive;
		}
			
			
		public void setPlayerCellCount(int playerCellCount){
				this.playerCellCount = playerCellCount;
		}
		public int getPlayerCellCount() {
				return playerCellCount;
		}
			
			
		public void setPlayerHungerLevel(int playerHungerLevel){
				this.playerHungerLevel = playerHungerLevel;
		}
		public int getPlayerHungerLevel() {
				return playerHungerLevel;
		}

		


public int rollDice(Dice d){
	result =  d.roll() ;
	return result;
	}

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}