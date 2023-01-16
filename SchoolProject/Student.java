public class Student {
	private String name;
	private int stdNo;

	public Student(String name, int stdNo) {
		this.name = name;
		this.stdNo = stdNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getstdNo() {
		return stdNo;
	}

	public void setstdNo(int stdNo) {
		this.stdNo = stdNo;
	}
    public void printDetails() {
		System.out.println("Student Name: " + name + "\nstd Number: " + stdNo);
	}
}