package com.divisosoft.comparable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Tdd
{  
  public static void main(String[] args) 
  {
        List<MyClass> myList = new ArrayList<>();
        myList.add(new MyClass(31));
        myList.add(new MyClass(14));
        myList.add(new MyClass(22));
		myList.add(new MyClass(10));
		myList.add(new MyClass(90));
		myList.add(new MyClass(42));

        // Sorting the list using Comparable
        Collections.sort(myList);

        myList.forEach(myClass -> System.out.println(myClass));   
   }
}