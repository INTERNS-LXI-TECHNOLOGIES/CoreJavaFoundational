package com.lxisoft.hungerGame.model;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private Cells[][] cell = new Cells[10][10];
    private List<Players> player = new ArrayList<>();

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

    public void bgAddingMethod() {
        int imagecount = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cell[i][j] = new Cells();
                cell[i][j].setBgImage("/hungerGame/HungerGame-img/tableBG/" + imagecount + ".jpg");
                //imagecount++;
            }
        }
    }

    public void createHunter() {
        Hunter hunter = new Hunter("/hungerGame/HungerGame-img/icon/hunterICON1.jpeg");
        int i = (int)(Math.random() * 10);
        int j = (int)(Math.random() * 10);
        this.cell[i][j].setHunter(hunter);
    }

    public void createFood() {
        Food food = new Food("/hungerGame/HungerGame-img/icon/foodImage1.jpg");
        int i = (int)(Math.random() * 9);
        int j = (int)(Math.random() * 9);
        this.cell[i][j].getFood().add(food);
    }

    public void combinedCreation() {
        for (int i = 0; i < 10; i++) {
            createHunter();
            createFood();
        }
    }

    public boolean addPlayer(String playerName) {
        String[] icons = {
            "/hungerGame/HungerGame-img/icon/playerICON1.jpg",
            "/hungerGame/HungerGame-img/icon/playerICON2.jpeg",
            "/hungerGame/HungerGame-img/icon/playerICON3.jpeg",
            "/hungerGame/HungerGame-img/icon/playerICON4.jpeg",
            "/hungerGame/HungerGame-img/icon/playerICON5.jpeg"
        };

        int PlayerImage = player.size() % icons.length;
        Players newPlayer = new Players(icons[PlayerImage]);
        newPlayer.setName(playerName);
        return player.add(newPlayer);
    }
}