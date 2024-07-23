package com.lxi.hungergame.model;

import java.util.ArrayList;

public class Forest {
    private Cell[][] cell = new Cell[10][10];
    private Player activep;
    private ArrayList<Player> gamers = new ArrayList<Player>();
    private Dice dice = new Dice();
    private int activePlayerCount = 0;
    private int totalplayers;
    private ArrayList<Player> WinnersOfGame = new ArrayList<Player>();

    public Cell[][] getCell() {
        return cell;
    }

    public void setCell(Cell[][] cell) {
        this.cell = cell;
    }

    public Player getActivep() {
        return activep;
    }

    public void setActivep(Player activep) {
        this.activep = activep;
    }

    public ArrayList<Player> getGamers() {
        return gamers;
    }

    public void setGamers(ArrayList<Player> gamers) {
        this.gamers = gamers;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public int getActivePlayerCount() {
        return activePlayerCount;
    }

    public void setActivePlayerCount(int activePlayerCount) {
        this.activePlayerCount = activePlayerCount;
    }

    public int getTotalplayers() {
        return totalplayers;
    }

    public void setTotalplayers(int totalplayers) {
        this.totalplayers = totalplayers;
    }

    public ArrayList<Player> getWinnersOfGame() {
        return WinnersOfGame;
    }

    public void setWinnersOfGame(ArrayList<Player> WinnersOfGame) {
        this.WinnersOfGame = WinnersOfGame;
    }

    public void initialize() {
        creatingSpaceForArray();
        createFoods();
        createHunters();
    }

    public void creatingSpaceForArray() {
        int imageCount = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cell[i][j] = new Cell("/hungergame1/images/" + imageCount + ".jpg", imageCount);
                //imageCount++;
            }
        }
    }

    public void createFoods() {
        for (int i = 0; i < 10; i++) {
            Food food1 = new Food(-10, "/hungergame1/images/foodimages/apple.jpg", "apple");
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);

            cell[a][b].getFoods().add(food1);
        }
        for (int j = 0; j < 10; j++) {
            Food food2 = new Food(-12, "/hungergame1/images/foodimages/rice.jpg", "rice");
            int c = (int) (Math.random() * 10);
            int d = (int) (Math.random() * 10);

            cell[c][d].getFoods().add(food2);
        }
        for (int k = 0; k < 10; k++) {
            Food food3 = new Food(-14, "/hungergame1/images/foodimages/chicken.jpg", "chicken");
            int e = (int) (Math.random() * 10);
            int f = (int) (Math.random() * 10);

            cell[e][f].getFoods().add(food3);
        }
    }

    public void createHunters() {
        for (int i = 0; i < 5; i++) {
            Hunter hunter1 = new Hunter(5, "/hungergame1/images/hunterimages/hunter.jpg", "hunter");
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);

            cell[a][b].getHunters().add(hunter1);
        }

        for (int j = 0; j < 5; j++) {
            Hunter hunter2 = new Hunter(8, "/hungergame1/images/hunterimages/hunter1.jpg", "hunter1");
            int c = (int) (Math.random() * 10);
            int d = (int) (Math.random() * 10);

            cell[c][d].getHunters().add(hunter2);
        }
    }

    public boolean gameLoop() {
    
    int result = activep.rollDice(dice);

    if (activep.getisActive()) {
        
    int currentCellNumber = activep.getCellCount();
    int requiredNumber = 100 - currentCellNumber;

    if (currentCellNumber >= 94) {
    if (result == requiredNumber) {
        activep.setCellCount(currentCellNumber + result);

        if (activep.getCellCount() == 100) {
            getWinnersOfGame().add(activep);
            int x = (currentCellNumber - 1) / 10;
            int y = (currentCellNumber - 1) % 10;
            getCell()[x][y].getPlayers().remove(activep);

            getGamers().remove(activep);

            if (getWinnersOfGame().size() == 2) {
                return true; 
            }
        }
    }

    if (!getGamers().isEmpty()) {
        activePlayerCount = activePlayerCount % getGamers().size(); 
        activep = getGamers().get(activePlayerCount++);
    }
    return false;
}

        int oldCellCount = activep.getCellCount();
        activep.setCellCount(activep.getCellCount() + result);
        activep.setHungerlevel(activep.getHungerlevel() + result);

        int i = (activep.getCellCount() - 1) / 10;
        int j = (activep.getCellCount() - 1) % 10;

        int oldI = (oldCellCount - 1) / 10;
        int oldJ = (oldCellCount - 1) % 10;

        getCell()[oldI][oldJ].getPlayers().remove(activep);

        boolean survived = getCell()[i][j].processPlayer(activep);
        if (survived) {
            if (result != 6) {
                activePlayerCount = activePlayerCount % getGamers().size(); // Ensure index is within bounds
                activep = getGamers().get(activePlayerCount++);
            }
            return true;
        } else {
            activep.setCellCount(0);
            activep.setHungerlevel(0);
            activep.setisActive(false);

            activePlayerCount = activePlayerCount % getGamers().size(); // Ensure index is within bounds
            activep = getGamers().get(activePlayerCount++);
            return false;
        }
    } 
    
    else {
        if (result == 1) {
            getCell()[0][0].getPlayers().add(activep);
            activep.setisActive(true);
            activep.setCellCount(1);
            activep.setHungerlevel(1);

            activePlayerCount = activePlayerCount % getGamers().size(); // Ensure index is within bounds
            activep = getGamers().get(activePlayerCount++);
            return true;
        } else {
            activePlayerCount = activePlayerCount % getGamers().size(); // Ensure index is within bounds
            activep = getGamers().get(activePlayerCount++);
            return true;
        }
    }
}

}
