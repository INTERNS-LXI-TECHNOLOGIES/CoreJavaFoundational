package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Player2 extends Players{
	public void setPlayer(String name){
		this.player = name; 
	} 
	public String getPlayer(){
		return player;
	}
	public void setColor(String colr){
		this.color = colr;
	}
	public String getColor(){
		return color;
	}
	public void setPosition(int post){
		this.position = post;
	}
	public int getPosition(){
		return position;
	}
}