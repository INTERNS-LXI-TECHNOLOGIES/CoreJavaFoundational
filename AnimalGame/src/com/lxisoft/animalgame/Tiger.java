package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
 public class Tiger extends Animal implements Carnivores
{
    int Aggressivelevel=50;
	public Tiger(String name,int strengthlevel,int x,int y,int range)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
		this.x=x;
		this.y=y;
		this.range=range;
	}
	public void eat()
	{
		System.out.println("Tiger ate Rabit");
		
	}
      public Animal attack(Animal animal2)
	 {
	  if(this.strengthlevel>enemy.strengthlevel)
		{	
		  return this;
		}
		else
		{
			return enemy;
		}
	  }
	  
	 public int[] roam()
	 {
		 int[] x=new int[2];
		x[0]=(int)(Math.random()*40);
		x[1]=(int)(Math.random()*40);
		return x;
	 }
  

	
 
  
}  