package com.lxisoft.cricketproject.model;
import java.util.*;

public class Country {

private String countryName;
private List<Player> playersList1 = new ArrayList<>();
private List<Player> playerList2 = new ArrayList<>();

public String getCountryName() {
    return countryName;
}
public void setCountryName(String countryName) {
    this.countryName = countryName;
}
public List<Player> getPlayersList1() {
    return playersList1;
}
public void setPlayersList1(List<Player> playersList1) {
    this.playersList1 = playersList1;
}
public List<Player> getPlayerList2() {
    return playerList2;
}
public void setPlayerList2(List<Player> playerList2) {
    this.playerList2 = playerList2;
}
public Country(String countryName, List<Player> playersList1, List<Player> playerList2) {
    this.countryName = countryName;
    this.playersList1 = playersList1;
    this.playerList2 = playerList2;
}
public Country(String countryName)
{this.countryName= countryName;}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Country other = (Country) obj;
    if (countryName == null) {
        if (other.countryName != null)
            return false;
    } else if (!countryName.equals(other.countryName))
        return false;
    if (playersList1 == null) {
        if (other.playersList1 != null)
            return false;
    } else if (!playersList1.equals(other.playersList1))
        return false;
    if (playerList2 == null) {
        if (other.playerList2 != null)
            return false;
    } else if (!playerList2.equals(other.playerList2))
        return false;
    return true;
}
@Override
public String toString() {
    return "Country [countryName=" + countryName + ", playersList1=" + playersList1 + ", playerList2=" + playerList2
            + "]";
}


}