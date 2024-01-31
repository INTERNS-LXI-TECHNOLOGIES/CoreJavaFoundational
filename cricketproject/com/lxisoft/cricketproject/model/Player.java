package com.lxisoft.cricketproject.model;

public class Player {
    
private String playerName;
private int score;

public String getPlayerName() {
    return playerName;
}
public void setPlayerName(String playerName) {
    this.playerName = playerName;
}
public int getScore() {
    return score;
}
public void setScore(int score) {
    this.score = score;
}
public Player(String playerName, int score) {
    this.playerName = playerName;
    this.score = score;
}
public Player(){}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Player other = (Player) obj;
    if (playerName == null) {
        if (other.playerName != null)
            return false;
    } else if (!playerName.equals(other.playerName))
        return false;
    if (score != other.score)
        return false;
    return true;
}
@Override
public String toString() {
    return "Player [playerName=" + playerName + ", score=" + score + "]";
}


}
