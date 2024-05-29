package com.lxisoft.control;

import com.lxisoft.model.Note;
import com.lxisoft.view.CreateView;

public class ControlView {
     
	 CreateView createView = new CreateView();

    public Note createNote() {
        return createView.createNote();
    }
}
