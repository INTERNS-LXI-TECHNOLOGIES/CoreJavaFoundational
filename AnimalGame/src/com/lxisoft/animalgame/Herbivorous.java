package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public interface Herbivorous
{
	public void escape(Animal animal);
	public void escape(Animal animal1,Animal animal2);
	public void escape(Animal[] animalArray,int[] arr);
    public void graze();	

}