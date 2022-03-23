package com.lxisoft.moviescript;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lxisoft.cast.*;


public class Movie {

    private List <Actor> actors = new ArrayList <Actor>();

   private String name;
   private String language;
   private Genere genere;

   int number;

   Director director = new Director();

   Script script = new Script();

   Scriptwriter scriptwriter = new Scriptwriter();

   enum Genere {
       ACTION,COMEDY,ROMANTIC
   } 


      public String getName(){
          return name;
      }
      public void setName(String name){  
        this.name = name;  
        }

        public String getLanguage(){
            return language;
        } 

        public void setLanguage(String language){  
            this.language = language;  
            }

        public Genere getGenere(){
            return genere;
        }

        public void setGenere(Genere genere){  
            this.genere = genere;  
            }

            public List <Actor> getActors() {

                return actors;
            }

            public void setActors(List <Actor> actors){

                this.actors = actors;
            }
        
                  
   public void showMovieDetails() {

    Scanner sc = new Scanner(System.in);
      
    System.out.println("\t\t          -- Movie Details -- ");


       System.out.println("\t\t+----------------------------------+"+"\n");

       System.out.println("\t\t Select The Movie Type");

		System.out.println("\t\t+----------------+");
		System.out.println("\n");

        System.out.println(" 1 = Action");
		System.out.println(" 2 = Romantic");
		System.out.println(" 3 = Comedy");
		
		System.out.println("\n");

        System.out.println("Enter The Number of Genere Type ");
       
          number= sc.nextInt();

           sc.nextLine();

           switch  (number)  {

case 1 :
        Genere genereAction = Genere.ACTION;
        genere=genereAction;

//genere = ("Action");
break;

case 2: 
        Genere genereComedy = Genere.COMEDY;
        genere = genereComedy;

//genere = ("Romantic");
break;

case 3:

        Genere genereRomantic = Genere.ROMANTIC;
        genere = genereRomantic;

//genere =("Comedy");
break;

           }

           System.out.println("Please Select The Movie Language");

           System.out.println(" 1 = ENGLISH ");
           System.out.println(" 2 = MALAYALAM ");
           System.out.println(" 3 = TAMIL ");

           System.out.println("ENGLISH ONLY AVAILABLE");

           System.out.println("Please Enter Number");

           number = sc.nextInt();
          sc.nextLine();

        if (number ==1)  {

            language = ("ENGLISH");

        }
		if(number != 1)   {

			System.out.println("You Are Selected Wrong Number");

		}

           System.out.println("Please Enter The  Movie Name ");

		name = sc.nextLine();

		System.out.println("\n");

		System.out.println("\t\tName :" + this.name); 
		System.out.println("\t\tGenere :"+ this.genere);
		System.out.println("\t\tLanguage :" +this.language);
	    System.out.println("\n");

     
       

       director.setName("JHON GREEN");  

       director.viewDirectorDetails();

       actors = director.castActors();

       scriptwriter.setupDialogue();

       script = scriptwriter.writeScript(actors);

       script.viewScenes();

    }}
