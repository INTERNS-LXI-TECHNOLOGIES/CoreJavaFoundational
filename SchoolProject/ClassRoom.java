import java.util.ArrayList;

public class ClassRoom {

	int seats;
	int standard;
	Student student1;
	Teacher teacher1;
	

	public ClassRoom(int seats, int standard){
		this.seats = seats;
		this.standard = standard;
	}
	
	public ClassRoom() {
	}

	public void printdetails(){
      System.out.println("seats: "+ seats + " standard " + standard );
	student1.printDetails();
	teacher1.printDetails();
	}
	
	
}