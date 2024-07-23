package com.lxi.hungergame.model ;

public class Hunter{
private String huntericon;
private String name;
private int hungerlevel;

    public Hunter(int hungerlevel, String huntericon, String name) {
        this.hungerlevel = hungerlevel;
        this.huntericon = huntericon;
        this.name = name;
    }

    public String getHuntericon() {
        return huntericon;
    }
    public void setHuntericon(String huntericon) {
        this.huntericon = huntericon;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public int getHungerlevel() {
        return hungerlevel;
    }

    public void setHungerlevel(int hungerlevel) {
        this.hungerlevel = hungerlevel;
    }
  
}