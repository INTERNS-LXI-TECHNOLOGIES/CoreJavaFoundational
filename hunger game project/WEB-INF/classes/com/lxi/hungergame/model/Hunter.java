package com.lxi.hungergame.model;

public class Hunter {
    private  String name;
    private String image;
    private int  hungerLevel;

    
    public Hunter(String name, String image, int hungerLevel) {
        this.name = name;
        this.image = image;
        this.hungerLevel = hungerLevel;
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


    public int getHungerLevel() {
        return hungerLevel;
    }


    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    
}