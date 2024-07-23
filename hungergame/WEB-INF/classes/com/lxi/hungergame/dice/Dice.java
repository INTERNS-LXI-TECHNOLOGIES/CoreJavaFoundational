package com.lxi.hungergame.dice;
public class Dice{
int currentvalues;	

public int roll(){
 int roll=(int)(Math.random()*6)+1;
return roll; 
}
}