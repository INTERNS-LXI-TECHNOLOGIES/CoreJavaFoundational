package com.lxisoft.view;

import com.lxisoft.model.Note;

public class Read {
	
    public void readNotes(Note[] notes) {
        boolean notesAvailable = false;
        for (Note note : notes) {
            if (note != null) {
                System.out.println(note);
                notesAvailable = true;
            }
        }
        if (!notesAvailable) {
            System.out.println("No notes available.");
        }
    }
}
