import java.util.ArrayList;

public class School {
	private String sclName;
	private String address;

	private ArrayList<ClassRoom> classRooms = new ArrayList<ClassRoom>();



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

	public void addClassRoom(ClassRoom classroom){

	}

	public ArrayList<ClassRoom> getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(ArrayList<ClassRoom>  classRooms) {
		this.classRooms = classRooms;
	}

	public void inputDetails() {
		sclName = "Oxford University";
		address = "611 oxford street, london, ontario";
		
	}

	public void printDetails() {
		System.out.println("School Name: " + sclName + "\nSchool Address: " + address + "\n");
		for (int i = 0; i < classRooms.size(); i++) {
			classRooms.get(i).printDetails();
		}
	}
}