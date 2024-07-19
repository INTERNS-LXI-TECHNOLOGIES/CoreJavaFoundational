package com.lxi.hungergame.model;

public class Player {
    private String name;
    private String image;
    private int cellCount;
    private int hungerLevel;
    private  boolean isActive;
    private int result;


    public Player(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getCellCount() {
        return cellCount;
    }

    public void setCellCount(int cellCount) {
        this.cellCount = cellCount;
    }

    
    public int rollDice(Dice d){
         this.result = d.roll();
         return this.result;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean equal(Player p){
        if(this.getName().equals(p.getName())){
            return true;
        }
        return false;
    }

    
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
}
