package com.LxiSoft.Game;
// import com.LxiSoft.Game.Game;
import java.util.*;

public class Dice 
{
    Random random;
	public Dice(){
		random = new Random();
	}
	public int roll(){
		return random.nextInt(6)+1;
	}
}