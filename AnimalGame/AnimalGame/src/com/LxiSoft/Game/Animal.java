package com.LxiSoft.Game;

public class Animal 
{
    String animalName;
    int energyLevel;
    int strength;

    //public void behaviour()
    //{

    //}
    public void setName(String name)
    {
        this.animalName = name;
    }
    public String getName()
    {
        return animalName;
    } 
    public void setStrength(int strenth)
    {
        this.strength = strenth;
    }
    public int getStrength()
    {
        return strength;
    }
    public void setEnergyLevel(int energy)
    {
        this.energyLevel = energy;
    }
    public int getEnergyLevel()
    {
        return energyLevel;
    }
}
