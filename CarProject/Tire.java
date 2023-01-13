public class Tire {

    String brand;
    int radious;
    Rim rim1 = new Rim("steel", "black");
    Rim rim2 = new Rim ("alluminium", "silver");

public Tire (String brand, int radious){

        this.brand = brand;
        this.radious = radious;
    }

 public void showdetails(){

    System.out.println("tire brand: " + brand + " tire radious: " + radious);
    rim1.showdetails();
    rim2.showdetails();
 }
    
}
