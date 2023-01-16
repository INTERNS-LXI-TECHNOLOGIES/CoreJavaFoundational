package com.lxisoft.main;
import com.lxisoft.files.*;
public class Test
{
     public static void main(String args[])
    {   
        Car car = new Car();      
        car.setName("Volkswagen Passat");                
        car.setColor("Black");                        
        Tire tires[] = new Tire[4];                   
        car.setTire(tires);                                       
        for(int j = 0;j < 4;j++)
        {
            tires[j] = new Tire();
        
            tires[j].setPosition("Position " + j);
        
            tires[j].setSize(17 + j);       
        }        
        Rim rims[] = new Rim[4];

       car.setrim(rims);
        
        for (int k = 0; k<4; k++){
            rims[k]= new Rim();
            rims[k].settype("type" + k);
            rims[k].setsize(16 + k);
        }
        
        car.showDetails();                    
    }
}