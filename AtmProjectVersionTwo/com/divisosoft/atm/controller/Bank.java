package com.divisosoft.atm.controller;
import com.divisosoft.atm.model.*;
public interface  Bank
{
public void printAccountDetails();  //now this method is implicitly abstract
public void depositAmount();
public void withdrawalAmount();
public void ViewAccountBalance();
public abstract void  miniStatement(); //now this method we put abstract explecitly
public void  bankTransfer();
}
	
	
	
	
	