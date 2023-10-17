package com.divisosoft.atm;
public class AccountInfo extends BankInfo
{
	public void ViewAccountBalance()
	{
	
		System.out.println("Enter The PinNumber");
	    String pinnn= scan.next();
		scan.nextLine();
		for(Account accou:accounts)
	{
			if(pinnn.equals(accou.getPinNumber()))
			{
			System.out.println(accou.getAmount());
		
			}
	}
	}
}