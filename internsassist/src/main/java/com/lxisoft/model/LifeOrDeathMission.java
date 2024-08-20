package com.lxisoft.model;

public class LifeOrDeathMission {
    private MissionPrep missionPrep = new MissionPrep();

    public int pickRandomNumberFromTaskLevel1() {
        missionPrep.randomNumbersForTaskLevel1();
        int[] results = missionPrep.getResults();

        int randomIndex = (int) (Math.random() * results.length);
        int pickedNumber = results[randomIndex];
        return pickedNumber;
    }

    public int pickRandomNumberFromTaskLevel2() {
        missionPrep.randomNumbersForTaskLevel2();
        int[] results = missionPrep.getResults();

        int randomIndex = (int) (Math.random() * results.length);
        int pickedNumber = results[randomIndex];
        return pickedNumber;
    }

    public int pickRandomNumberFromTaskLevel3() {
        missionPrep.randomNumbersForTaskLevel3();
        int[] results = missionPrep.getResults();

        int randomIndex = (int) (Math.random() * results.length);
        int pickedNumber = results[randomIndex];
        return pickedNumber;
    }

    public int pickRandomNumberFromTaskLevel4() {
        missionPrep.randomNumbersForTaskLevel4();
        int[] results = missionPrep.getResults();

        int randomIndex = (int) (Math.random() * results.length);
        int pickedNumber = results[randomIndex];
        return pickedNumber;
    }
}
