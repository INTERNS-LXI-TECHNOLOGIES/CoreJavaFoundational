package com.lxisoft.ghost.main;
import com.lxisoft.ghost.view.Ghostview;
import com.lxisoft.ghost.controller.Ghostcontroller;
public class Tdd{
	
public static void main(String []args){

         Ghostview ghostview = new Ghostview();
		 ghostview.printghostname();
		 ghostview.ghostScanner();
		 
		 Ghostcontroller ghostcontroller = new Ghostcontroller();
		 
		 ghostcontroller.printAge();

}
}