package com.lxisoft.moviescript;

import com.lxisoft.cast.*;


public class Movie {
   private String name;
   private String genere;
   private int year;
   private String director;
   private String producer;
    
  // public void setupMovie() {
      public String getName(){
          return name;
      }
      public void setName(String name){  
        this.name=name;  
        }

        public String getGenere(){
            return genere;
        }

        public void setGenere(String genere){  
            this.genere=genere;  
            }

            public int getYear(){
                return year;
            } 

            public void setYear(int year){  
                this.year=year;  
                }
        
                public String getDirector(){
                    return director;
                } 

                public void setDirector(String director){  
                    this.director=director;  
                    }
        
                    public String getProducer(){
                        return producer;
                    } 

                    public void setProducer(String producer){  
                        this.producer=producer;  
                        }

      /* this.name= "THE FAULT IN OUR STARS";
       this.genere="Romance - Drama";
       this.year= 2014;
       this.director="Josh Boone";
       this.producer= "Marty Bowen and Wyck Godfrey";

   }*/
    
   public void playMovie () {

      
    System.out.println("\t\t          -- Movie Details -- ");


       System.out.println("\t\t+----------------------------------+"+"\n");
    
       System.out.println("\t\t\t"   +name);
       System.out.println("\t\t      +------------------------+"+"\n");

       System.out.println("\t\tGnere:" +genere);
       System.out.println("\t\tYear Of Release:" +year);
       System.out.println("\t\tDirector:" +director);
       System.out.println("\t\tProducers:" +producer);

       System.out.println("\t\t+----------------------------------+");

       System.out.println();

       System.out.println("\t\t         -- Cast Details --");

       System.out.println("\t\t+----------------------------------+"+"\n");

   
     	 Hero hero = new Hero();
         hero.setName (" Ansel Elgort");
         hero.setCharacterName (" Augustus Waters");
         hero.showDetails();

         
         System.out.println("\t\t+----------------------------------+"+"\n");

        Heroine heroine = new Heroine();
        heroine.setName  (" Shailene Woodley");
        heroine.setCharacterName ("Hazel Graze Lancaster");
        heroine.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian1 = new Comedian();
        comedian1.setName (" Jennifer Aniston ");
        comedian1.setCharacterName (" Rachel Green");
        comedian1.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian2 = new Comedian();
        comedian2.setName (" Courteney Cox ");
        comedian2.setCharacterName( " Monica ");
        comedian2.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian3 = new Comedian();
        comedian3.setName (" Matthew Perry ");
        comedian3.setCharacterName (" Chandler ");
        comedian3.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian4 = new Comedian();
        comedian4.setName (" Matt LeBlanc ");
        comedian4.setCharacterName (" Jeoy ");
        comedian4.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        /*public Actor passActor(Actor...passName){

            return passName;
        }*/

        Script script = new Script();

        script.actor[0] = hero.getCharacterName();
        script.actor[1]= heroine.getCharacterName();
        script.actor[2]= comedian1.getCharacterName();
        script.actor[3]= comedian2.getCharacterName();
        script.actor[4]= comedian3.getCharacterName();
        script.actor[5]= comedian4.getCharacterName();
        
        script.setupMovie();
        script.playMovie();

   }
  /* public void  printName(Hero h1) {
    
    h1.getCharacterName();

}*/

}

