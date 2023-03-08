package com.lxisoft.game;
import java.util.Random;

public class Dice {
	
//This method will generate random number from 1-6
	
	public int rollDice(){
		 	 
		int n = 0;
		Random r = new Random();
		n = r.nextInt(7);
		return (n == 0 ? 1 : n);
			
	 }
	 
}