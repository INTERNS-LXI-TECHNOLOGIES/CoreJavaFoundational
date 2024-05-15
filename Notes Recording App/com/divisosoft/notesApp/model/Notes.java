package com.divisosoft.notesApp.model;

public class Notes{

   private int idNumber;
   private String author;
   private String subject;
   private String note;
   
   
 public void setIdNumber(int number){
	  this.idNumber = number;
 }

 public int getIdNumber(){
	  return this.idNumber;
 }

 public void setAuthor(String author){
	  this.author = author;
 }
 
 public String getAuthor(){
	  return this.author;
 }

 public void setSubject(String subject){
	  this.subject = subject;
 }
 
 public String getSubject(){
	  return this.subject;
 }
 
 public void setNote(String note){
	  this.note = note;
 }
 
 public String getNote(){
	  return this.note;
 }
 
 public String toString(){
	  return"\n"+"idNumber:"+ idNumber+"\n"+"author:"+author+"\n"+"subject"+subject+"\n"+"note :"+note+"\n";
 }
 







}