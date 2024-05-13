package com.divisosoft.notetaking.model;
public class Note{
private	int idNumber;
private String notes;
private String author;
private String subject;

 public int getidNumber() {
        return idNumber;
    }

    public void setidNumber(int idNumber) {
        this.idNumber= idNumber;
    }
	 public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
	 public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
	 public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


public String toString(){
	return "ID: "+idNumber+"\n"+"Author Name: "+author+"\n"+"Subject: "+subject+"\n"+"note: "+notes+"\n";
}

}