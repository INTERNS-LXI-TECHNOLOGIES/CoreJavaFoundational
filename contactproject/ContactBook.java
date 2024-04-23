import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class ContactBook{
private String name;
private long phnNo;
private String email;
	
 public String getName(){
	 return name;
	}
 public void setName(String name){
	 this.name=name;
	}
 public long getPhnNo(){
	 return phnNo;
	}
 public void setPhnNo(long phnNo){
	 this.phnNo=phnNo;
	}
 public String getEmail(){
	 return email;
	}
 public void setEmail(String email){
	 this.email=email;
	}
	
public void file(ContactBook[] contactBook){
	
     String filePath = "C:\\LXI\\csv\\contacts.csv";
	 try {
         FileWriter writer = new FileWriter(filePath);
         writer.write("Name ,Phone Number ,Email \n");
            for (ContactBook contact : contactBook) {
                writer.write(contact.csvFile() + "\n");
            }
         writer.close();
         System.out.println("Contacts saved to " + filePath + " successfully!");
        } 
     catch (IOException e) {
            e.printStackTrace();
        }
	
	}
	   public void updateContact(String newName, long newPhnNo, String newEmail) {
        this.name = newName;
        this.phnNo = newPhnNo;
        this.email = newEmail;
		
    }
	
    public void readContacts() {
        String filePath = "C:\\LXI\\csv\\contacts.csv";
        try {
            File read = new File(filePath);
         Scanner myReader = new Scanner(read);  
		 System.out.println("Contacts:");
            while (myReader.hasNextLine()) {
             String data = myReader.nextLine();
             System.out.println(data);
            }
         myReader.close();
        }
         catch (IOException e) {
            System.out.println("No existing contacts.");
        }
    }
	
	public String csvFile(){
		
		//System.out.println("Name,Phone Number,Email");
		return name+","+phnNo+","+email;
	}

}