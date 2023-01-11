public class ClassRoom {

	int seats;
	int standard;
	int studentsNumbers;
	String classTeacher;

	public ClassRoom(int seats, int standard, int studentsNumbers, String classTeacher){
		this.seats = seats;
		this.standard = standard;
		this.studentsNumbers = studentsNumbers;
		this.classTeacher = classTeacher;
	}
	public void printdetails(){
      System.out.println("seats: "+ seats + " standard " + standard + " students Number: " + studentsNumbers + "class teacher: " + classTeacher );
	}

}