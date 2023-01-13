public class Test{

    public static void main(String[] args){

    
        Car car1 = new Car("ford", "fusion", "black");
       
        car1.tire1 = new Tire("goodyear", 16);
       
        car1.tire1.rim1 = new Rim("alloy","dark brown");
    
        
        car1.showdetails();
     
    }

    
}
