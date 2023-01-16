public class ClassRoom {

	private int seats;
	private String standard;
	private Student[] students;
	private Teacher classTeacher;

	ClassRoom(int seats, String standard, String division, Student[] students, Teacher classTeacher) {
		this.seats = seats;
		this.standard = standard;
		this.students = students;
		this.classTeacher = classTeacher;
	}

	public void printDetails() {
		System.out.println(standard + "\n");
		System.out.println("Number of seats: " + seats);
		System.out.println("\nClass Teacher\n----");
		classTeacher.printDetails();
		System.out.println("\nStudents\n-----------------------");
		for (int i = 0; i < students.length; i++) {
			students[i].printDetails();
		}
		System.out.println();
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Teacher getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}
}