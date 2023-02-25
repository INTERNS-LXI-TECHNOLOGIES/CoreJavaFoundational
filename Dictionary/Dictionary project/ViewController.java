import java.util.Scanner;

public class ViewController
{
	 
	 
	 int i=0;
	 Dictionary dictionary = new Dictionary();
	 Scanner s = new Scanner(System.in);
	


boolean programContinue = true;

public void viewThings(){
while(programContinue)
{
System.out.println("---------WELCOME TO OXFORD ENGLISH DICTIONARY--------------------");
System.out.println("______DICTIONARY: The Universe In Alphabetical Order______");
System.out.println("Press 1: Add new word");
System.out.println("Press 2: view Dictionary");
System.out.println("Press 3: quit");


String number = s.nextLine();
switch(number)
{
case "1":
addNewWord();
break;	
	
case "2":
viewDictionary();
break;

case "3":
System.out.println("Quit");
programContinue = false; 

break;


default:
System.out.println("Invalid");
}
}
}

public void addNewWord()
{
	while(i<10){

	System.out.println("Add Word");
    dictionary.getWords()[i].setWord(s.nextLine()) ;
	
	
	System.out.println("Add Meaning");
	dictionary.getWords()[i].setMeaning(s.nextLine()); ;
	
	System.out.println("Add Verb");
	dictionary.getWords()[i].setVerb(s.nextLine()) ;
	
	System.out.println("Add Adjective");
	dictionary.getWords()[i].setAdjective(s.nextLine()) ;
	
	System.out.println("Enter yes to continue no to quit");
                    String response = s.nextLine();
				    i++;
                    if(response.equals("no"))
		              {
                          break;
                      }
				  }
}

public void viewDictionary()
{
System.out.println(dictionary);
}
}