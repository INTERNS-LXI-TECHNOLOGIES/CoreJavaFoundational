package com.diviso.car;

import java.util.Arrays;

public class Car
{

private String name;
private String colour;
private Door[] doors = new Door[4];
private Tyre[] tyres = new Tyre[4];
private Steering steering;

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getColour() {
    return colour;
}
public void setColour(String colour) {
    this.colour = colour;
}
public Door[] getDoors() {
    return doors;
}
public void setDoors(Door[] doors) {
    this.doors = doors;
}
public Tyre[] getTyres() {
    return tyres;
}
public void setTyres(Tyre[] tyres) {
    this.tyres = tyres;
}
public Steering getSteering() {
    return steering;
}
public void setSteering(Steering steering) {
    this.steering = steering;
}
@Override
public String toString() {
    return "Car [name=" + name + ", colour=" + colour + ", doors=" + Arrays.toString(doors) + ", tyres="
            + Arrays.toString(tyres) + ", steering=" + steering + "]";
}

}