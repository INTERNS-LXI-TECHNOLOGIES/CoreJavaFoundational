package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
public class Forest 
{
	Animal animal;
    Tiger tiger;
    Lion lion;
    Rabbit rabbit;
    Deer deer;
	
	public void fight()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("\n");
	    System.out.println("    PINE FOREST  ");
	    System.out.println("  ****************");

	    System.out.println("Enter no.of Tiger:");
	    int t=sc.nextInt();
	    System.out.println("Enter no.of Lion:");
		int l=sc.nextInt();
	    System.out.println("Enter no.of Rabbit:");
		int r=sc.nextInt();
		System.out.println("Enter no.of Deer:");
		int d=sc.nextInt();
		int tot=(t+l+r+d);
		Animal[] animalArr=new Animal[tot];
     	animal=new Animal();
	    for(int i=0;i<t;i++)
		{
			tiger =new Tiger();
			System.out.println("Enter Tiger name:");
			tiger.animalName=sc.next();
			System.out.println("Enter Tiger strength:");
			tiger.strength=sc.nextInt();
			tiger.isDead=false;
			animalArr[i]=tiger;
		}
		for(int i=t;i<t+l;i++)
		{
			Lion lion=new Lion();
			System.out.println("Enter Lion name:");
			lion.animalName=sc.next();
			System.out.println("Enter Lion strength:");
			lion.strength=sc.nextInt();
			lion.isDead=false;
			animalArr[i]=lion;
		}
		for(int i=t+l;i<(t+l+r);i++)
		{
			rabbit=new Rabbit();
			System.out.println("Enter Rabbit name:");
			rabbit.animalName=sc.next();
			System.out.println("Enter Rabbit strength:");
			rabbit.strength=sc.nextInt();
			rabbit.isDead=false;
			animalArr[i]=rabbit;
		}
	    for(int i=(t+l+r);i<(t+l+r+d);i++)
		{
			deer=new Deer();
			System.out.println("Enter Deer name:");
			deer.animalName=sc.next();
			System.out.println("Enter Deer strength:");
			deer.strength=sc.nextInt();
			animalArr[i]=deer;
		}
		meetFight(animalArr,tot);		
	}
	
     
	public void meetFight(Animal animalArr[],int tot)
	{
		int count;
		Scanner sc=new Scanner (System.in);
		System.out.println("--ANIMAL DETAILS--");
		System.out.println("\n");
		System.out.println("Animal Meet & Fight Starts");
		System.out.println("-----------------------------");
		do
		{
			count=animalArr.length;
		    for(int i=0;i<animalArr.length;i++)
		    {
				int m=(int)(Math.random()*tot);
				int n=(int)(Math.random()*tot);
				if(m!=n)
				{
					if(animalArr[m].isDead==false&animalArr[n].isDead==false)
					{
						System.out.println(animalArr[m].animalName+"  VS  "+animalArr[n].animalName);					
						if(animalArr[m].strength>animalArr[n].strength)
						{
							animalArr[m].strength=(animalArr[m].strength-1);
							System.out.println("winner Strength=" +animalArr[m].strength);
							animalArr[n].strength=(animalArr[n].strength-animalArr[n].strength);
							System.out.println("Looser Strength=" +animalArr[n].strength);
							if(animalArr[m].strength<=0)
							{
								animalArr[m].isDead=true;
								count--;
								System.out.println("Dead-----"+animalArr[m].animalName);
							}
							if(animalArr[n].strength<=0)
							{
								animalArr[n].isDead=true;
								count--;
								System.out.println("Dead-----"+animalArr[n].animalName);
							}	
							System.out.println(animalArr[m].animalName+"  WIN");
							remaining(animalArr);
					    }
						else
						{
							animalArr[n].strength=(animalArr[n].strength-1);
							System.out.println("winner Strength="+animalArr[n].strength);
							animalArr[m].strength=(animalArr[m].strength-animalArr[m].strength);
							System.out.println("Looser Strength="+animalArr[m].strength);
							if(animalArr[n].strength<=0)
							{
								animalArr[n].isDead=true;
								count--;
								System.out.println("Dead-----"+animalArr[n].animalName);
							}
							if(animalArr[m].strength<=0)
							{
								animalArr[m].isDead=true;
								count--;
								System.out.println("dead-----"+animalArr[m].animalName);
							}
							System.out.println(animalArr[n].animalName+"  WIN");
							remaining(animalArr);
						}
			    	}
			    }
		    }
		} 
	    while(count>=2);  
	}
	public void remaining(Animal[] animalArr)
	{
		for(int i=0;i<animalArr.length;i++)
      	{
      		if(animalArr[i].isDead==false)
      		{
      			System.out.println("\n"+animalArr[i].animalName+"  Remainig");
      		}
   		} 
	}
}