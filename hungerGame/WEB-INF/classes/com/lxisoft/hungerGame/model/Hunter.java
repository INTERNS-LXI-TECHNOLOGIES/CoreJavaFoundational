package com.lxisoft.hungerGame.model;

public class Hunter{
	private String icon;
    private String name;
    private int hungerLevel;
    
	public Hunter(String icon) {
        this.icon = icon;
        /*this.name = name;
        this.hungerLevel = hungerLevel;*/
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
	public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }

    
}