package com.lxisoft.model;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private Cells[][] cell = new Cells[10][10];
    private List<Players> player = new ArrayList<>();
	private List<LifeOrDeathMission> doOrDie = new ArrayList<>();
    private List<MissionPrep> missionPreps = new ArrayList<>();
    
	public Forest() {
		bgAddingMethod();
		combinedCreation();
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

	public void missionPrepQuestions(){
	}

	public void lifeOrDeathQuestions() {
	}


    public void combinedCreation() {
        for (int i = 0; i < 30; i++) {
            missionPrepQuestions();
            lifeOrDeathQuestions();
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
	
	/*public boolean gameLoop(){
	 return true;
	}*/
}