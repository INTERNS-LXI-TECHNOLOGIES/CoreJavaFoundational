import java.util.Scanner;
public class CompanyDatas{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
boolean restart=true;

System.out.println("*****	PASSWORD: LXI	*****");
System.out.println("*****	EMP ID'S:125,126,127,128 *****"+"\n");
while(restart){
	System.out.print("ENTER THE PASSWORD: ");
	String password = scanner.nextLine();
		if(password.equalsIgnoreCase("LXI")){
			System.out.print("ENTER EMPLOYEE ID: ");
			int id=scanner.nextInt();
			switch(id){
			case 125:
			empdetails1();
			break;
			
			case 126:
			empdetails2();
			break;
			
			case 127:
			empdetails3();
			break;
			
			case 128:
			empdetails4();
			break;
			
			default:
			System.out.println("INVALID EMP ID");
			}
		}
		else{
			restart=false;
		}
		scanner.nextLine();
		if(password.equalsIgnoreCase("LXI")){
		System.out.print("\n"+"SEARCH OTHER EMP Y/N: ");
		String again = scanner.nextLine();
			switch(again){
				case ("y"):
				break;
				
				default:
				restart=false;
				break;
			}
			}
		else{
			restart=false;
		}
	}
}
static void empdetails1(){
	System.out.println("\n"+"EMPLOYEE NAME:-AKASH V");
	System.out.println("EMPLOYEE AGE:-22YRS OLD");
	System.out.println("EMPLOYEE ID:-LXI000125");
	System.out.println("EMPLOYEE POST:-ASS.SOFTWARE DEVELOPER");
}
static void empdetails2(){
	System.out.println("\n"+"EMPLOYEE NAME:-ASWIN");
	System.out.println("EMPLOYEE AGE:-22YRS OLD");
	System.out.println("EMPLOYEE ID:-LXI000126");
	System.out.println("EMPLOYEE POST:-JUN.SOFTWARE DEVELOPER");
}
static void empdetails3(){
	System.out.println("\n"+"EMPLOYEE NAME:-VISHNU");
	System.out.println("EMPLOYEE AGE:-22YRS OLD");
	System.out.println("EMPLOYEE ID:-LXI000127");
	System.out.println("EMPLOYEE POST:-SENI.SOFTWARE DEVELOPER");
}
static void empdetails4(){
	System.out.println("\n"+"EMPLOYEE NAME:-ANIL DAS");
	System.out.println("EMPLOYEE AGE:-22YRS OLD");
	System.out.println("EMPLOYEE ID:-LXI000128");
	System.out.println("EMPLOYEE POST:-SOFTWARE DEVELOPER TRAINNER");
}
}