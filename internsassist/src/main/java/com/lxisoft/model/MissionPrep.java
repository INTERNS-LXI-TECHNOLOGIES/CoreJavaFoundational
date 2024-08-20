package com.lxisoft.model;

public class MissionPrep {
    private int[] results = new int[3];

    public int[] getResults() {
        return results;
    }
    public void setResults(int[] results) {
        this.results = results;
    }

    public int[] randomNumbersForTaskLevel1() {
        for (int i = 0; i < results.length; i++) {
            results[i] = (int) (Math.random() * 25) + 1;
        }
        return results;
    }
    
    public int[] randomNumbersForTaskLevel2() {
        for (int i = 0; i < results.length; i++) {
            results[i] = (int) (Math.random() * 26) + 25;
        }
        return results;
    }

    public int[] randomNumbersForTaskLevel3() {
        for (int i = 0; i < results.length; i++) {
            results[i] = (int) (Math.random() * 26) + 50;
        }
        return results;
    }

    public int[] randomNumbersForTaskLevel4() {
        for (int i = 0; i < results.length; i++) {
            results[i] = (int) (Math.random() * 26) + 75;
        }
        return results;
    }
}
