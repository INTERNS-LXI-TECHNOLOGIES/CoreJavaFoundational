package com.Lxisoft.Game;
import java.util.*;

public class Board
{
	Game g = new Game();
	public void startScreen()
    {
        System.out.println ("\n\t\t\tWelcome To Snakes And Ladders\n\n");
        System.out.println ("\t\t\t\tInstructions:");
        System.out.println ("\tThis game or program is running with rules in ordinary snake and ladder");
        System.out.println ("\tgame. The player who got one will be entered to the game and the first");
        System.out.println ("\tone to be square 100 wins, however, there will be preset squares");
        System.out.println ("\twhich will be the snakes or ladders. Once you land on top of a ");
        System.out.println ("\tsnake you go down a few squares, and move up if you land on the");
        System.out.println ( "\tbottom of a ladder. Good Luck and Have FUN!!!\n\n");

    }

    public void boardLayout()
    {
        int counter= 100,iteration=-1; 
        System.out.println ("------------------------------------Game Board------------------------------------------------------------------------------------------------------------------");
        while (counter>0)
        {
            if(counter%10==0 && counter!=100)
            {
                if (iteration==-1)
                {
                    counter-=9;
                    iteration=1;
                }
                else
                {
                    System.out.println(counter+"\t");
                    counter-=10;
                    iteration=-1;
                }
                if(counter!=0)
                System.out.print("\n"+counter+"\t");
            }
            else 
            System.out.print(counter+"\t");
            counter+=iteration;
        }
        System.out.println();
        System.out.println ("----------------------------------------------------------------------------------------------------------------------------------------------------------------");

        //g.start();
    }

    public void rules()
    {
        System.out.println("\t Ladders \t\t Snakes\n");
        System.out.println("\t 3 - 44  \t\t 70 - 8 ");
        System.out.println("\t 6 - 24  \t\t 22 - 2 ");
        System.out.println("\t 15 - 38  \t\t 55 - 19 ");
        System.out.println("\t 24 - 95  \t\t 90 - 5 ");
        System.out.println("\t 60 - 91  \t\t 66 - 33 ");
        g.startGame();
    }
}