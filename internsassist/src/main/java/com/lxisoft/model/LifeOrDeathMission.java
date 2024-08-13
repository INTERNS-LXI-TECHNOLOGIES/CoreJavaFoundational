package com.lxisoft.model;

public class LifeOrDeathMission{
    private MissionPrep missionPrep = new MissionPrep();

    public int pickRandomNumberFromMissionPrep(){

        missionPrep.randomNumbersFromMissionPrep();
        int[] results = missionPrep.getResults();

        int randomNumber = (int) (Math.random() * results.length);
        int pickedNumber = results[randomNumber];
        return pickedNumber;
    }
}
