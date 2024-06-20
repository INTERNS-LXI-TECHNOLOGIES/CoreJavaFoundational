package com.lxisoft.student;
public class Student{

String studentName;


Subject[]subject = new Subject[3];


public void Total(){
	
	var sum=0;
	
	for(int i=0;i<subject.length;i++){
		
		sum+=subject[i].mark;
	}
	System.out.println(sum);
}

}