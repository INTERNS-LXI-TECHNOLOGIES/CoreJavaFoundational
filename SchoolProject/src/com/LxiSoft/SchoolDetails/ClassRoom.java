package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	int numOfStudents;
	
	Teacher t; 
	Student[] student; 
	
	public void getClassDetails(){
		Scanner s = new Scanner(System.in);
		t = new Teacher();
		System.out.println("Enter the standard ");
		this.standard = s.nextInt();
		s.nextLine();
		System.out.println("Enter the division ");
		this.division = s.nextLine();
		t.getTeacherDetails();
		System.out.println("Enter the number of students in the class ");
		numOfStudents = s.nextInt();
		s.nextLine();
		student = new Student[numOfStudents];
		
		for(int i=0; i<numOfStudents; i++){    
			student[i] = new Student();
		    student[i].getStudentDetails(i);
		}
	}
	public void printClassDetails(int i){
		System.out.println("\t----> "+(i+1)+" Class Details<----\t");
		System.out.println("Standard          \t: "+this.standard);
		System.out.println("Division          \t: "+this.division);
		System.out.println("Number of Students\t: "+this.numOfStudents);
	    t.printTeacherDetails();
	    for(int j=0; j<numOfStudents; j++){
		    System.out.println("\t---->Student Details<----\t");
		    student[j].printStudentDetails();
		    
		}
	}
	public void printClassRankList(){

		for(int m=0; m<numOfStudents; m++){
			for(int x=m+1; x<numOfStudents; x++){
				if(student[m].totalMark<student[x].totalMark){
					Student temp = new Student();
					temp = student[m];
					student[m] = student[x];
					student[x] = temp;			
				}
			}
		}
		System.out.println("The Class Rank List");
		System.out.println(">-------------------------------<");
		for(int l=0; l<numOfStudents; l++){
			System.out.println("|\tRANK    \t: "+(l+1)+"\t|");
			System.out.println("|\tNAME    \t: "+student[l].name+"\t|");
			System.out.println("|\tRoll Num\t: "+student[l].rollNum+"\t|");
			System.out.println("|\tTOTAL   \t: "+student[l].totalMark+"\t|");
			System.out.println(" ------------------------------ ");
		}
	}
}
		