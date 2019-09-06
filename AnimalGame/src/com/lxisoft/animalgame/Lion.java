package com.lxisoft.animalgame;

public class Lion extends Animal implements Carnivore
{	


		public void display()
		{
		System.out.println(name + "  Strength= " +strength+"\n");
		}
			
		public Animal fight(Animal animal)
		{
			Animal win;
			System.out.println(this.name +" fight with " +animal.name);
			if(this.strength>animal.strength)
			{
				win=this;
				animal.isDead=true;
				System.out.println(this.name + "  wins " + animal.name +"  died  \n");
			}
			else
			{
				win=animal;
				this.isDead=true;
				System.out.println(animal.name + "  wins " + this.name + "  died \n");
			}
			return win;

		}

}