import java.util.ArrayList;
import com.lxisoft.tDetails.*;
import com.lxisoft.audio.*;
import com.lxisoft.car.*;

public class Tdd{
    public static void main(String[] args){
        Car car = new Car("NISSAN","Patrol","Black","India");
        car.setCompany("NISSAN");
        car.setModel("Patrol");
        car.setColor("Black");
        car.setManufacturer("India");
        
        AudioSystem audio1 = new AudioSystem("JBL",4);
        car.setAudioSystem(audio1);
        
        ArrayList<Tire> tyres = new ArrayList<>();
        Tire t1 =new  Tire("MRF","zapper",15,"front right");
        Tire t2 =new  Tire("BRIDGESTONE","ULTRAGRIP",15,"front left");
        Tire t3 =new  Tire("CEAT","GRIPPER",25,"rear right");
        Tire t4 =new Tire("MICHELLiIN","NYLOGRIP",25,"rear left");
        
        tyres.add(t1);
        tyres.add(t2);
        tyres.add(t3);
        tyres.add(t4);
        
        car.setTyreDetails(tyres);
        car.startCar();
        car.playMusic();
        car.printTyreDetails();
        System.out.println(car);
    }
}

