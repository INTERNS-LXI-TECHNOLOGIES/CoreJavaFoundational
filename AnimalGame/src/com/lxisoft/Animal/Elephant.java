package com.lxisoft.Animal;
import com.lxisoft.Game.*;
public class Elephant extends Animal implements Herbivorus,FreeRoam,StrongAnimal
{
	public void Beat()
	{
		
	}
	public void fight()
	{
		animalEnergy=animalEnergy-(int)(animalEnergy*.2);
	}
	
}