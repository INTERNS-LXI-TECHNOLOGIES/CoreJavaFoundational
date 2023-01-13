public class Car {

    String brand;
    String model;
    String color;
    Tire tire1;

    public Car (String brand, String model, String color){

        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public Car(){

    }

    public void showdetails(){
        System.out.println("brand: " + brand + " model: " + model + "color: " + color );
        tire1.showdetails();
        
    }
}
