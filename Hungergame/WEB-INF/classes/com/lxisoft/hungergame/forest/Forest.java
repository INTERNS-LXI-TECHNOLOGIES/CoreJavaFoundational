package com.lxisoft.hungergame.forest;
import java.util.ArrayList;
import java.util.List;

public class Forest{
	  
	   
	   private Cell[][] cell = new Cell[10][10];
	   private List<Player> gamers=new ArrayList<Player>();
	   private List<Player> winners=new ArrayList<Player>();
	   private Player activePlayer;
	   private Dice d=new Dice();
	   
	  private int totalPlayers;
	  private int activePlayerCount=0;
	   
	   
	   public void setCell(Cell[][] cell){
		this.cell=cell;
	   }
	   
	   public Cell[][] getCell(){
		   return cell;
	   }
	   

	   public void setGamers(List<Player> gamers){
		this.gamers=gamers;
	   }
       public List<Player> getGamers(){
		return gamers;
	   }
        public void setWinners(List<Player> winners){
			this.winners=winners;
		}
       public List<Player> getWinners(){
		return winners;
	   }

	   public void setActivePlayer(Player activePlayer){
		   this.activePlayer=activePlayer;
	   }
	   public Player getActivePlayer(){
		   return activePlayer;
		   
	   }
	   
	   public void setD(Dice d ){
		   this.d=d;
	   }
	   public Dice getD(){
		   return d;
	   }
	   public void setTotalPlayers(int totalPlayers){
		this.totalPlayers=totalPlayers;
	   }
	   public int getTotalPlayers(){
		return totalPlayers;
	   }
	   public void setActivePlayerCount(int activePlayerCount){
		this.activePlayerCount=activePlayerCount;
	   }
	   public int getActivePlayerCount(){
		return activePlayerCount;
	   }
	   
	   /*public void intialize(){
		  cellImage();
		  createFoods();
		  createHunters();
	   }*/

	  public void cellImage(){
		int imageCount=1;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				getCell()[i][j]=new Cell("/Hungergame/images/"+imageCount+".png",imageCount);
				//imageCoun++;
			}
			
		}
	  }

	public void createFoods(){
		for(int i=0;i<10;i++){
			Food apple=new Food("apple","/Hungergame/images/apple.jpg",10);
			int a=(int)(Math.random()*9);
			int b=(int)(Math.random()*9);
			cell[a][b].getFoods().add(apple);

		}
	
		for(int j=0;j<10;j++){
			Food chicken=new Food("chicken","/Hungergame/images/chicken.png",15);
			int c=(int)(Math.random()*9);
			int d=(int)(Math.random()*9);
			cell[c][d].getFoods().add(chicken);

		}
	
		for(int k=0;k<10;k++){
			Food strawberry=new Food("strawberry","/Hungergame/images/strawberry.jpg",10);
			int a=(int)(Math.random()*9);
			int b=(int)(Math.random()*9);
			cell[a][b].getFoods().add(strawberry);

		}
	}

	public void createHunters(){
		for(int i=0;i<10;i++){
			Hunter hunter1=new Hunter("hunter1","/Hungergame/images/hunter.png",10);
			int a=(int)(Math.random()*9);
			int b=(int)(Math.random()*9);
			cell[a][b].getHunters().add(hunter1);
		}
		for(int j=0;j<10;j++){
            Hunter hunter2=new Hunter("hunter2","/Hungergame/images/hunter2.png",5);
			int c=(int)(Math.random()*9);
			int d=(int)(Math.random()*9);
			cell[c][d].getHunters().add(hunter2);
		}

	}
		  
public boolean gameloop(){
	
	
	int result=activePlayer.rolldice( d);
	int oldcellposition=activePlayer.getCellposition();
	int currentCellCount = activePlayer.getCellposition()+result;
    if(currentCellCount>100){
		activePlayer=getGamers().get((activePlayerCount++)% getGamers().size());
		return true;
	}
	
if(activePlayer.getIsActive() ){
		
		activePlayer.setCellposition(activePlayer.getCellposition()+result);
		int i=(int)(activePlayer.getCellposition()-1)/10;
		int j=(activePlayer.getCellposition()-1)%10;
		
		int a=(oldcellposition -1)/10;
		int b=(oldcellposition-1)%10;
		

		if(currentCellCount<=100){

			activePlayer.setHungerlevel(activePlayer.getHungerlevel()+result);
			getCell()[a][b].getPlayers().remove(activePlayer);
		
		if(currentCellCount==100){
			
			getWinners().add(activePlayer);
			getGamers().remove(activePlayer);
			cell[a][b].getPlayers().remove(activePlayer);
			activePlayer=getGamers().get((activePlayerCount++) % getGamers().size());
			
			return true;
		}


		boolean survived=cell[i][j].processPlayer(activePlayer);
		if(survived){
			if(result!=6){
			activePlayer=gamers.get((activePlayerCount++) % getGamers().size()); //set the next player
			return true;
			}
			else{
				return true;
			}
		}
	}
		else{
			activePlayer.setCellposition(0);
			activePlayer.setIsActive(false);
			activePlayer.setHungerlevel(0);
			activePlayer=gamers.get((activePlayerCount++)% getGamers().size());
			return false;
		}


	    
	}
else{
	if(result==1){
			getCell()[0][0].getPlayers().add(activePlayer);
			activePlayer.setIsActive(true);
			activePlayer.setCellposition(1);
			activePlayer.setHungerlevel(0);
			activePlayer=gamers.get((activePlayerCount++)% getGamers().size());
			return true;
			
	    }
	}
	activePlayer=gamers.get((activePlayerCount++)% getGamers().size());
	return true;
 
	  


}
}



 