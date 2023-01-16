public class Rim {
    
    String type;
    int size;


    public String gettype(){
        return type;
    }
    public String settype(String type){
       return this.type =type;
    }
    
    public int getsize(){
        return size;
    }
     
    public int setsize(int size){
        return this.size = size;
    }
    void printdetails(){

        System.out.println("type: " + gettype() + " size: " + getsize());
    }
}
