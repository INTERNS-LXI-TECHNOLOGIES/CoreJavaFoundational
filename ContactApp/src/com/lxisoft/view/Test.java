
import java.io.*;
public class Test{
public static void main(String[] args) {
	File f=new File("contact.csv");
	try{
	f.createNewFile();
	FileWriter write=new FileWriter(f);
	BufferedWriter fwrite=new BufferedWriter(write);
	fwrite.write("ajil,9656240099");  
	fwrite.close();
     }
    catch(IOException e){
    	System.out.println("Exception "+e);
    }
    
	try{
	FileReader read=new FileReader(f);
	BufferedReader bread=new BufferedReader(read);
	System.out.println(bread.readLine());
    }
     catch(IOException e){
    	System.out.println("Exception "+e);
    } 

	}
}
