import java.util.Scanner;

public class Tdd
{
	public static void main (String[]args)
	{
		

		Scanner s = new Scanner(System.in);
		

		boolean programContinue = true;
		while (programContinue)
		{

			System.out.println("\n-----WELCOME TO YOUR ATTENDANCE TRACKING SYSTEM-----\n");
		        System.out.println("Enter 1 : Mark Your Attendance");
		        System.out.println("Enter 2 :Show Attendance Register");
		        System.out.println("Enter 3 :Quit");

		         String attendance  = s.nextLine();

			    switch (attendance)
			     {
				case "1":
					markYourAttendance();
					break;

				case "2":
					showAttendanceRegister();
					break;

				case "3":
					quit();
					programContinue = false;
					break;

				default:
					System.out.println("Invalid Expression");
			}
		}
}


static void markYourAttendance()
{
	System.out.println("Mark Your Attendance");
}


static void showAttendanceRegister()
{
	System.out.println("Show Attendance Details");
}
static void quit()
{
	System.out.println("Quit");
}
}


