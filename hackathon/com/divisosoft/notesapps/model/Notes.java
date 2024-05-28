package com.divisosoft.notesapps.model;

public class Notes{

private int idNumber;
private String note;
private String author;
private  String subject;

public void setIdNumber(int number){
	
	this.idNumber=number;
}

public int getIdNumber(){
	
	return this.idNumber;
	
}

public void setNote(String note){
	
	this.note=note;
}

public String getNote(){
	
	return this.note;
	
}

public void setAuthor(String author){
	
	this.author=author;
}

public String getAuthor(){

	
	return this.author;
	
}

public void setSubject(String subject){
	
	this.subject=subject;
}

public String getSubject(){

	
	return this.subject;
	
}

}