public class Test{

    public static void main(String[] args){

    
        Car car1 = new Car ("ford", "fusion", "black");
        Car car2 = new Car();
        car2.brand = "toyota";
        car2.model = "camry";
        car2.color = "black";
        car1.tire1 = new Tire("goodyear", 16);
        car2.tire1 = new Tire("Mdx", 17);
        tire1.rim2 = new Rim("steel" , "black");

    
        
        car1.showdetails();
        car2.showdetails();
    }

    
}
