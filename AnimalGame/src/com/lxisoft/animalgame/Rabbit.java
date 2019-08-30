package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Rabbit extends Animal
{
	public void animalDetails()
	{
		System.out.println("\n");
		System.out.println("animal: "+animalName);
		System.out.println("aggressive: "+aggressive);
		System.out.println("power: "+strength);
	}
	public void eat()
	{
		System.out.println("rabbit eat carrot");
	}
	public void run()
	{
		System.out.println("rabbit run slowly");
	}
}