package com.divisosoft.atm.controller;
import com.divisosoft.atm.model.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
  public abstract class BankInfo extends Account implements Bank
{
	String Bankname;
    public BankInfo(String Bankname)
	{
		this.Bankname = Bankname;
	}
	Map<String,Account> accounts = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    public void printAccountDetails() 
	{
        Account ac = new Account();
        System.out.println("Enter The PinNumber");
        ac.setPinNumber(scan.nextLine());
        ac.getPinNumber();

        System.out.println("Enter Your AccountUserName");
        ac.setAccountUserName(scan.nextLine());
        ac.getAccountUserName();

        System.out.println("Enter Your AccountNumber");
        String accountNumber = scan.nextLine();
        ac.setAccountNumber(accountNumber);
        ac.getAccountNumber();

        accounts.put(accountNumber, ac);
    }
	
	    public void depositAmount() 
	{
        System.out.println("Enter The Account Number");
        String accountNumber = scan.next();
        scan.nextLine();

        if (accounts.containsKey(accountNumber)) 
		{
            Account account = accounts.get(accountNumber);
            System.out.println("Enter How Much Money Did You Want To Deposit");
            double depositAmount = Double.parseDouble(scan.nextLine());
            double newBalance = account.getAmount() + depositAmount;
			String newMini =account.getMini()+"\n"+"\t deposit amount:"+depositAmount+"\t deposit balance:"+newBalance;
			account.setAmount(newBalance);
			account.setMini(newMini);
			
        }
			else 
				{
				System.out.println("Account not found.");
				}
    }
	
    public void withdrawalAmount() 
	{
        System.out.println("Enter The Account Number");
        String accountNumber = scan.next();
        scan.nextLine();
        
        if (accounts.containsKey(accountNumber))
			{
            Account account = accounts.get(accountNumber);
            System.out.println("Enter How Much Money Did You Want To Withdraw");
            double withdrawalAmount = Double.parseDouble(scan.nextLine());
            double newBalance = account.getAmount() - withdrawalAmount;
			String newMini =account.getMini()+"\n"+"\t withdrawal amount:"+withdrawalAmount+"\t withdrwal balance:"+newBalance;
            account.setAmount(newBalance);
			account.setMini(newMini);
			
			} 
				else
					{
					System.out.println("Account not found.");
					}
    }
	public abstract void ViewAccountBalance();
	
	public void miniStatement() 
	{	
    System.out.println("Enter The Account Number");
    String accountNumber = scan.next();
    scan.nextLine();
	if (accounts.containsKey(accountNumber)) 
		{		
	Account account =  accounts.get(accountNumber);
            System.out.println("Your MiniStatement: \n" +account.getMini());	
			}
		else 
		{	
			System.out.println("Account not found.");
		}
	
	}
	
	public void bankTransfer()
	{
		System.out.println("Enter The Account Number");
		String YourAccountNumber =  scan.nextLine();
			if(accounts.containsKey(YourAccountNumber))
			{
			System.out.println("Enter the Account Number to Transfer ");
			String targetAccountNumber =  scan.nextLine();
				if(accounts.containsKey(targetAccountNumber))
				{
					if(YourAccountNumber!=targetAccountNumber)
					{
						System.out.println("Enter the Amount To Transfer");		
						double Transfer = Double.parseDouble(scan.nextLine());
						Account YourAccount= accounts.get(YourAccountNumber);
						Account targetAccount= accounts.get(targetAccountNumber);
							if(YourAccount.getAmount()>=Transfer)
							{
								double newYourAccount = YourAccount.getAmount()-Transfer;
								double newtargetAccount = targetAccount.getAmount()+Transfer;
					
								YourAccount.setAmount(newYourAccount);
								targetAccount.setAmount(newtargetAccount);
				
								System.out.println("Transfer Successful.");
								//accounts.put("Transfer from " + YourAccountNumber + " to " + targetAccountNumber + ": " + Transfer);
							}
						else 
						{
							System.out.println("Insufficient balance in the source account.");
						}
				}
					else 
					{
						System.out.println("Dont'n Enter The Same AccountNumber");
					}
				}
				else
				{
					System.out.println("Target account not found.");
				}	
			}
				else
				{
					System.out.println("Source account not found.");
				}	
	
		
	}	
}
	