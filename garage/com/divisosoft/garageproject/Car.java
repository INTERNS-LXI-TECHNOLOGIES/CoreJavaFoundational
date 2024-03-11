public class Car extends Vehicle{
private boolean isTaxi;

public void setIsTaxi(boolean isTaxi){
	this.isTaxi=isTaxi;
}
public boolean getIsTaxi(){
	return isTaxi;

}
 public boolean carDetails() {
	 
     int x = (int)(Math.random()*5);   
        if (x % 2 == 0) {
         isTaxi=true;
        } else if(x % 2 == 1) {
        isTaxi=false;
        }
		return isTaxi;
    }
	
public String toString(){
	return "\n"+isTaxi;
}


}