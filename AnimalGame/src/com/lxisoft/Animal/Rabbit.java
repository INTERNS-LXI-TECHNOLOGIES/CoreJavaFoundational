package com.lxisoft.Animal;
import com.lxisoft.Game.*;
public class Rabbit extends Animal implements Herbivorus,WeakAnimal
{
	public void Beat()
	{
		
	}
	public void fight()
	{
		animalEnergy=animalEnergy-(int)(animalEnergy*.2);
	}
	
}