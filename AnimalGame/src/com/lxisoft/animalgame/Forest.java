package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import  java.lang.Math;
public class Forest
{
		
		
		Animal[] animals;
		Animal tiger;
		Animal lion;
		Animal rabbit;
		Animal elephant;

		public void print()
		{
			System.out.println("---Amazon Forest---");
			System.out.println("Animals");

	//-----------		Array creation	---------//			
			animals=new Animal[4];

			tiger=new Tiger();
			lion=new Lion();
			rabbit=new Rabbit();
			elephant=new Elephant();

			tiger.name="Tiger";
			tiger.strength=40;
			tiger.isDead=false;
			//tiger.display();
			animals[0]=tiger;

			rabbit.name="Rabbit";
			rabbit.strength=10;
			rabbit.isDead=false;
			//rabbit.display();
			animals[1]=rabbit;

			lion.name="Lion";
			lion.strength=30;
			lion.isDead=false;
			//lion.display();
			animals[2]=lion;

			elephant.name="Elephant";
			elephant.strength=20;
			elephant.isDead=false;
			//elephant.display();
			animals[3]=elephant;

           meet(animals);
          
         }  
		public int randomGeneration(int limit)
		{
				int random=(int)(Math.random()*limit);
				return random;
		}
		public Animal[] isDead(int winner,int looser,Animal[] animal_array)
		{
			int remain=animal_array[winner].strength-animal_array[looser].strength/2;
			animal_array[winner].strength=remain;
			animal_array[looser].strength=0;
			System.out.println("winner " +animal_array[winner].name + animal_array[winner].strength);
			System.out.println("looser "+ animal_array[looser].name + animal_array[looser].strength);
			return animal_array;

		}
	    public void isWinner(Animal[] animals,Animal lastAnimal)
	    {
       		int count=0;
        	for(int i=0;i<animals.length;i++)
			{
				if(animals[i].isDead==false)
				{	
					
					count++;
				}
			}
			if(count==1)
        	{
        		 
        		System.out.println("winner is  "+lastAnimal.name);
        	}
        	else
        	{
        		
        		meet(animals);
        	}

	    }
	
		public void meet(Animal[] animal_array ) 
		{	
			int count=0,random1,random2;
			Animal win;
			for(int i=0;i<animal_array.length;i++)
			{
				if(animal_array[i].isDead==false)
				{	
					System.out.print(i + " ");
					animal_array[i].display();
					count++;
				}
			}
			do
			{
			random1=randomGeneration(animals.length);

			}
			while(animal_array[random1].isDead);

			do
			{
			
			random2=randomGeneration(animals.length);

			}
			while(animal_array[random2].isDead || random1==random2);

			System.out.println(random1 +"  "+ random2);
		    win=animals[random1].fight(animals[random2]);
		    win.display();

		    if(animals[random1].name==win.name)
		    {
		    	animals=isDead(random1,random2,animals);
		    }
		    else
		    {
		    	animals=isDead(random2,random1,animals);
		    }
		    
		    isWinner(animals,win);
		}


}