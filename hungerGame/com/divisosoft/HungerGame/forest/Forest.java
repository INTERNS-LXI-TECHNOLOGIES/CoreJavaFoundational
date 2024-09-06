package com.divisosoft.HungerGame.forest;
import com.divisosoft.HungerGame.cells.Cells;
import com.divisosoft.HungerGame.forest.ForestModel;
import com.divisosoft.HungerGame.dice.*;

public class Forest{
	private Cells[] cell= new Cells[100];
	private ForestModel fModel= new ForestModel();
	RollDicePlayer1 player1Roll;
	RollDicePlayer2 player2Roll;
	RollDicePlayer3 player3Roll;
	
	public Cells[] getCell() {
        return cell;
    }
	public void setCell(Cells[] cell) {
        this.cell = cell;
    }
	
	public ForestModel getFModel() {
        return fModel;
    }
	public void setFModel(ForestModel fModel) {
        this.fModel = fModel;
    }
	
	public void startGameMethod(){
		fModel.showMethod();
	}
}