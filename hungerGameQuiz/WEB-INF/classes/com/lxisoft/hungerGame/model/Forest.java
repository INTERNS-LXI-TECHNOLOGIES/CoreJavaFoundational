package com.lxisoft.hungerGame.model;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private Cells[][] cell = new Cells[10][10];
    private List<Players> player = new ArrayList<>();
	private List<LifeOrDeathMission> doOrDie = new ArrayList<>();
    private List<MissionPrep> missionPreps = new ArrayList<>();
	private Dice dice= new Dice();
	private Players activePlayer;
	private List<Players> winnersOfGame = new ArrayList<>();
	private int activePlayerCount=0;
		
	public Forest() {
		bgAddingMethod();
		combinedCreation();
	}
	
	public List<Players> getWinnersOfGame() {
		return winnersOfGame;
	}
	public void setWinnersOfGame(List<Players> winnersOfGame) {
		this.winnersOfGame = winnersOfGame;
	}
	public void setDice(Dice dice){
		this.dice = dice ;
	}
	public Dice getDice(){
		return this.dice ;
	}
	public Players getActivePlayer() {
        return activePlayer;
    }
    public void setActivePlayer(Players activePlayer) {
        this.activePlayer = activePlayer;
    }
	
    public Cells[][] getCell() {
        return cell;
    }
    public void setCell(Cells[][] cell) { 
        this.cell = cell;
    }

    public List<Players> getPlayer() {
        return player;
    }
    public void setPlayer(List<Players> player) {
        this.player = player;
    }
	
	public List<LifeOrDeathMission> getDoOrDie(){
        return doOrDie;
    }
    public void setDoOrDie(List<LifeOrDeathMission> doOrDie){
        this.doOrDie = doOrDie;
    }

    public List<MissionPrep> getMissionPreps(){
        return missionPreps;
    }
    public void setMissionPrep(List<MissionPrep> missionPreps){
        this.missionPreps = missionPreps;
    }

    public void bgAddingMethod() {
        int imagecount = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cell[i][j] = new Cells("/hungerGame/HungerGame-img/tableBG/" + imagecount + ".jpg",0);
                //imagecount++;
            }
        }
    }

	public void createHunter() {
		Hunter jackson = new Hunter("/hungerGame/HungerGame-img/icon/hunterICON1.jpeg", "Jackson", 20);
		Hunter mike = new Hunter("/hungerGame/HungerGame-img/icon/hunterICON2.jpeg", "Mike", 15);

		int i1, j1, i2, j2;

		do {
			i1 = (int) (Math.random() * 10);
			j1 = (int) (Math.random() * 10);
		}
		while ((i1 == 0 && j1 == 0) || (i1 == 9 && j1 == 9));
			
		do {
			i2 = (int) (Math.random() * 10);
			j2 = (int) (Math.random() * 10);
		}
		while ((i2 == 0 && j2 == 0) || (i2 == 9 && j2 == 9) || (i1 == i2 && j1 == j2));
			
		this.cell[i1][j1].getHunter()[0] = jackson; 
		this.cell[i2][j2].getHunter()[1] = mike;
			
		this.hunter[0] = jackson; 
		this.hunter[1] = mike;
	}


	public void createFood() {
		Food burger = new Food("/hungerGame/HungerGame-img/icon/foodImage1.jpg", "Burger", 15);
		Food pizza = new Food("/hungerGame/HungerGame-img/icon/foodImage2.jpeg", "Pizza", 10);

		int i1, j1, i2, j2;

		do {
			i1 = (int) (Math.random() * 10);
			j1 = (int) (Math.random() * 10);
		}
		while ((i1 == 9 && j1 == 9));
			
		do {
			i2 = (int) (Math.random() * 10);
			j2 = (int) (Math.random() * 10);
		}
		while ((i2 == 9 && j2 == 9) || (i1 == i2 && j1 == j2));

		this.cell[i1][j1].getFood()[0] = burger; 
		this.cell[i2][j2].getFood()[1] = pizza;

		this.food[0] = burger; 
		this.food[1] = pizza;
	}


    public void combinedCreation() {
        for (int i = 0; i < 30; i++) {
            createHunter();
            createFood();
        }
    }

    public boolean addPlayer(String playerName) {
        String[] icons = {
            "/hungerGame/HungerGame-img/icon/playerICONS/1.jpeg",
            "/hungerGame/HungerGame-img/icon/playerICONS/2.jpeg",
            "/hungerGame/HungerGame-img/icon/playerICONS/3.jpeg",
            "/hungerGame/HungerGame-img/icon/playerICONS/4.jpeg",
            "/hungerGame/HungerGame-img/icon/playerICONS/5.jpeg"
        };

        int PlayerImage = player.size() % icons.length;
        Players newPlayer = new Players(icons[PlayerImage],playerName);
        return player.add(newPlayer);
    }

	//here a boolen is given where it shows a alert based on the condition below if 2 or then a message popups.
	public boolean isGameEnd() {
		return winnersOfGame.size() == 2;
	}
	
	
	public boolean gameLoop(){
		
		if (activePlayer == null) {
			activePlayer = player.get(0);
		}
		
		int resultFromRollDice = activePlayer.rollDice(dice);
		if(activePlayer.isActive()){//checks wheather the player is active.
			
			int currentCellNumberForWinnner = activePlayer.getCellNumber();
			int requiredNumber = 100-currentCellNumberForWinnner;

			if(currentCellNumberForWinnner>=94){
				if(resultFromRollDice == requiredNumber){
					winnersOfGame.add(activePlayer);

					activePlayer.setCellNumber(100);
               		int x = (int) (currentCellNumberForWinnner / 10);
                	int y = (int) ((currentCellNumberForWinnner - 1) % 10);
                	cell[x][y].getPlayer().remove(activePlayer);
					Players removeWinner = activePlayer;
					
					activePlayer = player.get((activePlayerCount++) % player.size());
					player.remove(removeWinner);
					
					//here the condition is given to make the game loop stop for having two winner (only).
					if (winnersOfGame.size() == 2) {
                        return false;
                    }
				}
				else{
					resultFromRollDice=0;
					activePlayer = player.get((activePlayerCount++) % player.size());
					
				}
			}
			
			//The oldCellNumber is used so that the players lastplaced cellNumber be available.
			int oldCellNumber=activePlayer.getCellNumber();
			
			//Here the new cellNumber is made by taking the random number from dice and adding it with the current cellNumber.
			activePlayer.setCellNumber(activePlayer.getCellNumber()+resultFromRollDice);
			
			//these both line shows on which cell does the player goes by coverting the random number to (i,j).
			int i = (activePlayer.getCellNumber() - 1) / 10;
			int j = (activePlayer.getCellNumber() - 1) % 10;
			
			//The hunger level increases on every roll as per the resultFromRollDice.
			activePlayer.setHungerLevel(activePlayer.getHungerLevel()+resultFromRollDice);
			
			//The new cellNumber is added to a new variable called newCellNumber to access the cellNumber more easier.
			int newCellNumber = activePlayer.getCellNumber();
			
			//These two line takes the old cell number of the player by (i,j) and removes the player from old position.
			int x = (oldCellNumber - 1) / 10;
			int y = (oldCellNumber - 1) % 10;
			cell[x][y].getPlayer().remove(activePlayer);
			
			boolean checkPlayerIsAlive = getCell()[i][j].processPlayers(activePlayer);
				if(checkPlayerIsAlive){
					if (activePlayer.getCellNumber() == 100) {
						activePlayer = player.get((activePlayerCount++) % player.size());
					}
					else {
						//Here the player is active and if he is active we will change the player to the next person accordingly.
						if (resultFromRollDice != 6) {
							activePlayer = player.get((activePlayerCount++) % player.size());
						}
					}
				}
				else{
					//Here the player is out if the game and he will moved to cellNumber 0 and now he is not active.
					activePlayer.setCellNumber(0);
					activePlayer.setActive(false);
					return false;
				}
		}
		else{
			if(resultFromRollDice==1){
				activePlayer.setActive(true);
				activePlayer.setCellNumber(1);
				cell[0][0].getPlayer().add(activePlayer);
				activePlayer = player.get(activePlayerCount++ % player.size());
			}	
			else{
				activePlayer = player.get(activePlayerCount++ % player.size());
				return true;
			}
			
			
		}
		return true;
	}
}