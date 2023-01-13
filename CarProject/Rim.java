public class Rim {
    
    String type;
    String colour;

    public Rim(String type, String colour){
        this.type= type;
        this.colour = colour;
    }
    
    public void showdetails(){

        System.out.println("type: " + type + " colour: " + colour);
    }
}
