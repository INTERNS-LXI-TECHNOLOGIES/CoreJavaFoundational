public class Tire {

    String brand;
    int radious;
    Rim rim1;
    
public Tire (String brand, int radious){

        this.brand = brand;
        this.radious = radious;
    }

 public void showdetails(){

    System.out.println("tire brand: " + brand + " tire radious: " + radious);
   rim1.showdetails();
 }
    
}
