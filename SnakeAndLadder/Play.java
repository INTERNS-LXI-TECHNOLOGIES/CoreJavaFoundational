import java.util.*;
class Play
{
	
	/*Player1 p1=new Player1();
	Player2 p2=new Pla*/



	Player p1=new Player1();
	Player p2=new Player2();
Board b=new Board();
Die d=new Die();
int dieNumber,dieCount,coinPos=0;

int ans;
Scanner sc=new Scanner(System.in);
public void play()
{
	System.out.println("-------------------Snake and Lader Game--------------");
	System.out.println("------------------------------------------------------ ");
	System.out.println("------------------Play Begins------------------------");
	b.setColumns();
	System.out.println("Player throws die");
	
	do{
		
			if(getHome(p1)==true)
			{
				System.out.println(" And can throw die one more time");

				coinPos=coinPos+d.getNumberOnDie();
				System.out.println("Now the Player 1 moved to "+coinPos);


			}

			else
				{
				System.out.println("The "+p1.getClass().getSimpleName()+" can't play, switch player");

				}
	

				System.out.println("continue playing press 1:");
				
				ans=sc.nextInt();
	}while(ans==1);	

	




}
public boolean getHome(Player p)
	{
		if(d.getNumberOnDie()==6)
			{
				p.setCoinPosition(dieNumber);
				System.out.println("Player 1 moved to home");
				return true;
			}
		else
			{
				return false;
			}






	}



}