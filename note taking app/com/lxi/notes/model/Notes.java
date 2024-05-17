package com.lxi.notes.model;

public class Notes{
private String noteid;
private String author;
private String subjects;
private String notes;	

public String getAuthor(){
	return author;}	
public void setAuthor(String author){
	this.author=author;}
public String getSubjects(){
	return subjects;}	
public void setSubjects(String subjects){
	this.subjects=subjects;}
public String getNotes(){
	return notes;}	
public void setNotes(String notes){
	this.notes=notes;}	
public String getNoteid(){
	return noteid;}	
public void setNoteid(String noteid){
	this.noteid=noteid;}	
	
	
	 public String toString() {
        return "Author: " +getAuthor()+ "\n" +"Subject: " + getSubjects() + "\n" +"Notes: " + getNotes() + "\n" +"Note ID: " + getNoteid();
    }
}