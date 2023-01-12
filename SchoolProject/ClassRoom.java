import java.util.ArrayList;

public class ClassRoom {

	int seats;
	int standard;
	Student student1;
	Teacher teacher1;

	public ClassRoom(int seats, int standard,Student student1, Teacher teacher1){
		this.seats = seats;
		this.standard = standard;
		this.student1 = student1;
		this.teacher1 = teacher1;
	}
	
	public void printdetails(){
      System.out.println("seats: "+ seats + " standard " + standard + " student" + student1 + "class teacher: " + teacher1 );
	}
	
	
}