
import java.util.Scanner;
public class ViewController{



    //String reponse;

	 Scanner scanner=new Scanner(System.in); 
	
	
	
   Dictionary dictionary = new Dictionary();
 
public void  viewThing(){
	
	boolean flag=true;
 while(flag){
	 System.out.println(" \n \n   Welcome to PRO-DICTIONARY \n\n 1: upload a word\n\n 2: print word\n\n 3: Quit");
	String num=scanner.nextLine();
	switch(num){
	 case("1"):
	 uploadWord();
	 break;
	 case("2"):
	printWord();
	 break;
	 case("3"):
	 System.out.println("quit");
	flag = false ;
	 break;
	 
	 default:
	 System.out.println("please select value between 1 to 3");
	 
}
}
	
}
	
 void uploadWord(){
	  boolean flag=true;
	 
	 String response="";
	int i=0;
	 while(flag)
	 {
		  
	 
	  System.out.println("Enter word");
	 
	  dictionary.setWordd(scanner.nextLine());
	 
	  System.out.println("Enter meaning");
	  
	  dictionary.getWords()[i].setMeaning(scanner.nextLine());
	  
	   System.out.println("Enter adjective");
	  dictionary.getWords()[i].setAdjective(scanner.nextLine());;
	   
	   System.out.println("Enter verb");
	  
	 dictionary.getWords()[i].setVerb(scanner.nextLine());
	  
	  System.out.println("Enter noun");
	  
	  dictionary.getWords()[i].setNoun(scanner.nextLine());
	  
	   i++;
	   System.out.println("do you want to continue yes or no");
	  response=scanner.nextLine();
	   if(response.equals("no")){
		   flag=false;
	 }
	  
	   
	    
	 }
	 
 }


public void printWord(){
 System.out.println(dictionary); 	
}











}	