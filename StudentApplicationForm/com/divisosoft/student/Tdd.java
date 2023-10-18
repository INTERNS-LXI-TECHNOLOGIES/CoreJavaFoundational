
package com.divisosoft.student;

import java.util.Scanner;
public class Tdd{
static Scanner scan = new Scanner(System.in);	
	public static void main(String[] args){
	Application[] app = new Application[5];
	int i=0;
	String s="";
	do{
		app[i] = new Application();
		
		System.out.print("Enter name :");
		app[i].setName(scan.nextLine());
		
		System.out.print("Enter age :");
		app[i].setAge(Integer.parseInt(scan.nextLine()));		
	
		System.out.print("Enter your gender :");
		app[i].setGender(scan.nextLine());
		
		System.out.print("Enter your tax :");
		app[i].setTax(scan.nextDouble());
		
		System.out.print("Enter your adhar number :");
		app[i].setAdharNo(scan.nextLong());
		
		System.out.print("Marital status ture/false :");
		app[i].setMaritalStatus(scan.nextBoolean());		

		System.out.println(app[i].getName());
		System.out.println(app[i].getGender());
		System.out.println(app[i].getTax());
		System.out.println(app[i].getAdharNo());
		System.out.println(app[i].getMaritalStatus());
		System.out.println(app[i].getAge());

		i++;
		System.out.println("enter yes or no");
		s= scan.next();
		scan.nextLine();
		
	}while(s.equals("y"));
	}
}