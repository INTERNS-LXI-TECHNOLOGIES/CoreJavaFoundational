 package com.divisosoft.atm;
 import java.util.Scanner;
 public class Tdd
 {
 public static void main(String[] args)
 {
	System.out.println("Welcom To CSB ATM");
	Scanner scan = new Scanner(System.in);
	Bank bank = new AccountInfo();
	System.out.println("Insert The Card And Press yes To Continue no To Exit");
	String pin = scan.nextLine();
	if(pin.equals("yes"))  //name.equals(au.getUserName())&&
	{
		boolean check = true;
		while(check)
		{
		System.out.println("Press 1 To Create a Bank Account ");
		System.out.println("Press 2 To Deposit");
		System.out.println("press 3 To Widrawal");
		System.out.println("press 4 To View");
		System.out.println("press 5 To Exit");
		String str = scan.nextLine();
			switch(str)
			{
				case "1":
				bank.printAccountDetails();
				break;
			
					case "2":
					bank.DepositAmount();
					break;
			
						case "3":
						bank.widrawalAmount();
						break;
			
							case "4":
							bank.ViewAccountBalance();
							break;
			
								case "5":
								check = false;
								break;
			
									default:
									System.out.println("Invalid Number...Enter The Correct Number Seen Above");
			
			}	
		}
	}
		else
		{
			System.out.println("Enter the Correct Pin Number");
		}
 }
}
	