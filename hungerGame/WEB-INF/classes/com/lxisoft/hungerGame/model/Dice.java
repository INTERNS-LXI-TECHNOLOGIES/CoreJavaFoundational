package com.lxisoft.hungerGame.model;

public class Dice{
    private int result;

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
	public void randomNumberFromDice(){
		result = (int) (Math.random() * 6) + 1;
	}
}