package com.lxisoft.hotel;

import com.lxisoft.menu.FoodItem;
import java.util.*;
public class Menu {
//int  quantityOfFoodItem;
Scanner input= new Scanner(System.in);
ArrayList<FoodItem> list=new ArrayList<FoodItem>();

public void showMenuDetail(){
list.add(new FoodItem("Biriyani",100));
list.add(new FoodItem("Porota",10));
list.add(new FoodItem("dosa",20));
}
/* list.get(0).setfoodName("Biriyani");
list.get(0).setfoodPrice(100);
list.add(new FoodItems());
list.get(1).setfoodName("porota");
list.get(1).setfoodPrice(10);
list.add(new FoodItems());
list.get(2).setfoodName("Dosa");
list.get(2).setfoodPrice(20);*/
public void printFoodMenu(){
System.out.println("FoodItems and It's Prices");
int arrayNumber;
int arrayListSize=list.size();
for( arrayNumber=0;arrayNumber<arrayListSize;arrayNumber++){
System.out.println(1+arrayNumber +".    "+ list.get(arrayNumber).getfoodName() +" "+ list.get(arrayNumber).getfoodPrice()+"\n");
//System.out.println(i);

 
}

}
public ArrayList<FoodItem> getArraylist(){
  return list;
}
//use of polymorphism method over loading
/*public void printFoodMenu(int numberToRemoveUnwantedArraylist){
list.add(new FoodItem("Biriyani",100));
list.add(new FoodItem("Porota",10));
list.add(new FoodItem("dosa",20));
/*list.add(new FoodItems());
list.get(0).setfoodName("Biriyani");
list.get(0).setfoodPrice(100);
list.add(new FoodItems());
list.get(1).setfoodName("porota");
list.get(1).setfoodPrice(10);
list.add(new FoodItems());
list.get(2).setfoodName("Dosa");
list.get(2).setfoodPrice(20);*/
////
//System.out.println("FoodItems and It's Prices");
//int arrayNumber;
//int arrayListSize=list.size();
//for( arrayNumber=0;arrayNumber<arrayListSize-numberToRemoveUnwantedArraylist;arrayNumber++){
//System.out.println(1+arrayNumber +".    "+ list.get(arrayNumber).getfoodName() +" "+ list.get(arrayNumber).getfoodPrice()+"\n");
//System.out.println(i);

 
//}

//


//public int j=list.size();

  
  

     
   }