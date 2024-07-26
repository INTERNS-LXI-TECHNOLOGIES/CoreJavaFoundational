package com.lxisoft.hungergame.forest;
import java.util.ArrayList;
import java.util.List;

public class Cell{
	

private List<Player> players=new ArrayList<Player>();
private List<Food> foods=new ArrayList<Food>();
private List<Hunter> hunters=new ArrayList<Hunter>();
private String bgimage;
private int cellCount;


public Cell(String bgimage, int cellCount) {
	this.bgimage = bgimage;
	this.cellCount = cellCount;
}

 
public void setBgimage(String bgimage){
	this.bgimage=bgimage;
}

public String getBgimage(){
	return bgimage;
}
public void setCellCount(int cellCount){
	this.cellCount=cellCount;
}

public int getCellCount(){
	return cellCount;
}
public void setPlayers(List<Player> players){
	this.players=players;
}
public List<Player> getPlayers(){
	return players;
}
public void setFoods(List<Food> foods){
	this.foods=foods;
}
public List<Food> getFoods(){
	return foods;
}
public void setHunters(List<Hunter> hunters){
	this.hunters=hunters;
}
public List<Hunter> getHunters(){
	return hunters;
}

public boolean processPlayer(Player p){
	for(Food f:foods){
		
		p.setHungerlevel(p.getHungerlevel()-f.getHungerlevel());
	}


    for(Hunter h:hunters){
		
	    if(h.getHungerlevel()<=p.getHungerlevel()){
		return false;
	     }
        else{
		p.setHungerlevel(p.getHungerlevel()+1);
		return true;
	    }
    }

if(p.getHungerlevel()>20){
	return false;
}
else{
	this.getPlayers().add(p);
	return true;
}
	
	
}
 
}