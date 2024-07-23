package com.lxi.hungergame.cell;
import com.lxi.hungergame.player.Player;
import com.lxi.hungergame.food.Food;
import com.lxi.hungergame.hunder.Hunder;
import com.lxi.hungergame.dice.Dice;


import java.util.List;
import java.util.ArrayList;

public class Cell{
private  List<Player> gamers= new ArrayList<>();
private  List<Food> foods = new ArrayList<>();
private  List<Hunder> hunder = new ArrayList<>();	
private String bgimg;
private int cellcount;
private int playercount;

 

public void SetBgimg(String bgimg) {
	this.bgimg=bgimg;
}
public String getBgimg(){
	return bgimg;
}
public void SetCellcount(int cellcount) {
	this.cellcount=cellcount;
}
public int getCellcount(){
	return cellcount;
}
public List<Player> getGamers() {
        return gamers;
    }

public void setGamers(List<Player> gamers) {
        this.gamers = gamers;
    }
public List<Hunder> getHunder() {
        return hunder;
    }

public void setHunder(List<Hunder> hunder) {
        this.hunder = hunder;
    }	
public int getPlayercount() {
        return playercount;
    }

public void setPlayercount(int playercount) {
        this.playercount =playercount;
    }	

public List<Food> getFoods() {
        return foods;
    }
public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

 public boolean processPlayer(Player p){
	for(Food f:foods){
		
		p.setHungerlevel(p.getHungerlevel()-f.getHungerlevel());
	}


    for(Hunder h:hunder){
		
	    if(p.getHungerlevel()>h.getEffect()){
		return false;
	     }
        else{
		p.setHungerlevel(p.getHungerlevel()+1);
		return true;
	    }
    }

if(p.getHungerlevel()>50){
	return false;
}
else{
	this.getGamers().add(p);
	return true;
}
	
	
}
 
}

	
