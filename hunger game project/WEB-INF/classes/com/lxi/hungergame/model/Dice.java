package com.lxi.hungergame.model;

public class Dice {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public int roll(){
        int x = (int)(Math.random()* 6 ) + 1 ;
        return x;
    }
}
