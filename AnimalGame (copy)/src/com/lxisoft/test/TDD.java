package com.lxisoft.test;

import java.util.Scanner;

import com.lxisoft.animalgame.Forest;
import com.lxisoft.animalgame.Gamelevel;

public class TDD {
	int  static final  level;
	public static void main(String[] args) throws NullPointerException {
		Scanner s = new Scanner(System.in);
		Forest forest = new Forest();
		
		boolean ex;
		do {
			ex = false;
			try {
				System.out.println(" enter animal game lavel (1-easy,2-medium,3-hard)");
				level = s.nextInt();
				if (level > 3) {
					throw new NullPointerException("");
				}
			} catch (NullPointerException e) {
				
				ex = true;
				System.out.println("Exception");
			}
		} while (ex);
		forest = animalGameLevel(forest, level);
		forest.meetAnimal();
	}

	public static Forest animalGameLevel(Forest forest, int level) {
		switch (level) {
		case 1: {
			forest.gamelevel = Gamelevel.EASY;
			break;
		}
		case 2: {
			forest.gamelevel = Gamelevel.MEDIUM;
			break;
		}
		case 3: {
			forest.gamelevel = Gamelevel.HARD;
			break;
		}
		}
		System.out.println("gamelevel--" + forest.gamelevel);
		return forest;

	}

}