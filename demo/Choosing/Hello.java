import java.util.Scanner;
public class Hello
{
	public static void main(String[] ar)
	{
		System.out.println("Enter Two Numbers");
		
		Scanner scanner=new Scanner(System.in);
		
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		
		System.out.println(" 1 for addition\n 2 for multiplication\n 3 for subtraction\n 4 for divison\n\n Enter : ");
		
		int a=scanner.nextInt();
		
		if(a==1)
		{
			int result=num1+num2;
			System.out.println("result="+result);
		}
		else if(a==2)
		{
			int result=num1*num2;
			System.out.println("result="+result);
		}
		else if(a==3)
		{
			int result=num1-num2;
			System.out.println("result="+result);
		}
		else if(a==4)
		{
				double result=num1/num2;
				System.out.println("result="+result);
		}
		else{System.out.println("you are a fool");
		}
	}
}
			