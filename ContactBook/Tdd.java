import java.util.*;
import java.io.*;

public class Tdd{

	public static void main(String[] argc){
		
	Scanner scan = new Scanner(System.in);
	
	ContactBook[] contactBook = new ContactBook[5];
	for(int i=0; i<contactBook.length; i++){
		
		contactBook[i] = new ContactBook();
		System.out.println("Enter Your Name");
		contactBook[i].setName(scan.nextLine());
		
		contactBook[i] = new ContactBook();
		System.out.println("Enter Your PhoneNumber");
		contactBook[i].setName(scan.nextLine());
		
		contactBook[i] = new ContactBook();
		System.out.println("Enter Your Email");
		contactBook[i].setName(scan.nextLine());
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}