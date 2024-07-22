package com.lxisoft.hungergame.forest;
import java.util.ArrayList;
import java.util.List;

public class Cell{

private String bgimage;
private List<Player> players = new ArrayList<>();
private List<Food>	foods =new ArrayList<>();
private List<Hunter> hunters=new ArrayList<>();
private int cellcount;
 
  public Cell(String bgimage, int cellcount) {
    this.bgimage = bgimage;
    this.cellcount = cellcount;
}
public int getCellcount() {
	return cellcount;
}
public void setCellcount(int cellcount) {
	this.cellcount = cellcount;
}
public List<Hunter> getHunters() {
	return hunters;
}
public void setHunters(List<Hunter> hunters) {
	this.hunters = hunters;
}
public List<Food> getFoods() {
	return foods;
}
public void setFoods(List<Food> foods) {
	this.foods = foods;
}

 public List<Player> getPlayers() {
	return players;
}
public void setPlayers(List<Player> players) {
	this.players = players;
}


public void setBGImage(String bgimage){
	this.bgimage=bgimage;
	}
public String getBGImage(){
	
	return bgimage;
    }

public boolean processPlayer(Player p){
   for(Food f: foods){
	     p.setHungerlevel(p.getHungerlevel()-f.getHungerlevel());



}

for(Hunter h:hunters)
{
	if(p.getHungerlevel()  > h.getHungerlevel()){
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

