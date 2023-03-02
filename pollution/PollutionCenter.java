package pollution;

import java.util.Arrays;

public class PollutionCenter {

    Vehicle [] vehicles = new Vehicle[10];

    @Override
    public String toString() {
        String details = "" ;

        for (Vehicle vehicle : vehicles) {

            //if(vehicle.getBrandName()!=null)

             details = details+vehicle;
             
        }
        return details;
    }

    
    
}
