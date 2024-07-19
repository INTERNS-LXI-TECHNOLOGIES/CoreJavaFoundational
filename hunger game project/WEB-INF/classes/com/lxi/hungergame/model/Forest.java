package com.lxi.hungergame.model;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    
    private Cell[][] cell = new Cell[10][10];
    private  List<Player> gamers = new ArrayList<>();
    private List<Player> winners = new ArrayList<>();
    private Player activePlayer;
    private  int playerCellCount;
    private Dice d = new Dice();
    private int activePlayerCount;

    


    public Cell[][] getCell() {
        return cell;
    }
    public List<Player> getGamers() {
        return gamers;
    }
    public Player getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(Player activePlayer) {
        this.activePlayer = activePlayer;
    }

    public int getPlayerCellCount() {
        return playerCellCount;
    }

    public void setPlayerCellCount(int playerCellCount) {
        this.playerCellCount = playerCellCount;
    }

    public Dice getD() {
        return d;
    }

    public void setD(Dice d) {
        this.d = d;
    }

    public int getActivePlayerCount() {
        return activePlayerCount;
    }

    public void setActivePlayerCount(int activePlayerCount) {
        this.activePlayerCount = activePlayerCount;
    }




    public void  createCell(){
        int count = 1;
        for( int i = 0 ; i < 10 ; i++ ){
            for (int j = 0; j < 10; j++) {
                getCell()[i][j] = new Cell("/hunger game project/image/1.jpg",count);
                count ++;
            }
        } 
    }

    public void createFood1(){
        Food food = new Food("Noodles","/hunger game project/image/food.jpg", -8);
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);
        getCell()[x][y].getFoods().add(food);
    }

    public void createFood2(){
        Food food = new Food("Apple","/hunger game project/image/apple.jpeg", -6);
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);
        getCell()[x][y].getFoods().add(food);  
    }

    public void createFood3(){
        Food food = new Food("Meat","/hunger game project/image/meat.jpeg", -10);
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);
        getCell()[x][y].getFoods().add(food);  
    }

    public void createHunter1(){
        Hunter hunter = new Hunter("Hunter","/hunger game project/image/hunter.jpg", 10);
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);
        getCell()[x][y].getHunters().add(hunter);
    }

    public void createHunter2(){
        Hunter hunter = new Hunter("Lion","/hunger game project/image/lion.jpeg", 8);
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);
        getCell()[x][y].getHunters().add(hunter);
    }

    public void initialise(){
        createCell();
        for (int i = 0; i < 18; i++) {
            createFood1();
            createFood2();
            createFood3();
            createHunter1();
            createHunter2();

        }
    }  

    public boolean gameLoop(){
        
        int result=activePlayer.rollDice(d);
        int oldCellCount=activePlayer.getCellCount();
        int currentCellCount = activePlayer.getCellCount()+ result;

           if(activePlayer.isActive() && currentCellCount <= 100){
            if(currentCellCount == 100){
                getWinners().add(activePlayer);
                int a=(int) (oldCellCount-1)/10;
                int b=(oldCellCount-1)%10;
                getGamers().remove(activePlayer);
                cell[a][b].getPlayers().remove(activePlayer);
                activePlayer=getGamers().get((activePlayerCount++) % getGamers().size());
                
                return true;
            }
                

               activePlayer.setCellCount(activePlayer.getCellCount()+result);
               activePlayer.setHungerLevel(activePlayer.getHungerLevel()+result);
               int i=(int) (activePlayer.getCellCount()-1)/10;
               int j=(activePlayer.getCellCount()-1)%10;
       
               int a=(int) (oldCellCount-1)/10;
               int b=(oldCellCount-1)%10;
               cell[a][b].getPlayers().remove(activePlayer);
       
               boolean x=	getCell()[i][j].processPlayer(activePlayer);
               
                   if(x){
                           if(result !=6){
                               activePlayer=getGamers().get((activePlayerCount++) % getGamers().size());
                               return true;

                            }
                           else{
                               return true;
                           }
       
                       }
       
                       else{
                           activePlayer.setCellCount(0);
                           activePlayer.setIsActive(false);
                           activePlayer.setHungerLevel(0);
                           activePlayer=getGamers().get((activePlayerCount++) % getGamers().size());

                           return false;
                       }
       
          }

          
               else{
                   if(result==1){
                       activePlayer.setIsActive(true);
                       cell[0][0].getPlayers().add(activePlayer);
                       activePlayer.setCellCount(1);
                       activePlayer.setHungerLevel(1);
                       activePlayer=getGamers().get((activePlayerCount++)% getGamers().size());

                       return  true;
                   }
               }
               activePlayer=getGamers().get((activePlayerCount++)% getGamers().size());
               return true;  
       }

    public List<Player> getWinners() {
        return winners;
    }

    public void setWinners(List<Player> winners) {
        this.winners = winners;
    }
    
    

}
