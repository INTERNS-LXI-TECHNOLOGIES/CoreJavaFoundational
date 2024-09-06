package com.lxisoft.hungerGame.model;

import java.util.ArrayList;
import java.util.List;

public class Cells {
    private String bgImage;
    private int cellNumber;
    private List<Players> player = new ArrayList<>();
    private Hunter[] hunter = new Hunter[2];
    private Food[] food = new Food[2];
	private Dice dice;
    
    public Cells(String bgImage, int cellNumber) {
        this.bgImage = bgImage;
        this.cellNumber = cellNumber;
    }
	
    public String getBgImage() {
        return bgImage;
    }
    public void setBgImage(String bgImage) {
        this.bgImage = bgImage;
    }
    
    public List<Players> getPlayer() {
        return player;
    }
    public void setPlayer(List<Players> player) {
        this.player = player;
    }

    public Hunter[] getHunter() {
        return hunter;
    }
    public void setHunter(Hunter[] hunter) {
        this.hunter = hunter;
    }

    public Food[] getFood() {
        return food;
    }
    public void setFood(Food[] food) {
        this.food = food;
    }
	
	public boolean processPlayers(Players player){
        player.setHungerLevel(player.getHungerLevel()+1);

		//The active player consumes the food from this.
		for(Food f : food){
			//Here the hungerLevel of the player reduces on each time he consumes a food item.
			if ( f != null)
			player.setHungerLevel(player.getHungerLevel()-f.getHungerLevel());
		}
		
		//The active player fights with the player using the condition if he has more hungerlevel he will continue.
		for(Hunter h : hunter){
			//checking wheather player has more hungerlevel than the hunter.
			if ( h != null)
			if(player.getHungerLevel() > h.getHungerLevel()){
				return false;
			}
			else{
				//the player after winning the against the hunter his hungerlevel will increase to 1.
				player.setHungerLevel(player.getHungerLevel()+1);
			}
		}
		this.player.add(player);
        return true;
	}
}