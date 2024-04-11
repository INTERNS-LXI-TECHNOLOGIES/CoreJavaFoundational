package com.lxisoft.main;

import com.lxisoft.student.Student;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Student[] student=new Student[2];
Scanner scanner=new Scanner(System.in);
int i=0;
String collectDetails="yes";
do{
    student[i]=new Student();
	
    System.out.println("Enter Name:");
    student[i].name=scanner.nextLine();
     
    System.out.println("Enter Age:");
    student[i].age=scanner.nextInt();
    scanner.nextLine();	 
	
	System.out.println("Enter Gender:");
    student[i].gender=scanner.nextLine();
	
	System.out.println("Enter Subject:");
    student[i].name=scanner.nextLine();
        
     i++;
    
    if(i>=0){
        System.out.println("Do you want to enter another record?(yes/no):");
        collectDetails=scanner.nextLine();
	}
    if(i>=2 && collectDetails.equals("yes")){
        System.out.println("Student Details completed");
	}
    }	
	
while(i<2 && collectDetails.equals("yes"));

for (int q=0;q<i;q++){
	System.out.println("Do you want to change the subject"+(q+1)+"? (yes/no):");
	String changeSubject=scanner.nextLine();
    if(changeSubject.equals("yes")){
		System.out.println("Enter new subject:");
		student[q].subject=scanner.nextLine();
	}
}
}
}
