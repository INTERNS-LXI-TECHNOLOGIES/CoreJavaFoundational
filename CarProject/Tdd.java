import java.util.ArrayList;
import tDetails.TireDetails;
import audio.AudioSystem;
import car.Car;

public class Tdd{
    public static void main(String[] args){
        Car car = new Car("NISSAN","Patrol","Black","India");
        car.setCompany("NISSAN");
        car.setModel("Patrol");
        car.setColor("Black");
        car.setManufacturer("India");
        
        AudioSystem audio1 = new AudioSystem("JBL",4);
        car.setAudioSystem(audio1);
        
        ArrayList<TireDetails> tyreDetails = new ArrayList<>();
        TireDetails t1 =new  TireDetails("MRF","zapper",15,"front right");
        TireDetails t2 =new  TireDetails("BRIDGESTONE","ULTRAGRIP",15,"front left");
        TireDetails t3 =new  TireDetails("CEAT","GRIPPER",25,"rear right");
        TireDetails t4 =new TireDetails("MICHELLiIN","NYLOGRIP",25,"rear left");
        
        tyreDetails.add(t1);
        tyreDetails.add(t2);
        tyreDetails.add(t3);
        tyreDetails.add(t4);
        
        car.setTyreDetails(tyreDetails);
        car.startCar();
        car.playMusic();
        car.printTyreDetails();
        System.out.println(car.toString());
    }
}

