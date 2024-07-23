package com.lxi.hungergame.forest;
import com.lxi.hungergame.player.Player;
import com.lxi.hungergame.cell.Cell;
import com.lxi.hungergame.food.Food;
import com.lxi.hungergame.dice.Dice ;
import com.lxi.hungergame.hunder.Hunder;


import java.util.List;
import java.util.ArrayList;

public class Forest{
	
	private Cell[][] cell=new Cell[10][10];
	private  List<Player> players= new ArrayList<>();
	private  List<Food> foods = new ArrayList<>();
	private List<Player> winners = new ArrayList<>();

private Dice dice = new Dice();
private int activePlayercount=0;
private int totalcount=players.size();
private Player activePlayer;


 
	public void SetCell(Cell[][] cell) {
		 this.cell=cell;
		}
   public Cell[][] getCell(){
		return cell;
	}
	public List<Player> getWinners() {
		return winners;
	}

	public void setWinners(List<Player> winners) {
		this.winners = winners;
	}

	public List<Player> getPlayers() {
        return players;
    }

	public void setPlayers(List<Player> players) {
        this.players = players;
    }

    	
	public int getActivePlayercount() {
        return activePlayercount;
    }

	public void setActivePlayercount(int activePlayerCount) {
        this.activePlayercount =activePlayerCount;
    }
	public int getTotalcount() {
        return totalcount;
    }

	public void setTotalcount(int totalcount) {
        this.totalcount =totalcount;
    }	
	public Dice getDice() {
        return dice;
    }

	public void setDice(Dice dice) {
        this.dice = dice;
    }		
	public Player getActivePlayer() {
        return activePlayer;
    }

    
    public void setActivePlayer(Player activePlayer) {
        this.activePlayer = activePlayer;
    }			
	

public List<Food> getFoods(){
return foods;}
public void setFoods(List<Food> foods){
	this.foods=foods;
}




public	void initilize(){
	this.arrayspace();
	this.fooditem();
	this.hunderitem();
	
}

	public void arrayspace(){
	int count=1;
		for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
				cell[i][j]=new Cell();
				cell[i][j].SetBgimg("/hungergame/images/1.jpg");
				//count--;
			}
		}
	}

  public void fooditem(){
		for(int i=0;i<=15;i++){
			Food f1=new Food("/hungergame/images/watermelon.jpg","watermelon",10);
			int a=(int)(Math.random()*9);
			int b=(int)(Math.random()*9);
			cell[a][b].getFoods().add(f1);
		}
		
	
for(int j=0;j<=15;j++){
	Food f2=new  Food("/hungergame/images/apple.jpg","apple",12);
	int c=(int)(Math.random()*9);
	int d=(int)(Math.random()*9);
	cell[c][d].getFoods().add(f2);
}	
for(int k=0;k<=15;k++){
	Food f3=new Food("/hungergame/images/orange.jpg","orange",16);
	int e=(int)(Math.random()*9);
	int f=(int)(Math.random()*9);
	cell[e][f].getFoods().add(f3);
}	
	
  }

public void hunderitem(){
for(int i=0;i<=10;i++){
	Hunder h1=new Hunder("/hungergame/images/hunder.jpg","hunder",19);
	int a=(int)(Math.random()*9);
	int b=(int)(Math.random()*9);
	cell[a][b].getHunder().add(h1);
}
for(int i=0;i<=10;i++){
	Hunder h2=new Hunder ("/hungergame/images/hunder.jpg","hunder",17);
	int c=(int)(Math.random()*9);
	int d=(int)(Math.random()*9);
	cell[c][d].getHunder().add(h2);
}
for(int i=0;i<=10;i++){
	Hunder h3=new Hunder("/hungergame/images/hunder.jpg","hunder",16);
	int e=(int)(Math.random()*9);
	int f=(int)(Math.random()*9);
	cell[e][f].getHunder().add(h3);
}

}

public boolean gameLoop() {
    int result = activePlayer.rolldices(dice);
    int oldCount = activePlayer.getCellposition();
    int newCellCount = oldCount + result;

    if (newCellCount > 100) {
        activePlayer = getPlayers().get((activePlayercount++) % totalcount);
        return true;
    }

    if (activePlayer.getIsactive()) {
        activePlayer.setCellposition(activePlayer.getCellposition()+result);
        int i = (int)(activePlayer.getCellposition()-1) / 10;
        int j = (activePlayer.getCellposition()-1)  % 10;
        int a = (oldCount - 1) / 10;
        int b = (oldCount - 1) % 10;
        
        cell[a][b].getGamers().remove(activePlayer);

       

            if (newCellCount == 100) {
                getWinners().add(activePlayer);
                getPlayers().remove(activePlayer);
                activePlayer = getPlayers().get((activePlayercount++) % totalcount);
                return true;
            }

            boolean x = cell[i][j].processPlayer(activePlayer);
            if (x) {
                if (result != 6) {
                    activePlayer = getPlayers().get((activePlayercount++) % totalcount); // Set the next player
                    return true;
                } else {
                    return true;
                }
            } else {
                activePlayer.setCellposition(0);
                activePlayer.setHungerlevel(0);
                activePlayer.setIsactive(false);
                activePlayer = getPlayers().get((activePlayercount++) % totalcount);
                return true;
            }
        
    } else {
        if (result == 1) {
            getCell()[0][0].getGamers().add(activePlayer);
            activePlayer.setIsactive(true);
            activePlayer.setCellposition(1);
            activePlayer = getPlayers().get((activePlayercount++) % totalcount);
            return true;
        }
    }

    activePlayer = getPlayers().get((activePlayercount++) % totalcount);
    return true;
}

}
	

	
	
	


 
  

   
   
   
   