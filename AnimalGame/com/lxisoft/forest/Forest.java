package com.lxisoft.forest;
import com.lxisoft.game.*;
import java.util.*;
import com.lxisoft.forest.*;
public class Forest
{
private String forestname ="Black Forest";
ArrayList<Animal> animal = new ArrayList<Animal>();
static Scanner input =new Scanner(System.in);
Game game;
// public void setForestName(String arg)
// {
// 	forestname =forestname;

// }
// public String getForestName()
// {
// 	return forestname;
// }



public void createForest()
	{
		System.out.println("\n\t"+forestname);
		
		creatAnimal();

		setAnimalDetails();
		
		int temp=playGame();
		//System.out.println(temp);
		if(temp==0)
		{
			System.out.println("Exited");
		}
		if(temp==1)
		{
			game=new Game();
			game.startGame(animal);
		}

			
	}
public void creatAnimal()
{
animal.add(new Lion()); 
animal.add(new Tiger()); 
animal.add(new Rabbit());
animal.add(new Elephant());

}

public void setAnimalDetails()
{
	animal.get(0).setAnimalName("Lion"); 
		animal.get(0).setAnimalStrength(8); 


		animal.get(1).setAnimalName("Tiger"); 
		animal.get(1).setAnimalStrength(7); 

		 
		animal.get(2).setAnimalName("Rabbit"); 
		animal.get(2).setAnimalStrength(4); 

		 
		animal.get(3).setAnimalName("Elephant"); 
		animal.get(3).setAnimalStrength(9); 
}
// public void displayForest()
// 	{
// 		System.out.println("\n\t"+getForestName());

		
// 		// System.out.println(animal.get(0).getAnimalName());
// 		// System.out.println(animal.get(0).getAnimalStrength());
// 		// // ;
// 		// animal.get(1)getAnimalName();
// 		// animal.get(1)getAnimalStrength();
// 	}

public int playGame()
{
	System.out.print("\n1.Start The Game\nPress 0 to Exit\n\n Enter Your Choise :");
	int choise=input.nextInt();
	return choise;
}


}