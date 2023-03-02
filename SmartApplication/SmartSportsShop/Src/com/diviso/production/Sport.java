package com.diviso.production;

public class Sport
{
    private String name;

    public String getName() { return name;}
    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                '}';
    }
}
