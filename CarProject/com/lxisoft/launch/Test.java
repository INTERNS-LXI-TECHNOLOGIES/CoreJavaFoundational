package com.lxisoft.launch;
import com.lxisoft.car.*;
import java.util.ArrayList;


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
        ArrayList<Rim> rims = new ArrayList<Rim>();

      // 
        
        for (int k = 0; k<4; k++){
            rims.add(new Rim(16+k, "type"+k));
            /*rims.get(k);
            rims.get(k).settype("type" + k);
            rims.get(k).setsize(16 + k);*/
        }
        /*rims.add(new Rim(16, "type16"));
        rims.add(new Rim(17, "type17"));
        rims.add(new Rim(18, "type18"));
        rims.add(new Rim(19, "type19"));*/

        car.setRim(rims);

        car.showDetails();                    
    }
}