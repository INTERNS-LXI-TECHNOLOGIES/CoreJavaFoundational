package com.lxisoft.hungergame.forest;

public class Food{
	private String foodName;
	private String foodImg;
	private int hungerlevel;

	
public Food(String foodName,String foodImg,int hungerlevel){
	this.foodName=foodName;
	 this.foodImg=foodImg;
	 this.hungerlevel=hungerlevel;
 }
 public void setHungerlevel(int hungerlevel){
	this.hungerlevel=hungerlevel;
 }
 public int getHungerlevel(){
	return hungerlevel;
 }
 public String getFoodImg(){
	 return foodImg;
 }
 public void setFoodImg(String foodImg){
	 this.foodImg=foodImg;
 }
}