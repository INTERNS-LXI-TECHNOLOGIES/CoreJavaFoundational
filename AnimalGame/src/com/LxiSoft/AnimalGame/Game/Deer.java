package com.LxiSoft.AnimalGame.Game;
import java.util.*;
public class Deer extends Animal implements Herbivore{
	public void animalDetails(){
		System.out.println("           3) Deer or true deer are hoofed ruminant mammals forming the family Cervidae");
	}


	public void setName(String name){
		this.animalName = name;
	}
	public String getName(){
		return animalName;
	} 
	public void setStrength(int strenth){
		this.strength = strenth;
	}
	public int getStrength(){
		return strength;
	}
	public void setEnergyLevel(int energy){
		this.energyLevel = energy;
	}
	public int getEnergyLevel(){
		return energyLevel;
	}
	public void setHungerLevel(int hunger){
		this.hungerLevel = hunger;
	}
	public int getHungerLevel(){
		return hungerLevel;
	}
	public void setArea(int area){
		this.range = area;
	}
	public int getArea(){
		return range;
	}	
	public void setView(int view){
		this.eyeSight = view;
	}
	public int getView(){
		return eyeSight;
	}
	public void setLife(boolean alive){
		this.isAlive = alive;
	}
	public boolean getLife(){
		return isAlive;
	}
}