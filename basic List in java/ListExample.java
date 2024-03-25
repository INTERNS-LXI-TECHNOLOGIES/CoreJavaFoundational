import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> fruits = new ArrayList<>();
  
       //Adding elements to the list 
	   
	   fruits.add("Apple");
	   fruits.add("Orange");
	   fruits.add("Banana");
	   fruits.add("Mango");
	   
	  
	 
	   
	   
	   //Accessing elements by  using index
	   
	   System.out.println("first fruit is\t:"+fruits.get(0)); 
	   System.out.println("second fruit is\t:"+fruits.get(1));
	   System.out.println("Third fruit is\t:"+fruits.get(2));
	   System.out.println("four fruit is\t:"+fruits.get(3));
	   
	    // Iterating over the list
        System.out.println("Fruits:");	
		for(String fruit:fruits){
			
			System.out.println(fruit);
		}
  
       
	    fruits.remove("Banana");
        System.out.println("After removing Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
