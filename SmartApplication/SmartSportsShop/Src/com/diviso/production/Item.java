package com.diviso.production;

public class Item implements AirFillable,Airlessable
{
    private String name;
    private String offer;

    public String getName() { return name;}
    public void setName(String name) {this.name = name;}

    public String getOffer() { return offer;}
    public void setOffer(String offer) { this.offer = offer;}

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", offer='" + offer + '\'' +
                '}';
    }
}
