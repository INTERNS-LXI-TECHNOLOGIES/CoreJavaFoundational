package com.lxisoft.hungergame.forest;
public class Food{
  
 private String name;
 private String image;
 private int hungerlevel;
 
 public String getImage() {
    return image;
}

public void setImage(String image) {
    this.image = image;
}

public Food(String name, String image, int hungerlevel) {
    this.name = name;
    this.image = image;
    this.hungerlevel = hungerlevel;
}





public int getHungerlevel() {
    return hungerlevel;
}

public void setHungerlevel(int hungerlevel) {
    this.hungerlevel = hungerlevel;
}


  public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}


}