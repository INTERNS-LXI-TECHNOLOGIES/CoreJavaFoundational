package com.lxisoft.script;
import java.io.*;
import java.util.*;

public class Scene2 implements ComedyScene
{
	
	
	public void comedyScene()
{
 try {
      File myObj = new File("D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\KarthiGanesh.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}	



}