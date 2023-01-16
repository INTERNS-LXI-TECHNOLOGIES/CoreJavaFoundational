public class Car 
{

    private String name;                   
    private String color;
    
    Tire[] tires;
    Rim[] rims;             
    
        //variables settings

        
        public String getName()
        {
            return name;
        }
        
        public void setName(String Name)
        {
            this.name=Name;
        }        

        public String getColor()
        {
            return color;
        }
        
        public void setColor(String Color)
        {
            this.color=Color;
        }

       
        //setter and getter in Tyre tyres
        
        public Tire[] getTire()
        {
            return tires;
        } 

        public void setTire(Tire[] Tire)
        {
            this.tires=Tire;
        }    

        public Rim[] getrim()
        {
            return rims;
        } 
        //rim set and get
        public void setrim(Rim[] rim)
        {
            this.rims=rim;
        }    
    
        

    public void showDetails()
    {               
     

        System.out.print("Car Name : "+getName()+"     "+"Color : "+getColor()+"\n");
        System.out.println("");
        
        System.out.println("\t\t  Tire  ");    
        System.out.println("");
    
        for(int j = 0;j < 4;j++)
        {
            tires[j].printDetails();        
        }                                        
        System.out.println("\t\t rims types and sizes: ");     
        System.out.println("");
                for(int k = 0;k < 4;k++) {
                    rims[k].printdetails();        
                }                                                        
    }
}