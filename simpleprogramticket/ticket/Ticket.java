package com.lxisoft.metro.ticket;
import java.util.Scanner;
import com.lxisoft.metro.passenger.Passenger;
public class Ticket
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	Passenger p = new Passenger();
	
	System.out.println("ENTER NAME");
	String name= sc.nextLine();
	p.setName(name);
	System.out.println("ENTER ADDRESS");
	String address=sc.nextLine();
	p.setAddress(address);
	
System.out.println("TICKET RESERVED FOR " +p.getName()+ " FROM " +p.getAddress());
}
}