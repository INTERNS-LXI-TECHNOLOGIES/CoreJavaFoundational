package com.lxisoft.model;

public class MissionPrep {
    private int[] results = new int[3];

    public int[] getResults() {
        return results;
    }
    public void setResults(int[] results) {
        this.results = results;
    }

    public void randomNumbersFromMissionPrep() {
        for (int i = 0; i < results.length; i++) {
            results[i] = (int) (Math.random() * 100) + 1;
        }
    }
}
