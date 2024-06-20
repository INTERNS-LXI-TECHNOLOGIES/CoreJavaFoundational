package com.lxisoft.student;
import java.util.Scanner;
public class Tdd{
public static void main(String[]args){
	
	Student student = new Student();
	
	
	for(int i=0;i<student.subject.length;i++){
		Scanner scanner = new Scanner(System.in);
		student.subject[i] = new Subject();
		System.out.println("Enter the subjectName");
		student.subject[i].subjectName=scanner.nextLine();
		System.out.println("Enter mark");
		student.subject[i].mark=scanner.nextInt();
		
	}
	
	student.Total();
	
}
	
}