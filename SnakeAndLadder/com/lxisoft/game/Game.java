package com.lxisoft.game;

import com.lxisoft.snakesandladders.Board;

public class Game {

	private Board board;
	private Player player1;
	private Player player2;
	private Die die;

	public void play() {
		do {
			System.out.println(player1.getName() + " rolling the die...");
			int result = die.roll();
			System.out.println(player1.getName() + " rolled: " + result);
			System.out.println("Current Position of " + player1.getCoin().getColor() + " coin: " + player1.getCoin().getPosition());
			if ((player1.getCoin().getPosition() > 0 || result == 1) && (player1.getCoin().getPosition() + result <= 100)) {
				player1.movecoin(result);
				board.biteOrLift(player1.getCoin());
				System.out.print("New Position: " + player1.getCoin().getPosition());
			}
			System.out.println("\n------------------------------------");
			System.out.println(player2.getName() + " rolling the die...");
			result = die.roll();
			System.out.println(player2.getName() + " rolled: " + result);
			System.out.println("Current Position of " + player2.getCoin().getColor() + " coin: " + player2.getCoin().getPosition());
			if ((player2.getCoin().getPosition() > 0 || result == 1) && (player2.getCoin().getPosition() + result <= 100)) {
				player2.movecoin(result);
				board.biteOrLift(player2.getCoin());
				System.out.print("New Position: " + player2.getCoin().getPosition());
			}
			System.out.println("\n------------------------------------");
		} while (player1.getCoin().getPosition() < 100 && player2.getCoin().getPosition() < 100);
		if (player1.getCoin().getPosition() == 100)
			System.out
					.println("\nCongratulations " + player1.getName() + "\nBetter luck next time " + player2.getName());
		else
			System.out
					.println("\nCongratulations " + player2.getName() + "\nBetter luck next time " + player1.getName());

	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}

}