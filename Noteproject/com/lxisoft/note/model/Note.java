package com.lxisoft.note.model;

public class Note
{
	private int id;
	private String note;
	private String subject;
	private String author;
	
	
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	
	
	
	public void setNote(String note)
	{
		this.note=note;
	}
	
	public String getNote()
	{
		return note;
	}
	
	
	
	
	public void setSubject(String subject)
	{
		this.subject=subject;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	
	
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	
	public String toString()
	{
		return  "\n\n ID NO    : "+id+"\n NOTE     : "+note+"\n SUBJECT  : "+subject+"\n AUOTHOR  : "+author;
	}
	
}
