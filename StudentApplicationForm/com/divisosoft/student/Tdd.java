package com.divisosoft.student;
import java.util.Scanner;
public class Tdd
 {
    public static void main(String[] studentApplication)
	{
			Scanner scan = new Scanner(System.in);
			ApplicationForm application = new ApplicationForm();			
			String collectFromUser = "";
			int i = 0;
			do 
			{
            
            System.out.println("Enter your name:");
            application.setName(scan.nextLine());
			
			
            System.out.println("Enter your age:");
            int c =Integer.parseInt(scan.nextLine());
            application.setAge(c);
			
            
            System.out.println("Enter your gender (M/F/T):");
            String d = scan.nextLine();
            application.setGender(d);
			

            System.out.println("Enter your aadharNumber:");
            long e = scan.nextLong();
            application.setAadharNumber(e);
			

            System.out.println("Enter your tax:");
            double f = scan.nextDouble();
            application.setTax(f);
			

            System.out.println("Are you married? (true/false):"); 
            application.setAreYouMarried(scan.nextBoolean());
			
			System.out.println(application); // implicitlly call toString

			/*System.out.println(app.getName());
			System.out.println(app.getAge());
			System.out.println(app.getGender());
			System.out.println(app.getAadharNumber());
			System.out.println(app.getTax());
			System.out.println(app.getAreYouMarried());*/
			
            i++;
            System.out.println("Type 'yes' to continue or 'no' to exit");
			collectFromUser = scan.next();
            scan.nextLine();	
        } 
			while(collectFromUser.equals("yes"));
    }
}

