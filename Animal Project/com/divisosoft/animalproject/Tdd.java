package com.divisosoft.animalproject;
public class Tdd
{
	public static void main(String[] args)
	{
		Animal lion = new Lion();
		
		System.out.println("\t"+"LION DETAILS"+"\n");
		
		for(int i =1;i<=5;i++)
		{
			
		lion.setName("Simba "+i);
		lion.setAge(3+i) ;
		((Lion)lion).setSize (120+i) ; 
		
		System.out.println("LION NAME IS : "+lion.getName());
		System.out.println("LION AGE IS  : "+lion.getAge());
		System.out.println("LION SIZE IS : "+((Lion)lion).getSize()+"\n");
		
		}
		
		Animal tiger = new Tiger ();
		
		System.out.println("\t"+"TIGER DETAILS"+"\n");
		
		for(int i=1;i<=3;i++)
		{
			
		tiger.setName ("sher "+i);
		tiger.setAge(6 +i);
		((Tiger)tiger).setColor ("White "+"\n");
		
		System.out.println("TIGER NAME IS   : "+tiger.getName());
		System.out.println("TIGER AGE IS    :"+tiger.getAge());
		System.out.println("TIGER COLOUR IS :"+((Tiger)tiger).getColor());
		}
		
		Animal wolf = new Wolf();
		
		System.out.println("\t"+"WOLF DETAILS"+"\n");
		
		for(int i = 1;i<=2;i++)
		{
		wolf.setName("Wolfyy "+i);
		wolf.setAge(5);
		
		System.out.println("WOLF NAME IS : "+wolf.getName());
		System.out.println("WOLF AGE IS  : "+wolf.getAge()+"\n");
		}
		
		Animal elephant = new Elephant ();
		
		System.out.println("\t"+"ELEPHANT DETAILS"+"\n");
		
		for(int i=1;i<=7;i++)
		{
		elephant.setName("Rambo "+i);
		elephant.setAge(3+i) ;
		((Elephant)elephant).setSize (1200+i) ;
		
		System.out.println("ELEPHANT NAME IS : "+elephant.getName());
		System.out.println("ELEPHANT AGE IS  : "+elephant.getAge());
		System.out.println("ELEPHANT SIZE IS : "+((Elephant)elephant).getSize()+"\n");
		}
		
		Animal deer = new Deer();
		
		System.out.println("\t"+"DEER DETAILS"+"\n");
		
		for(int i = 1;i<=12;i++)
		{
		deer.setName ("Stuart "+i);
		deer.setAge(1 +i) ;
		((Deer)deer).setColor ("Brown ");
		
		System.out.println("DEER NAME IS   : "+deer.getName());
		System.out.println("DEER AGE IS    : "+deer.getAge());
		System.out.println("DEER COLOUR IS : "+((Deer)deer).getColor()+"\n");
		}
	}
}