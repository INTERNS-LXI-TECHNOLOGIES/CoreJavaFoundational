package com.LxiSoft.HotelDetails;
import java.util.*;
public class Drinks implements Food {
	String foodName;
	String foodType;
	int prize;
	public void setName(String food){
		this.foodName = food;
	}
	public String getName(){
		return foodName;
	}
	//public void setType(String type){
	//	this.foodType = type;
	//}
	//public String getType(){
	//	return foodType;
	//}
	public void setPrize(int prize){
		this.prize = prize;
	}
	public int getPrize(){
		return prize;
	}
}