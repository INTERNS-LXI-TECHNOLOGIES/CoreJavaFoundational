package com.lxisoft.hungerGame.model;

import java.util.ArrayList;
import java.util.List;

public class Cells {
    private String bgImage;
    private int cellNumber;
    private List<Players> player = new ArrayList<>();
    private List<Food> food = new ArrayList<>();
    private Hunter hunter;
    
    /*public Cells(String bgImage, int cellNumber) {
        this.bgImage = bgImage;
        this.cellNumber = cellNumber;
    }*/
    public String getBgImage() {
        return bgImage;
    }
    public void setBgImage(String bgImage) {
        this.bgImage = bgImage;
    }
    
    public List<Players> getPlayer() {
        return player;
    }
    public void setPlayer(List<Players> player) {
        this.player = player;
    }

    public Hunter getHunter() {
        return hunter;
    }
    public void setHunter(Hunter hunter) {
        this.hunter = hunter;
    }

    public List<Food> getFood() {
        return food;
    }
    public void setFood(List<Food> food) {
        this.food = food;
    }
}