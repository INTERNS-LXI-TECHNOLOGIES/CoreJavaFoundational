package com.lxisoft.hungerGame.model;

public class Players {
    private String icon;
    private String name;
    private boolean isActive;
    private int cellNumber = 0;
    private int hungerLevel = 0;

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
    public Players(String icon) {
        this.icon = icon;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
}
