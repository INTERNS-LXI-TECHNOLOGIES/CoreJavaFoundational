import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Tdd{
public static void main(String[] agrs){

        Scanner scanner =new Scanner(System.in);
        ContactBook[] contactBook = new ContactBook[2];
		
       for(int i=0; i<contactBook.length;i++){
		   contactBook[i]=new ContactBook();
		   System.out.println("Enter name: ");
		   contactBook[i].setName(scanner.nextLine());
		   System.out.println("Enter Phone number");
		   contactBook[i].setPhnNo(scanner.nextLong());
		   scanner.nextLine();
		   System.out.println("Enter Email");
		   contactBook[i].setEmail(scanner.nextLine()); 

		   
		   
	   }	   
	   
	     for (ContactBook contact : contactBook) {
            System.out.println(contact);
        }
	   
	   
    }
}
