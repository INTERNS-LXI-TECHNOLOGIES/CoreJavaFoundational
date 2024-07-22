package com.lxisoft.hungerGame.model;
import java.util.ArrayList;
import java.util.List;

public class Forest {
    private Cell[][] cell = new Cell[10][10];
    private List<Players> players = new ArrayList<>();
    private List<Players> winnersOfGame = new ArrayList<>();
    private Players activePlayer;
    private List<Foods> foods = new ArrayList<>();
    private List<Hunter> hunters = new ArrayList<>();
    public Dice dice = new Dice();
    private int activePlayerCount = 0;	
   


public Forest() {
    creatingSpaceForArray();
    createHunters();
    makeFood();
    }

    public void setCell(Cell[][] cell) {
        this.cell = cell;
    }
    public Cell[][] getCell() {
        return cell;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }
    public List<Players> getPlayers() {
        return players;
    }

    public void setWinnersOfGame(List<Players> winnersOfGame) {
		this.winnersOfGame = winnersOfGame;
	}
    public List<Players> getWinnersOfGame() {
		return winnersOfGame;
	}
	
    public void setActivePlayer(Players activePlayer) {
        this.activePlayer = activePlayer;
    }
    public Players getActivePlayer() {
        return activePlayer;
    }

	public void setDice(Dice dice){
		this.dice = dice ;
	}
	public Dice getDice(){
		return this.dice ;
	}

    
    public void creatingSpaceForArray() {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cell[i][j] = new Cell("/HUNGERGAME/forestimage/img11.jpg",0);
            }
        }
    }

	public void makeFood() {
        for (int i = 0; i < 30; i++) {
            Foods apple = new Foods("/foodimage/apple.jpg", "Apple", -10);
            int m = (int) (Math.random() * 10);
            int n = (int) (Math.random() * 10);
            cell[m][n].getFoods().add(apple);

            Foods mango = new Foods("/foodimage/mango.jpg", "Mango", -12);
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            cell[a][b].getFoods().add(mango);
        }
    }

	public void createHunters() {
        for (int i = 0; i < 3; i++) {
            Hunter hunter = new Hunter("/hunterimage/hunt.jpg", "Lion", 10);
            int u = (int) (Math.random() * 10);
            int v = (int) (Math.random() * 10);
            cell[u][v].getHunter().add(hunter);
        }
    }

	public void startMethods() {
        creatingSpaceForArray();
        createHunters();
        makeFood();
    }

    
public boolean isGameEnd() {
    
		return winnersOfGame.size() == players.size();
	}
    
public boolean gameloop() {
	
    if (players.isEmpty()) {
        System.out.println("No players available for the game loop.");
        return true;
   }
    
    int result = activePlayer.rollDice(dice);
    int currentCellCount = activePlayer.getPlayerCellCount()+result;
    int oldCellNumber = activePlayer.getPlayerCellCount();

    if (activePlayer.isActive() && currentCellCount <= 100 ) {
            
        if(currentCellCount==100){
								
            winnersOfGame.add(activePlayer);
            int x = (int) (oldCellNumber / 10);
            int y = (int) ((oldCellNumber - 1) % 10);
            cell[x][y].getPlayers().remove(activePlayer);
			players.remove(activePlayer);
			
            if (players.size() == 1) {
                return false; // End the game
            } else {
                activePlayer = players.get((activePlayerCount++) % players.size());
                return true;
            }
        }
            


    activePlayer.setPlayerCellCount (activePlayer.getPlayerCellCount() + result);
    activePlayer.setPlayerHungerLevel(activePlayer.getPlayerHungerLevel()+result);

        int i = (activePlayer.getPlayerCellCount()-1) / 10;
        int j = (activePlayer.getPlayerCellCount() - 1) % 10;



        int oldI = (oldCellNumber - 1) / 10;
        int oldJ = (oldCellNumber - 1) % 10;
        cell[oldI][oldJ].getPlayers().remove(activePlayer);

        boolean x = getCell()[i][j].processPlayer(activePlayer);

            if (x) {

                    if(result != 6) {
                        activePlayer = players.get((activePlayerCount++) % players.size());
                        return true;
                    } 
                    else{
                        return true;
                    }                               

                } 
            
            
            else {
                activePlayer.setPlayerCellCount(0);
                activePlayer.setIsActive(false);
                activePlayer.setPlayerHungerLevel(0);
				activePlayer = players.get(activePlayerCount++ % players.size());
                return false;
            }
        } 
        
        else {
            if (result == 1) {
                cell[0][0].getPlayers().add(activePlayer);
                activePlayer.setIsActive(true);
                activePlayer.setPlayerCellCount(1);
                activePlayer.setPlayerHungerLevel(1);
				activePlayer = players.get(activePlayerCount++ % players.size());
                return  true;

            }
        }
            
				activePlayer = players.get(activePlayerCount++ % players.size());
                return true;
            
        }

    public boolean createPlayers(String name) {

     String[] icons = {"/HUNGERGAME/player/player1.jpg",
                             "/HUNGERGAME/player/player3.jpg",
                            "/HUNGERGAME/player/player4.jpg"};
                             
    int PlayerImage = players.size() % icons.length;
    Players newPlayer = new Players(name,icons[PlayerImage]);
    return players.add(newPlayer);
    }
}
    

