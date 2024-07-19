package com.lxisoft.hungerGame.model;

public class Players {
    private String icon;
    private String name;
    private boolean isActive= false;
    private int cellNumber = 0;
    private int hungerLevel = 0;
	private Dice dice;

	public Players(String icon,String name) {
        this.icon = icon;
		this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }
    public int getCellNumber() {
        return cellNumber;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public boolean isActive() {
        return isActive;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
	
	public int rollDice(Dice dice){
		dice.randomNumberFromDice();
		return dice.getResult();
	}
}