package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivorus;
public class Deer extends Animal implements Herbivorus
{
	public int herbivorusStrength = 20;
	/*public int hStrength(int strength)
	{
		int herbivorusStrength = strength;
		return herbivorusStrength;
	}*/
	int deerHungerLevel = 8;
	public String meet()
	{
		String behaviour = "Herbivorus";
		return behaviour;
	}
}