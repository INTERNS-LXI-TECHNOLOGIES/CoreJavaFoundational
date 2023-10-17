 package com.divisosoft.atm.view;
 import com.divisosoft.atm.controller.*;
 import com.divisosoft.atm.model.*;
 import java.util.Scanner;
 public class Tdd
 {
 public static void main(String[] args)
 {
	System.out.println("\t \t WELCOM TO CSB ATM  \n  \t \t HAVE A NICE DAY");
	Scanner scan = new Scanner(System.in);
	Bank bank = new AccountInfo("SBI","PALLAVUR");
	System.out.println("Insert The Card And Press yes To Continue no To Exit");
	String pin = scan.nextLine();
	if(pin.equals("yes"))  //name.equals(au.getUserName())&&
	{
		boolean check = true;
		while(check)
		{
		String upper = "Press 1 To Create a Bank Account "+"\n"+"Press 2 To Deposit"+"\n"+"press 3 To Widrawal"+"\n"+"press 4 To View"+"\n"+"press 5 To MiniStatement"+"\n"+"press 6 To bankTransfer"+"\n"+"press 7 To Exit";
		System.out.println(upper.toUpperCase());
		String str = scan.nextLine();
		for(int i=0;i<1;i++)
		{
			System.out.println();
		}
			switch(str)
			{
				case "1":
				bank.printAccountDetails();
				break;
			
					case "2":
					bank.depositAmount();
					break;
			
						case "3":
						bank.withdrawalAmount();
						break;
			
							case "4":
							bank.ViewAccountBalance();
							break;
								
								case "5":
								bank.miniStatement();
								break;
								
									case "6":
									bank.bankTransfer();
									break;
								
										case "7":
										System.out.println("Thank You....Come Again");
										
			try
			{
			Thread.sleep(3000);
			for(int i=0;i<100;i++)
				{
				System.out.println();
				}			
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
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
	