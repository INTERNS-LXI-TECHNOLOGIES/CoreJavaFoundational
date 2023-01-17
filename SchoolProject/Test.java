import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
	    School school = new School();
	    //school.setClassRooms(new ClassRoom[3]);
	    for (int i = 1; i < 4; i++) {
	    	ArrayList<Student> students = new ArrayList<Student>();// here is the container, where are the students?
	    	for (int j = 1; j <= 4; j++) {
	    		students.add(new Student("Student" +j, j)); // adding new students to that container
	    	}
		

	    	Teacher classTeacher = new Teacher("Teacher " + i, "Subject " + i);
	    	school.getClassRooms().add(new ClassRoom(20 + i, "Class " + i, students, classTeacher)) ; // when you need a new copy
			// of an object, you use the keyword "new", since it makes a memory space for that object
	    }
	    school.inputDetails();
	    school.printDetails();
	}}