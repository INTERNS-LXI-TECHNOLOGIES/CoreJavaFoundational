package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Board{
	private String player1Name;
	public void setPlayer1Name(String a){
		this.player1Name=a;
	}
	public String getplayer1Name(){
		return player1Name;
	}

	private String player2Name;
	public void setPlayer2Name(String a){
		this.player2Name=a;
	}
	public String getplayer2Name(){
		return player2Name;
	}

	
	private int cellNumber;
	public void setCellNumber(Integer a){
		this.cellNumber=a;
	}
	public int getCellNumber(){
		return cellNumber;
	}

	private int i;//coin of player1
	public void setI(Integer a){
		this.i=a;
	}
	public int getI(){
		return i;
	}

	private int j;//coin of player2
	public void setJ(Integer a){
		this.j=a;
	}
	public int getJ(){
		return j;
	}


}