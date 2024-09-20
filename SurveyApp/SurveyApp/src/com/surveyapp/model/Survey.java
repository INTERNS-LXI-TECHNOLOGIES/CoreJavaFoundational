package com.surveyapp.model;

public class Survey {
    private String engineerName;
    private String skillGap;

    public Survey(String engineerName, String skillGap) {
        this.engineerName = engineerName;
        this.skillGap = skillGap;
    }

    // Getters and Setters
    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public String getSkillGap() {
        return skillGap;
    }

    public void setSkillGap(String skillGap) {
        this.skillGap = skillGap;
    }

    @Override
    public String toString() {
        return "Engineer: " + engineerName + ", Skill Gap: " + skillGap;
    }
}
