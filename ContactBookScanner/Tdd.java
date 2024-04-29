import java.util.Scanner;
import java.io.*;
public class Tdd{
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	boolean page=true;
	
		try{
			File file = new File("D:\\JAVA PROJECTS\\ContactBookScanner\\file\\contactBook.csv");
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } 
			else{
                System.out.println("File already exists");
            }
        }
		catch(IOException e){
			System.out.print("failed"+e.getMessage());
		}

		ContactBook[] cb =new ContactBook[5];
			
		while(page){
			System.out.print("\t	WELCOME TO CONTACT BOOK DETAILS	\n");
			System.out.print("\n YOUR OPTIONS ARE: \n");
			System.out.print("\n 1. ADD CONTACT \n");
			System.out.print(" 2. SEARCH CONTACT \n");
			System.out.print(" 3. UPDATE CONTACT \n");
			System.out.print(" 4. DELETE CONTACT \n");
			System.out.print(" 5. EXIT \n");
		
			System.out.print("\n ENTER YOUR OPTION: ");
			int option=s.nextInt();
			s.nextLine();
			
			switch(option){
				case 1:
					System.out.print(" ENTER NAME: ");
					String name=s.nextLine();
					System.out.print(" ENTER CONTACT NUMBER: ");
					long phnumber=s.nextLong();
					s.nextLine();
					System.out.print(" ENTER EMAIL ID: ");
					String emailid=s.nextLine();
					break;
					
				case 2:
					System.out.print(" SEARCH NAME: ");
					String searchName=s.nextLine();
					
					break;
					
				case 3:
					System.out.print(" ENTER NAME TO BE UPDATEED: ");
					String updateName=s.nextLine();
				
					System.out.print(" ENTER NEW NAME: ");
					String newName=s.nextLine();
					System.out.print(" ENTER NEW CONTACT NUMBER: ");
					long newPhnumber=s.nextLong();
					s.nextLine();
					System.out.print(" ENTER NEW EMAIL ID: ");
					String newEmailid=s.nextLine();
					break;
					
				case 4:
					System.out.print(" ENTER CONTACT NAME TO BE DELETED: ");
					String deleteName=s.nextLine();
					
					break;
					
				case 5:
					page=false;
					break;
					
				default:
					System.out.print("\t	INVALID OPTION !");
			}	
			if(option<6){
				System.out.print("\n DO YOU WISH TO CONTINUE?--Yes/No--: ");
				String choice=s.nextLine();
				if(choice.equalsIgnoreCase("yes")){
				page=true;
				}
			else{
				page=false;
				}
			}
		}
	}
}