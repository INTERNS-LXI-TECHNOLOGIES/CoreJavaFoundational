package com.lxisoft.hungerGame.model;

import java.util.ArrayList;
import java.util.List;

public class Cells {
    private String bgImage;
    private int cellNumber;
    private List<Players> player = new ArrayList<>();
    private List<LifeOrDeathMission> doOrDie = new ArrayList<>();
    private List<MissionPrep> missionPreps = new ArrayList<>();
	private Dice dice;
    
    public Cells(String bgImage, int cellNumber) {
        this.bgImage = bgImage;
        this.cellNumber = cellNumber;
    }
	
    public String getBgImage() {
        return bgImage;
    }
    public void setBgImage(String bgImage) {
        this.bgImage = bgImage;
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

	public boolean processPlayers(Players player){
       return true;
	}
}