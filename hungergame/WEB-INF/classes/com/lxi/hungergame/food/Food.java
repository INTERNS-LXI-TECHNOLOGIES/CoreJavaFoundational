package com.lxi.hungergame.food;
public class Food{
private String foodimg;
private int foodpoints;
private int hungerlevel;
private String foodname;



public Food(String foodimg,String foodname,int hungerlevel) {
        this.foodimg = foodimg;
		this.foodname=foodname;
		this.hungerlevel=hungerlevel;
    }
	
public int getHungerlevel(){
	return hungerlevel;
}
public void Hungerlevel(int hungerlevel){
	this.hungerlevel=hungerlevel;
}

public int getFoodpoints(){
	return foodpoints;
}
public void setFoodpoints(){
	this.foodpoints=foodpoints;
}	
public String getFoodimg() {
        return foodimg;
    }
public void setFoodimg(String foodimg) {
        this.foodimg = foodimg;
    }
public String getFoodname() {
        return foodname;
    }
public void setFoodname(String foodname) {
        this.foodname = foodname;
    }	
	
 	
	
}