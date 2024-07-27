package com.lxisoft.model;

public class MissionPrep{
    private int result;

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
	public void randomNumberFromMissionPrep(){
		result = (int) (Math.random() * 4) + 1;
	}
}