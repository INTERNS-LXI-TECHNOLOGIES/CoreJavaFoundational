package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Wildbull extends Animal implements Herbivores
{
	
	
    int Aggressivelevel=30;
	public Wildbull(String name,int strengthlevel,boolean isAlive)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
	}
	
	
	
	 public Animal escape(Animal enemy)
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
 
  
}  