package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class Fileoperation
{
	public String operation(String randdialogue)
	{
		String[] data=new String[10];
        String line = "";
       try{
	       	   String csvFile = "../version..2/com/lxisoft/movie/Dialogue.csv";
    	       BufferedReader br = new BufferedReader(new FileReader(csvFile));
    	       int i=0;
	           while ((line = br.readLine()) != null)
	           {

                 
    	           String[] datas= line.split(","); 
                   if(randdialogue.equals(datas[0]))
                   {
    	               data[i++]=datas[1];
                   }
	           }
           }
    		catch (FileNotFoundException e)
          	{
            	e.printStackTrace();
        	} 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
       // int randVar==(int)( Math.random()*data.length);
        int randVar=(int)(Math.random()*4);
        return data[randVar];      
	}
	public void writeIntoFile()
	{
        ArrayList<String>csvFile=new ArrayList<String>();
        csvFile.add("../version..2/com/lxisoft/movie/Hero.csv");
        csvFile.add("../version..2/com/lxisoft/movie/Comedian.csv");
        csvFile.add("../version..2/com/lxisoft/movie/Villain.csv");
        csvFile.add("../version..2/com/lxisoft/movie/Heroin.csv");        
        FileWriter fr = null;
        BufferedWriter br = null;

        Scanner scr=new Scanner(System.in);
		System.out.println("select the actor \n 1 : Hero \n 2 : Comedian \n 3 : Villain \n 4 : Heroin \n 5 : Dialogue");
        int number=scr.nextInt();

		System.out.println("No of dialogue");
		int noOfLines=scr.nextInt();

		String[] dialogues=new String[noOfLines+1];
		for (int i=0;i<noOfLines;i++) 
		{
			System.out.println("Dialogue :"+i);
			dialogues[i]=scr.next();
            System.out.println("");
		}


        try{
            for (int i=1;i<=5;i++) 
            {
                if(number==i)
                {
                    String[] datas= line.split(",");
                   fr = new FileWriter(datas(1),true); 
                }
                else
                {
                    break;
                }
            }
            
            br = new BufferedWriter(fr);
            
            for(int i = noOfLines,j=0; i>0; i--,j++)
            {
            	System.out.println(dialogues[j]);
                br.write(dialogues[j]+",");

            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            
        }
    }
}
}
