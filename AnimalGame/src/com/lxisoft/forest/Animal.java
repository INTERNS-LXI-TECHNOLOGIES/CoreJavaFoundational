package com.lxisoft.forest;
import java.util.Scanner;
import java.util.ArrayList;
public abstract  class Animal {

	Scanner scanner=new Scanner(System.in);

	private String animalName;
	public void setAnimalName(String a){
		this.animalName=a;
	}

	public String getAnimalName(){
		return animalName;
	}

	private int animalStrength;
	public void setAnimalStrength(int a){
		this.animalStrength=a;
	}
	public int getAnimalStrength(){
		return animalStrength;
	}


	 public String animalType;
	 private void setAnimalNameTpe(String a){
	 	this.animalType=a;
	 }
	 public String getAnimalType(){
	 	return animalType;
	 }

	 
	public boolean animalAlive;
	public void setAnimalAlive(boolean a){
		this.animalAlive=a;
	}
	public boolean getAnimalAlive(){
		return animalAlive;
	}

	public abstract void eat();


	
}