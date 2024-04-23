import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class Tdd{
public static void main(String[] agrs){
    Scanner scanner =new Scanner(System.in);
    ContactBook[] contactBook = new ContactBook[2];
	
	ContactBook fileReader = new ContactBook();
        fileReader.readContacts();
		
		//System.out.println("Contact Book"+"\n");
		
    for(int i=0; i<contactBook.length;i++){
		 contactBook[i]=new ContactBook();
		 System.out.println("Enter name: ");
		 contactBook[i].setName(scanner.nextLine());
		 System.out.println("Enter Phone number");
		 contactBook[i].setPhnNo(scanner.nextLong());
		 
		 scanner.nextLine();
		 System.out.println("Enter Email");
		 contactBook[i].setEmail(scanner.nextLine());
		 System.out.println("\n"+"Saved......."+"\n");
		 }	
	System.out.println("Enter the name of the contact to update: ");
       String nameToUpdate = scanner.nextLine();
     for (ContactBook contact : contactBook) {
          if (contact.getName().equals(nameToUpdate)) {
             System.out.println("Enter new name: ");
             String newName = scanner.nextLine();
             System.out.println("Enter new Phone number: ");
             long newPhnNo = scanner.nextLong();
             scanner.nextLine(); // consume newline
             System.out.println("Enter new Email: ");
             String newEmail = scanner.nextLine();
             contact.updateContact(newName, newPhnNo, newEmail);
             System.out.println("Contact updated successfully!");
              break;
            }
        }
	ContactBook fileSaver = new ContactBook();
	
	
	
	fileSaver.file(contactBook);
  
	
  }  
} 
