package com.lxisoft.hungerGame.model;
import java.util.ArrayList;
import java.util.List;

public class Cell {
	
private String bgImage;
private int cellCount;
private List<Players> players= new ArrayList<>();
private List<Foods> foods = new ArrayList<>();
private List<Hunter> hunter = new ArrayList<>();

public Cell(){
}

public Cell(String bgImage, int cellCount){
	this.bgImage = bgImage; 
	this.cellCount = cellCount;
	}


        public void setBgImage(String bgImage) {
            this.bgImage = bgImage;
        }
        public String getBgImage() {
            return bgImage;
        }

        public void setCellCount(int cellCount) {
            this.cellCount = cellCount;
        }
        public int getCellCount() {
            return cellCount;
        }
        
        public void setPlayers(List<Players> players) {
            this.players = players;
        }
        public List<Players> getPlayers() {
            return players;
        }
        
        public void setFood(List<Foods> foods) {
            this.foods = foods;
        }
        public List<Foods> getFoods() {
            return foods;
        }
        
        public void setHunter(List<Hunter> hunter) {
            this.hunter = hunter;
        }
        public List<Hunter> getHunter() {
            return hunter;
        }
	
	
public boolean processPlayer(Players p){

    if(!foods.isEmpty()){

	for(Foods f : foods){
        	p.setPlayerHungerLevel(p.getPlayerHungerLevel()+f.getFoodHungerLevel()); 
        }
    }
	for(Hunter h : hunter){
			
	    if(p.getPlayerHungerLevel() > h.getHunterHungerLevel()){
			return false;
		}
        else{
            p.setPlayerHungerLevel(p.getPlayerHungerLevel()+1);
        }
		}
        if(p.getPlayerHungerLevel()>20){
            return  false;
        }
        else{
            this.players.add(p);
            return true;
		}
    }

}

