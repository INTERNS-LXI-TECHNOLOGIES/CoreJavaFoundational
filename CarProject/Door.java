public class Door
{
    private String position;
    private String brand;
    private String length;
    private String color;
        
        public String getPosition()
        {
            return this.position;
        }

        public void setPosition(String Position)
        {
            this.position=Position;
        }

        public String getBrand()
        {
            return this.brand;
        }

        public void setBrand(String Brand)
        {
            this.brand=Brand;
        }

        public String getLength()
        {
            return this.length;
        }

        public void setLength(String Length)
        {
            this.length=Length;
        }  

        public String getColor()
        {
            return this.color;
        }

        public void setColor(String Color)
        {
            this.color=Color;
        }        

        void printDetails()
        {
            System.out.println("Door Position : "+getPosition()+" , "+"Door Brand  : "+getBrand()+" , "+"Door length : "+getLength()+" ,  "+"Door Color : "+getColor() );
            System.out.println(""); 
        }      
        
                                                                 
}
