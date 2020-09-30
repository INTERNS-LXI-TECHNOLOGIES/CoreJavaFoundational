package com.Lxisoft.Game;
import java.util.*;

public class Game
{
	Scanner scan =new Scanner(System.in);
	int[][] BoardArray = new int[101][2];
	int i,j;
	int a,b,a1,b1,a2,b2,p1,p2;
	Player player =new Player();
	public void startGame()
	{
		System.out.println("Press Y to Start");
		char c = scan.next().charAt(0);

		if (c=='Y')
		{
			System.out.println("U R IN");
		}
		else 
		{
			System.out.println("Exit");
		}

		
		this.player1();
		//this.permission();
		this.player2();
		
	}
	/*public void permission(){
		System.out.println("Press Y to Continue");
		char c = scan.next().charAt(0);
		if(c== 'Y'){
			System.out.println("\nU R IN");
		}
		else{
			System.out.println("\nEXITED FROM GAME");
		}
		BoardArray[0][0]=i;
		BoardArray[0][1]=j;
	}*/
	public void player1()
	{
					
		System.out.println("\n\t\tRolling dice for player1	");
		a=player.die.randomGeneration();
		System.out.println(a);
		if(a==1)
		{
			System.out.println("\n\t\t*******************************************************");
			System.out.println("\n\t\t\tPlayer 1 Enters To The Game\t\t\t");
			System.out.println("\n\t\t*******************************************************");
			BoardArray[1][0]=i;
			System.out.println("\n Press Y To Continue");
			char c = scan.next().charAt(0);
			if(c== 'Y')
			{
				System.out.println("\n\t\t***************************************************");
				System.out.println("\n \t\t\tNext Try 	"+"\n  DIE ROLLING");
				System.out.println("\n\t\t***************************************************");
				a1=player.die.randomGeneration();
				System.out.println("\n"+a1);
				int incrementi=0+a1+1;
				BoardArray[incrementi][0]=i;
				System.out.println("\n\t\t***************************************************");
				System.out.println("\n \t\t\tP1 in  "+incrementi);
				System.out.println("\n\t\t***************************************************");
							
							}
					}
					else if(a!=1){
						System.out.println("\n\t\t*******************************************");
						System.out.println("\n \t\t\tPLAYER1 Try Again");
						System.out.println("\n\t\t*******************************************");
					}
					this.player1Board();

	}
	public void player1Board(){
		System.out.println("\n Press Y to Roll Dice Player2");
		char c = scan.next().charAt(0);
		if(c=='Y'){
			System.out.println("\n\t\t*******************************************");
			System.out.println("\n\t\t\tDIE ROLLING FOR PLAYER2	");
			System.out.println("\n\t\t*******************************************");
			p1=player.die.randomGeneration();
			System.out.println(p1);



		}
	}


	public void player2(){


		System.out.println("\n Press Y to Roll Dice");
		char c = scan.next().charAt(0);
		if(c=='Y')
		{

			System.out.println("\n\t\t*******************************************");
			System.out.println("\n\t\t\tDice Rolling 	");
			System.out.println("\n\t\t*******************************************");
			b=player.die.randomGeneration();
			System.out.println(b);
			if(b==1)
			{
				System.out.println("\n\t\t*******************************************");
				
				System.out.println("\n\t\t\tPlayer2 entered The game" );
				System.out.println("\n\t\t*******************************************");
				BoardArray[1][1]=j;
				System.out.println("\n \t\t\tPress Y to continue");
				char q = scan.next().charAt(0);
				if(q== 'Y'){

					System.out.println("\n\t\t*******************************************");
					System.out.println("\n Next Try"+"\n Dice Rolling ");
					b1=player.die.randomGeneration();
					System.out.println("\n"+b1);
					int incrementj=0+b1+1;
					BoardArray[incrementj][0]=j;
					
					System.out.println("\n \t\t\tPlayer 2 Is In "+incrementj);
					System.out.println("\n\t\t*******************************************");
				}
			}
			else if(b!=1){
				System.out.println("\n\t\t*******************************************");
				System.out.println("\n \t\t\tPlayer2 Try Again Next Time ");
				System.out.println("\n\t\t*******************************************");

			}
			

		}
		System.out.println("\n PRESS Y TO ROLL FOR PLAYER1");
				char x = scan.next().charAt(0);
				if(x== 'Y'){
				this.player1();	
				}
				else
				{
					System.out.println("Exited from the game");
				}

	}
	public void snakeandladder()
	{do
		{
			try
			{
				System.out.print("Player 1 :- ");
				player1 = scan.nextInt();
				
				if(player1 == 1)
				{
					dice.auto.nextInt(6) + 1;
					System.out.println("Dice :- " + dice);
					position1 += dice;
					checkInput = 0;
					
					if (position == 3)
					{
						postion1 = 44;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					}
					else if (position== 6 )
					{
						postion1 = 22;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					
					}

					else if (position== 15 )
					{
						postion1 = 38;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 24 )
					{
						postion1 = 96;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 12 )
					{
						postion1 = 1;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 28 )
					{
						postion1 = 10;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 90 )
					{
						postion1 = 56;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 72 )
					{
						postion1 = 58;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else 
					{
						System.out.println("Your current position is  "+ position1);
						System.out.println("");			
					}

				}


			}
			
		}
		while(checkInput ==1);

		do
		{
			try
			{
				System.out.print("Player 2 :- ");
				player2 = scan.nextInt();
				
				if(player2 == 1)
				{
					dice.auto.nextInt(6) + 1;
					System.out.println("Dice :- " + dice);
					position2 += dice;
					checkInput = 0;
					
					if (position == 3)
					{
						postion2 = 44;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					}
					else if (position== 6 )
					{
						postion2 = 22;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					
					}

					else if (position== 15 )
					{
						postion2 = 38;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 24 )
					{
						postion2 = 96;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 12 )
					{
						postion2 = 1;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 28 )
					{
						postion2 = 10;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 90 )
					{
						postion2 = 56;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 72 )
					{
						postion2 = 58;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}
					else 
					{
						System.out.println("Your current position is  "+ position2);
						System.out.println("");			
					}

				}


			}
			
		}
		while(checkInput ==1);

	}


}