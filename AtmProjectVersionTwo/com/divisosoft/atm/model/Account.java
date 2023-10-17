package com.divisosoft.atm.model;
public class Account
{
private String pinNumber;
private String accountUserName;
private String accountNumber;
private double amount;
private String mini;

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

public void setMini(String mini)
{
	this.mini =  mini;
}
public String getMini()
{
	return mini;
}


public String toString()
{
	String toString="";
	toString =pinNumber+"\n"+accountUserName+"\n"+accountNumber+"\n"+amount;
	return toString;
}
}