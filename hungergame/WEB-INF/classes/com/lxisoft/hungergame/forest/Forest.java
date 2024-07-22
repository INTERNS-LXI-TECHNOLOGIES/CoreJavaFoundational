package com.lxisoft.hungergame.forest;
import java.util.ArrayList;
import java.util.List;
public class Forest {

    private Cell[][] cell = new Cell[10][10];
	private Dice dice =new Dice();
	private List<Player> gamers = new ArrayList<>();
	 
	private Player activePlayer;
	private  int activePlayerCount=0;
	private List<Player> winners = new ArrayList<>();
	

	public List<Player> getWinners() {
		return winners;
	}

	public void setWinners(List<Player> winners) {
		this.winners = winners;
	}

	
	public int getActivePlayerCount() {
		return activePlayerCount;
	}

	public void setActivePlayerCount(int activePlayerCount) {
		this.activePlayerCount = activePlayerCount;
	}

	

	public List<Player> getGamers() {
		return gamers;
	}

	public void setGamers(List<Player> gamers) {
		this.gamers = gamers;
	}

	
   public Cell[][] getCell() {
		return cell;
	}

	public void setCell(Cell[][] cell) {
		this.cell = cell;
	}

	public Player getActivePlayer() {
	return activePlayer;
}

public void setActivePlayer(Player activePlayer) {
	this.activePlayer = activePlayer;
}
	
	
	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
	

    
	public void creatingSpaceForArray() {
        int imageCount = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                getCell()[i][j] = new Cell("/hungergame/images/" + imageCount + ".jpg",imageCount);
                
                //imageCount--;
            }
        }
	
	}

    
	public void createFoods(){
		for (int i =0;i<10;i++){
		Food food1=new Food("apple","/hungergame/images/F1.jpg",10);
		int a=(int) (Math.random()*10);
		int b=(int) (Math.random()*10);
		this.cell[a][b].getFoods().add(food1);
		
	}
	
	for(int j =0;j<10;j++)
	{
		Food food2 = new Food("orange","/hungergame/images/F2.jpg",10);
		int c = (int) (Math.random()*10);
		int d = (int) (Math.random()*10);
		
		cell[c][d].getFoods().add(food2);
	}
	
	
	for(int k =0;k<10;k++)
	{
	
		Food food3 = new Food("biriyani","/hungergame/images/F3.jpg",10);
		int e = (int) (Math.random()*10);
		int f = (int) (Math.random()*10);
		
		cell[e][f].getFoods().add(food3);
	}
}

public void createHunters() {
	for (int i = 0; i < 20; i++) {
		Hunter h1 = new Hunter("Hunter1","/hungergame/images/hunter1.jpg",  10); 
		int a = (int) (Math.random() * 10); 
		int b = (int) (Math.random() * 10); 

		cell[a][b].getHunters().add(h1);
	}

	for (int j = 0; j < 10; j++) {
		Hunter h2 = new Hunter("Hunter2","/hungergame/images/hunter2.jpg",  15);
		int c = (int) (Math.random() * 10);
		int d = (int) (Math.random() * 10);

		cell[c][d].getHunters().add(h2);
	}

	for (int k = 0; k < 10; k++) {
		Hunter h3 = new Hunter("Hunter 3","/hungergame/images/hunter3.jpg",  10);
		int e = (int) (Math.random() * 10);
		int f = (int) (Math.random() * 10);

		cell[e][f].getHunters().add(h3);
	}
}

public boolean gameLoop(){
	
	int result = activePlayer.rollDice(dice);
	int oldCellCount=activePlayer.getCellcount();
	int newCellCount=activePlayer.getCellcount()+ result;
	if(newCellCount>100){

		activePlayer=getGamers().get((activePlayerCount++) % getGamers().size());
		
		return true;
	}
	   if(activePlayer.isActive()){
		    
			
		     activePlayer.setCellcount(activePlayer.getCellcount()+result);
		    int i=(int) (activePlayer.getCellcount()-1)/10;
		    int j=(activePlayer.getCellcount()-1)%10;
		    int a = (oldCellCount-1)/ 10;
            int b = (oldCellCount - 1) % 10;
            


			if(newCellCount<=100){

				activePlayer.setHungerlevel(activePlayer.getHungerlevel()+result);
				getCell()[a][b].getPlayers().remove(activePlayer);
            
			if(newCellCount==100){
				
				getWinners().add(activePlayer);
                getGamers().remove(activePlayer);
                cell[a][b].getPlayers().remove(activePlayer);
                activePlayer=getGamers().get((activePlayerCount++) % getGamers().size());
                
                return true;
			}


		      boolean survived=	getCell()[i][j].processPlayer(activePlayer);
			     if(survived){
                      if(result!=6){

			               
                           activePlayer = gamers.get((activePlayerCount ++) % getGamers().size());
					       return true;
				           }
						   else{
							return true;
						   }
						}
                 else{
					activePlayer.setCellcount(0);
					activePlayer.setActive(false);
					activePlayer.setHungerlevel(0);
                    activePlayer = gamers.get((activePlayerCount ++) % getGamers().size());
					return false;
				 }
		 }
		}
        else{
            
			if(result==1){

				getCell()[0][0].getPlayers().add(activePlayer);
				activePlayer.setActive(true);
				activePlayer.setCellcount(1);
			    activePlayer.setHungerlevel(1);
				activePlayer = gamers.get((activePlayerCount ++) % getGamers().size());
			     return true;
			} 
			
		}  

		activePlayer = gamers.get((activePlayerCount ++) % getGamers().size());
		   
	   
	     return true;
}





   
}