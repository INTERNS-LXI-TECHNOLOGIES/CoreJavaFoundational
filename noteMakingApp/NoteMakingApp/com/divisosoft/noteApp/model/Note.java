package com.divisosoft.noteApp.model;
import com.divisosoft.noteApp.view.View;
import com.divisosoft.noteApp.controler.Control;

public class Note{
	private int id;
	private String note;
	private String author;
	private String subject;
	
	public int getId(){
		return this.id=id;
	}
	public void setId(int id){
		this.id=id;
	}
	
	public String getNote(){
		return this.note=note;
	}
	public void setNote(String note){
		this.note=note;
	}
	
	public String getAuthor(){
		return this.author=author;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	
	public String getSubject(){
		return this.subject=subject;
	}
	public void setSubject(String subject){
		this.subject=subject;
	}
	
}