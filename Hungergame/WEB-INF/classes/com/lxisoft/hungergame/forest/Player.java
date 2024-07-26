package com.lxisoft.hungergame.forest;

public class Player{
 private String name;
 private String playerImg;
 private boolean isActive;
 private int cellposition=0;
 private int hungerlevel=0;
 private int result;

 
 
 public Player(String name,String playerImg){
	                                              
	                                                       //player constructor
	 this.name=name;
	 this.playerImg=playerImg;
	
 }

 public int getResult() {
	return result;
}
public void setResult(int result) {
	this.result = result;
}

 public void setName(String name){
	 this.name=name;
 }
 public String getName(){
	 return name;
 }
 
 public void setPlayerImg(String playerImg){
	 this.playerImg=playerImg;
 }
 public String getPlayerImg(){
	 return playerImg;
 }
 
 public void setIsActive(boolean isActive){
	 this.isActive=isActive;
 }
 public boolean getIsActive(){
	 return isActive;
 }
 public void setCellposition(int cellposition){
	 this.cellposition=cellposition;
 }
 public int getCellposition(){
	 return cellposition;
 }
 public void setHungerlevel(int hungerlevel){
	 this.hungerlevel=hungerlevel;
 }
 public int getHungerlevel(){
	return hungerlevel;
 }
 
 public int rolldice(Dice d){
  result=d.roll();
 return result;
 }
}
