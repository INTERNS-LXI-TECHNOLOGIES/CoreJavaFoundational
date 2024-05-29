package com.lxisoft.textfile;
import com.lxisoft.control.Control;
import com.lxisoft.model.Note;
import com.lxisoft.view.View;
import com.lxisoft.view.CreateView;
import com.lxisoft.control.ControlView;
import java.util.Scanner;
import  com.lxisoft.view.Read;
import com.lxisoft.control.ControlRead;


public class Tdd{
	
	public static void main(String[] argc){

		Scanner scanner = new Scanner(System.in);
	
		Control control = new Control();
	
			control.controlNotes();
	}
} 