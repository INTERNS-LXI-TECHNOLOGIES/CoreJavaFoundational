package com.divisosoft.atm.controller;
import com.divisosoft.atm.model.*;
import java.util.Scanner;
public class AccountInfo extends BankInfo
{
	Scanner scan = new Scanner(System.in);
	String Branchname;
	    public AccountInfo(String Branchname,String Bankname)
		{
			super(Bankname);
			this.Branchname = Branchname;
			System.out.println("\t"+Branchname+"\n"+"\t"+Bankname);
		}
	 public void ViewAccountBalance() 
	 {
        System.out.println("Enter The AccountNumber You Want To ViewAccountBalance");
        String accountNumber = scan.next();
        scan.nextLine();

        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Balance: " + account.getAmount());
        } 
		else 
		{
            System.out.println("Account not found.");
        }
    }
}