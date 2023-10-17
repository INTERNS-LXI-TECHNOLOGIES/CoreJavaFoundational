package com.divisosoft.atm;
public class Account
{
private String pinNumber;
private String accountUserName;
private String accountNumber;
private double amount;

public void setPinNumber(String pinNumber)
{
	this.pinNumber =  pinNumber;
}
public String getPinNumber()
{
	return pinNumber;
}

public void setAccountUserName(String accountUserName)
{
	this.accountUserName = accountUserName;
}
public String getAccountUserName()
{
	return accountUserName;
}

public void setAccountNumber(String accountNumber)
{
	this.accountNumber = accountNumber;
}
public String getAccountNumber()
{
	return accountNumber;
}

public void setAmount(double amount)
{
	this.amount = amount;
}

public double getAmount()
{
	return amount;
}

public String toString()
{
	String toString="";
	toString =pinNumber+"\n"+accountUserName+"\n"+accountNumber+"\n"+amount;
	return toString;
}
}