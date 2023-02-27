import java.util.Scanner;
public class ViewControler{



		
	Scanner sc =new Scanner(System.in);
	Dictionary d=new Dictionary();
	

	public void sarth()
	{
	boolean b=true;
	while(b)
	{
		String good=sc.nextLine();
		switch(good)
		{
			case"1":
			enterWord();
			break;
			case"3":
			printDetails();
			break;
			case"5":
			
			b=false;
			break;
			default:
			System.out.println(" error invalit word");
		
		}
	}
	}
	

			public void enterWord()
			{
				boolean c=true;
				String yes="";
				while(c)
				{
				
			
			int i=0;
			System.out.println("enter word");
			d.getWord()[i].setWord(sc.nextLine());
			
			System.out.println("enter Meaning");
			d.getWord()[i].setMeaning(sc.nextLine());
			
			
			System.out.println("enter adjective");
			d.getWord()[i].setAdjective(sc.nextLine());
			
			System.out.println("enter noun");
			d.getWord()[i].setNoun(sc.nextLine());
			
			System.out.println("doYouWantToContinue");
				yes=sc.nextLine();
				if (yes.equals("no"))
				{
					c=false;
				
				}
			
			
				}	
			
			
			}
			public void printDetails()
			{

			
			System.out.println(d);
			
			
			}
			
}



