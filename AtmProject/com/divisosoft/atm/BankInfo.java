package com.divisosoft.atm;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
abstract class BankInfo extends Account implements Bank
{
	List<Account>accounts = new ArrayList<>();
	Scanner scan= new Scanner(System.in);
	
	public void printAccountDetails()
	{
		Account ac=new Account();
		System.out.println("Enter The PinNumber");
		ac.setPinNumber(scan.nextLine());
		ac.getPinNumber();
		
		System.out.println("Enter Your AccountUserName");
		ac.setAccountUserName(scan.nextLine());
		ac.getAccountUserName();
		
		System.out.println("Enter Your AccountNumber");
		ac.setAccountNumber(scan.nextLine());
		ac.getAccountNumber();
		accounts.add(ac);
	}
	
	public void DepositAmount()
	{
	System.out.println("Enter The PinNumber");
	String pinn= scan.next();
	scan.nextLine();
	for(Account accoun:accounts)
	{
			if(pinn.equals(accoun.getPinNumber()))
			{		
				System.out.println("Enter How Much Money Did You Want To Deposit");
				double u= Double.parseDouble(scan.nextLine());
				double logg = accoun.getAmount()+u;	
				System.out.println(logg);
				accoun.setAmount(logg);
			}	 
	}
	}
	
	public void widrawalAmount()
	{
	System.out.println("Enter The PinNumber");
	String pin= scan.next();
	scan.nextLine();
	for(Account account:accounts)
	{
		if(pin.equals(account.getPinNumber()))
		{
			System.out.println("Enter How Much Money Did You Want To Widrawal");
			double q= Double.parseDouble(scan.nextLine());
				double log = account.getAmount()-q;	
				account.setAmount(log);
			}
		}			
	}
	
	public abstract void ViewAccountBalance();
}