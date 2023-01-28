public class Tdd
{
public static void main(String[] args)
{

MovieScript movieScript = new MovieScript("Jai Bhim","TJ Gnanavel","Sean Rolden","02/November/2021","Legal Drama");

System.out.println("\n");


Hero surya = new Hero("Surya","Advct. Chandru");

movieScript.hero[1] = surya;


surya.dialogues[0] = "i don't believe in luck...";
surya.dialogues[1] = "i believe in truth...";
surya.dialogues[2] = "Law is a very powerful weapon...";


Hero vijay = new Hero("Vijay","Soldier Sidharth");

movieScript.hero[2] = vijay;


vijay.dialogues[0] = "Just remember that...!!";
vijay.dialogues[1] = "Don't run back girls and buses...";
vijay.dialogues[2] = "Don't judge a book by it's cover...";


Heroine kajal = new Heroine("Kajal","Dr.Varsha");

movieScript.heroine[1] = kajal;

kajal.dialogues[0] = "hiii...";
kajal.dialogues[1] = "hloooo....";
kajal.dialogues[2] = "so cool....";       


Heroine thammanna = new Heroine("Thammanna","College Student Meera");

movieScript.heroine[2] = thammanna;

thammanna.dialogues[0] = "yesss...";
thammanna.dialogues[1] = "i'm on the way";
thammanna.dialogues[2] = "noooo....it's okey...";



Comedian santhanam = new Comedian("Santhanam","Boss Kumar");

movieScript.comedian[1] = santhanam;

santhanam.dialogues[0] = "Building strong basement weak...";
santhanam.dialogues[1] = "Nanu apdiyee shock ayiten..!!";
santhanam.dialogues[2] = "dei nan yogiyenda...";


Comedian suraj = new Comedian("Suraj","Dhashamoolam Dhamu");

movieScript.comedian[2] = suraj; 

suraj.dialogues[0] = "Mappu vechitange aappu...";
suraj.dialogues[1] = "hello...";
suraj.dialogues[2] = "i will kill you...";


Villan prakashRaj = new Villan("PrakashRaj","Smuggler Raja Reddy");

movieScript.villan = prakashRaj;

prakashRaj.dialogues[0] = "There is no hero without a villan...";
prakashRaj.dialogues[1] = "If you are bad i am your dad..."; 
prakashRaj.dialogues[2] = "I don't like violence but violence like me...";

movieScript.printmovieScript();
}
}

