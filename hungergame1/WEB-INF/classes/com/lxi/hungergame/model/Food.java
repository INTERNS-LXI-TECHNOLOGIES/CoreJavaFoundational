package com.lxi.hungergame.model ;

public class Food{
private String name;
private String icon;
private int hungerlevel;

    public Food(int hungerlevel, String icon, String name) {
        this.hungerlevel = hungerlevel;
        this.icon = icon;
        this.name = name;
    }

	public String getName() {
  return name;
	}
	public void setName(String name) {
  this.name = name;
	}

	public String getIcon() {
	return icon;
	}
	public void setIcon(String icon){
	 this.icon = icon;
	}

	public int getHungerlevel() {
	return hungerlevel;
	}
	public void setHungerlevel(int hungerlevel){
	this.hungerlevel = hungerlevel;
	}

}