public class TD {
	        public static void main(String[] args) {
		School school = new School();
		school.setClasses(new ClassRoom[3]);
		
		for (int i=1; i<4; i++) {
			Student[] students = new Student[3];
			for (int j=1; j<=students.length; j++) {
				students[j - 1] = new Student("Student " +j,j);
		}

		
		Teacher classTeacher = new Teacher("Teacher " + i, "Subject " +i, "8975864367" +i);
		school.getClasses()[i - 1] = new ClassRoom(30, "Class " + i, "A", students, classTeacher);
		}
		school.inputDetails();
		school.printDetails();

	}
}