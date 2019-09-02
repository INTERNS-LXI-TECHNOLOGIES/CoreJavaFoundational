package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	String name;
	Animal animals;
	Tiger tiger;
	Lion lion;
	Bear bear;
	Rabbit rabbit;
	public void meetAnimal()
	{
		Scanner s=new Scanner(System.in);
		int i;		
		animals=new Animal();
		System.out.println("\n animal details");
		System.out.println("enter number of tiger");
		int nt=s.nextInt();
		System.out.println("enter number of lion");
		int nl=s.nextInt();
		System.out.println("enter number of bear");
		int nb=s.nextInt();
		System.out.println("enter number of rabbit");
		int nr=s.nextInt();
		int a=nt+nl+nb+nr;
		Animal[] animalArr=new Animal[a];
		for(i=0;i<nt;i++)
		{
			Tiger tiger=new Tiger();
			System.out.println("enter name of tiger");
			tiger.animalName=s.next();
			System.out.println("enter strength level of tiger");
			tiger.strength=s.nextInt();
			animalArr[i]=tiger;
		}
		for(i=nt;i<(nt+nl);i++)
		{
			Lion lion=new Lion();
			System.out.println("enter name of lion");
			lion.animalName=s.next();
			System.out.println("enter strength level of lion");
			lion.strength=s.nextInt();
			animalArr[i]=lion;
		}
		for(i=(nt+nl);i<(nt+nl+nb);i++)
		{
			Bear bear=new Bear();
			System.out.println("enter name of bear");
			bear.animalName=s.next();
			System.out.println("enter strength level of bear");
			bear.strength=s.nextInt();
			animalArr[i]=bear;
		}
		for(i=(nt+nl+nb);i<a;i++)
		{
			Rabbit rabbit=new Rabbit();
			System.out.println("enter name of rabbit");
			rabbit.animalName=s.next();
			System.out.println("enter strength level of rabbit");
			rabbit.strength=s.nextInt();
			animalArr[i]=rabbit;
		}
		meetFight(animalArr);
	}
	public void meetFight(Animal animalArr[])
	{
		System.out.println("jungle");
		
		int a,n=1;
		a=animalArr.length;
		System.out.println("animals meet and fight begins");
		System.out.println("------------------------------");
		int z=(int) (Math.random()*8);
		System.out.println("number of fight=="+z);

		for(int i=0;i<z;i++)
		{
			System.out.println("Fight no---"+n);
			int x=(int) (Math.random()*4);
			int y=(int) (Math.random()*4);
			if((animalArr[x].isDead==false)&(animalArr[y].isDead==false))
			{
				System.out.println("\n");
				System.out.println(animalArr[x].animalName+"  v  "+animalArr[y].animalName);
				if(animalArr[x].strength<animalArr[y].strength)
				{
					System.out.println("winner="+animalArr[y].animalName);
					System.out.println(animalArr[x].animalName+"  --dead");
					animalArr[x].isDead=true;
					

				}
				else
				{
					System.out.println("winner= "+animalArr[x].animalName);
					System.out.println(animalArr[y].animalName+"   --dead");
					animalArr[y].isDead=true;
				}
				
			}
			n++;

		}

	}


	
}