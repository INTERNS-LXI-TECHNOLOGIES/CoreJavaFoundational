package com.lxi.hungergame.model ;
import java.util.ArrayList;
import java.util.List;

public class Cell{
private String bgimage;
private ArrayList<Player> players = new ArrayList<Player>();
private ArrayList<Food> foods = new ArrayList<Food>();
private ArrayList<Hunter> hunters = new ArrayList<Hunter>();
private int cellcount;

public Cell(String bgimage, int cellcount) {
    this.bgimage = bgimage;
    this.cellcount = cellcount;
}

public String getBgimage() {
        return bgimage;
    }

    public void setBgimage(String bgimage) {
        this.bgimage = bgimage;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public ArrayList<Hunter> getHunters() {
        return hunters;
    }

    public void setHunters(ArrayList<Hunter> hunters) {
        this.hunters = hunters;
    }

    public int getCellcount() {
        return cellcount;
    }

    public void setCellcount(int cellcount) {
        this.cellcount = cellcount;
    }

   public boolean processPlayer(Player p){
   
   //Initilalize hungerlevel of player based on foods
        for(Food f: foods){
            p.setHungerlevel(p.getHungerlevel()+f.getHungerlevel());
        }

        //Comparing players hunger level with hunters
        for(Hunter h: hunters){
            // player's hunger level is greater than the hunter's, the method returns false immediately, indicating the player cannot be processed further
            if(p.getHungerlevel() > h.getHungerlevel()){
                return false;
            }
            else{
                p.setHungerlevel(p.getHungerlevel()+1);
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
