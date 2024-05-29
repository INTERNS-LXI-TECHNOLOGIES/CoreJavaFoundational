package com.lxisoft.model;

public class Note {
    private int id;
    private String note;
    private String author;
    private String subject;

    public Note(int id, String note, String author, String subject) {
        this.id = id;
        this.note = note;
        this.author = author;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Note [id=" + id + ", note=" + note + ", author=" + author + ", subject=" + subject + "]";
    }
}
