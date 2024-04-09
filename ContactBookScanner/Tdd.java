import java.util.Scanner;
public class Tdd{
	public static void main(String[]args){
	
		ContactBook[] cb =new ContactBook[5];
		
		cb[0]=new ContactBook();
		cb[0].setName("RAHUL");
		cb[0].setPhnumber(7756154796l);
		cb[0].setEmailid("rahul1234@gmail.com");
		
		for(int i=0;i<cb.length;i++){
			System.out.println(cb[i]);
		}
		
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER NAME: ");
		String name=s.nextLine();
		System.out.print("ENTER CONTACT NUMBER: ");
		long phnumber=s.nextLong();
		s.nextLine();
		System.out.print("ENTER EMAIL ID: ");
		String emailid=s.nextLine();
		
	}
}