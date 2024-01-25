import java.util.Scanner;

public class Vote{
public static void main(String[]agrs){
Scanner scanner=new Scanner(System.in);

		System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
		
		System.out.print("Enter your Age: ");
		int age=scanner.nextInt();
		
		System.out.println("HI "+name+" your age is "+age+"\n");
		
		if(age>=21 && age>=8){
			System.out.println("you are eligilble to Drive and able to vote");
		}
		else if (age<21 && age<18){
			System.out.println("you are not eligible to vote and drive");
		}
		else{
			System.out.println("you are not eligible to Vote and Drive");
		}	

}
}

 