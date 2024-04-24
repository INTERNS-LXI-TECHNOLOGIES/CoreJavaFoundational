public class Tdd{
public static void main(String args[]){
	
	System.out.println("WELCOME PALAKKAD");
	
	Restaurant[] restaurant=new Restaurant[5];
	
	String name[]={"1.Malabar","2.Nehadi","3.arabian","4.km","5.rest"};
	for(int i=0,j=0;i<5;i++){
	restaurant[i]=new Restaurant();
	restaurant[i].setRestaurantname(name[j]);
	System.out.println(restaurant[i]);
	j++;
	}


}
}