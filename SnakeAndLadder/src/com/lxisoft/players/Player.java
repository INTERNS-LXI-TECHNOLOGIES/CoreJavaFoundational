package com.lxisoft.players;
import com.lxisoft.game.*;
import java.util.*;
public class Player
{
	public int coinPosition,dieNumber=0,numberOnDie;
	Die d=new Die();
	boolean isHome;

 Random rand = new Random();
	public int getCoinPosition()
	{
		return coinPosition;
	}

	public void setCoinPosition(int coinPos)
	{
		this.coinPosition=coinPos;
		coinPosition=coinPosition+coinPos;
		

	}

	public int getHome()
	{
		numberOnDie=d.getNumberOnDie();
		if(numberOnDie==6)
		{	
			return numberOnDie;
		}
		else
			{return numberOnDie;}
	}

	public void play()
	{

			dieNumber=d.getNumberOnDie();


					System.out.println("The number on die "+dieNumber);	
				coinPosition=coinPosition+dieNumber;
				
				
				
	}



}