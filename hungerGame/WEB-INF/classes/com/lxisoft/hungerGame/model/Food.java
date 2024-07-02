package com.lxisoft.hungerGame.model;

public class Food{
	private String items;
    private String name;
    private int hungerLevel;

	public Food(String items, String name, int hungerLevel) {
        this.items = items;
        this.name = name;
        this.hungerLevel = hungerLevel;
    }
    public void setItems(String items) {
        this.items=items;
    }
    public String getItems() {
        return items;
    }
	public void setHungerLevel(int hungerLevel) {
        this.hungerLevel=hungerLevel;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
	
	public Food(String items) {
        this.items = items;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}