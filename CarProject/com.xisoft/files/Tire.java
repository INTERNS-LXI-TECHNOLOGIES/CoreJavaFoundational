
public class Tire
{    
    private String position;
    private int size;
    
    
        public String getPosition()
        {
            return position;
        }

        public void setPosition(String Position)
        {
            this.position=Position;
        }

        
        public int getSize()
        {
            return size;
        }
        
        public void setSize(int Size)
        {
            this.size=Size;
        }
      
    
        

        void printDetails()
        {   
                                
                System.out.println("Tyre Position : "+getPosition()+" , "+"Tyre Size : "+getSize() );
                System.out.println("");  
                
                      
        }
}