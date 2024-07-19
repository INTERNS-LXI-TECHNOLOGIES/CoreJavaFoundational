package com.lxi.hungergame.model;

public class Food {
   
   private  String name;
   private String image;
   private int hungerLevel;

    
    public Food(String name, String image, int hungerLevel){
        this.name = name;
        this.image = image;
        this.hungerLevel = hungerLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
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

    
}
