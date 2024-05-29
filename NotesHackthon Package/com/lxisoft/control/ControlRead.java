package com.lxisoft.control;

import com.lxisoft.model.Note;
import com.lxisoft.view.Read;

public class ControlRead {
     Read read = new Read();

    public void readNotes(Note[] notes) {
        read.readNotes(notes);
    }
}
