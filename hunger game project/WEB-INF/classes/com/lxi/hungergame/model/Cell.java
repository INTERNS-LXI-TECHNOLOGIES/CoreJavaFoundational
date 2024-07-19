package com.lxi.hungergame.model;
import java.util.ArrayList;
import java.util.List;

public class Cell{

   public Cell(String bgImage, int cellCount) {
        this.bgImage = bgImage;
        this.cellCount = cellCount;
    }

   private String bgImage;
   private  int cellCount;
   private List<Player> players = new ArrayList<>();
   private List<Food> foods = new ArrayList<>();
   private List<Hunter> hunters = new ArrayList<>();

    public String getBgImage() {
        return bgImage;
    }
    public void setBgImage(String bgImage) {
        this.bgImage = bgImage;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public List<Hunter> getHunters() {
        return hunters;
    }

    public boolean processPlayer(Player p ){
        if(!foods.isEmpty()){
            for(Food food : foods){
                p.setHungerLevel(p.getHungerLevel()+food.getHungerLevel());
            }

        }
        
        for(Hunter h : hunters){
            if(p.getHungerLevel() > h.getHungerLevel()){
            return false;
            }
            else{
                p.setHungerLevel(p.getHungerLevel()+1);
            }
        }

        if(p.getHungerLevel() >= 20){
            return  false;
        }
        else{
            this.getPlayers().add(p);
            return true;
        }
        
    }










}
