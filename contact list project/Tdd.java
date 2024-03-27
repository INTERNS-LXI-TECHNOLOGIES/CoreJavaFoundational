import java.util.ArrayList;

public class Tdd{
	public static void main(String[]args){

	File file=new File();
	file.setName("Contact Book");
	file.setYear(2024);
		
	System.out.println(file.getName());
	System.out.println(file.getYear());
	
	String result[]={"Ajith","Anas","Arjun","Avinash","Ajay","Akhil","Sai","Sarath"};
	long num []={987654321L,23456789L,234567789L,123456678L,343215679L,89064321L,56789021L,789665433L};
	
	ArrayList<Contact> contacts = new ArrayList<>();
	
	for (int i=0;i<=7;i++){
		Contact contact=new Contact();
		contact.setName(result[i]);
		contact.setNumber(num[i]);
		contacts.add(contact);
			
		//System.out.println(contact.getName());
		//System.out.println(contact.getNumber());
	}
	contacts.remove(3);
	
	System.out.println(contacts);
	
}
}