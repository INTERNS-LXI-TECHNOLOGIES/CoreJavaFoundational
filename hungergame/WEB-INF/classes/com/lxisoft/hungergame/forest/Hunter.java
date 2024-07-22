
package com.lxisoft.hungergame.forest;
public class Hunter{

private String name;
private String image;
private int hungerlevel;



public Hunter(String name, String image, int hungerlevel) {
    this.name = name;
    this.image = image;
    this.hungerlevel = hungerlevel;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getImage() {
    return image;
}
public void setImage(String image) {
    this.image = image;
}
public int getHungerlevel() {
    return hungerlevel;
}
public void setHungerlevel(int hungerlevel) {
    this.hungerlevel = hungerlevel;
}



}