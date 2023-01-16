public class School {
	private String sclName;
	private String address;

	private ClassRoom classRooms[];

	public void inputDetails() {
		sclName = "Oxford University";
		address = "611 oxford street, london, ontario";
		
	}

	public void printDetails() {
		System.out.println("School Name: " + sclName + "\nSchool Address: " + address + "\n");
		for (int i = 0; i < classRooms.length; i++) {
			classRooms[i].printDetails();
		}
	}

	public String getName() {
		return sclName;
	}

	public void setName(String name) {
		this.sclName = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public ClassRoom[] getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(ClassRoom[] classRooms) {
		this.classRooms = classRooms;
	}
}