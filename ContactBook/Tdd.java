import java.util.*;
import java.io.*;

public class Tdd {
	
    public static void main(String[] argc) {

        Scanner scan = new Scanner(System.in);

        ContactBook[] contactBook = new ContactBook[2];
        File file = new File("cntc.csv"); 

        for (int i = 0; i < contactBook.length; i++) {

            contactBook[i] = new ContactBook();
            System.out.println("Enter Your Name");
            contactBook[i].setName(scan.nextLine());

            System.out.println("Enter Your PhoneNumber");
            contactBook[i].setPhoneNumber(scan.nextLong());
            scan.nextLine();
            
            System.out.println("Enter Your Email");
            contactBook[i].setEmailId(scan.nextLine());
        }

        writeContactsToFile(contactBook, file); 
    }

    public static void writeContactsToFile(ContactBook[] contacts, File file) {
        try (FileWriter filewriter = new FileWriter(file, true)) {
            for (ContactBook contact : contacts) {
                filewriter.write("Name: " + contact.getName() + "\n");
                filewriter.write("Phone Number: " + contact.getPhoneNumber() + "\n");
                filewriter.write("Email: " + contact.getEmailId() + "\n\n");
            }
        } 
			catch (IOException exception) {
				exception.printStackTrace();
			}
    }
}
