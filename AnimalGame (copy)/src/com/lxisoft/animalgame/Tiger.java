package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Tiger extends Animal implements Carnivores
{
	public void run()
	{
		System.out.println("\n tiger run fastly");
	}
	public void eat()
	{
		System.out.println("\n tiger eat meat");
	}
	public Tiger(Animal a) {
		super();
	}
public Tiger(){
}
	public int[] roam()
	{
		int x2,y2;
		int[] position;
		x2=(int) (Math.random()*10);
		y2=(int) (Math.random()*10);
		position=new int[2];
		position[0]=x2;
		position[1]=y2;

		return position;
	}
	public Animal fight(Animal defender1)
	{
		System.out.println("\n\t\t    "+this.animalName+"  v  "+defender1.animalName);
		if(this.strength>defender1.strength)
		{
			System.out.println("\t\twinner="+this.animalName+" strength=="+(this.strength-=1)+"\n\t\tlooser="+defender1.animalName+" strength=="+(defender1.strength-=2));
			if(defender1.strength<=0)
			{
				defender1.isDead=true;
				System.out.println("\n"+defender1.animalName+"-------------dead");
			}
			return this;
		}
		else
		{
			System.out.println("\t\twinner="+defender1.animalName+" strength=="+(defender1.strength-=1)+"\n\t\tlooser="+this.animalName+" strength=="+(this.strength-=2));
			if(this.strength<=0)
			{
				this.isDead=true;
				System.out.println("\n"+this.animalName+"------------dead");
			}
			return defender1;
		}
	}
}
