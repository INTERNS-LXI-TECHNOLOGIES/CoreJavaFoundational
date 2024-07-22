package com.lxisoft.hungerGame.model;

public class Dice{

private int result;

	public void setResult(int result){
		this.result = result;
	}
	public int getResult(){
		return result;
	}
	
public int roll(){
	int x =( (int)(Math.random()*6))+1;
	this.result = x;
	return x;
	
}

}