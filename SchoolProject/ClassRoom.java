import java.util.ArrayList;

public class ClassRoom {

	private int seats;

	private ArrayList<Student> students;    //ArrayList<Student> student1;
	private Teacher classTeacher;

	ClassRoom(int seats, String string, ArrayList<Student> students, Teacher classTeacher) {
		this.seats = seats;
		this.students = students;
		this.classTeacher = classTeacher;
	}

	public void printDetails() {

		System.out.println("Number of seats: " + seats);
		System.out.println("\nClass Teacher\n----");
		classTeacher.printDetails();
		System.out.println("\nStudents\n-----------------------");
		System.out.println(students.size());
		for (int i = 0; i < students.size(); i++) {
			students.get(i).printDetails();
		}
		System.out.println();
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Teacher getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}
}