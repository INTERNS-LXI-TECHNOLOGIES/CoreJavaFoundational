package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Tiger;
public class Forest 
{
	Animal animal;
	Animal tiger;
	Animal lion;
	

	public void print()
	{
	    System.out.println("PINE FOREST");
	    System.out.println("----------------");
     	animal=new Animal();
     	tiger=new Animal();
     	Tiger t=new Tiger();
     	Lion l=new Lion();
     	lion=new Animal();
     	animal.eat();
		tiger.eat();
		lion.eat();
		t.eat();
		l.eat();
		animal.run();
		tiger.run();
		lion.run();
		t.run();
		l.run();	
	}

}