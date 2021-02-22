package ui.view;
import javax.swing.JOptionPane;

import domain.GuessGame;

public class GuessGameUI {

	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		
		boolean gameOver = false;
		while (!gameOver) {
			String answer = JOptionPane.showInputDialog("Guess a number between 1 and 10 (0 to quit):");
			int guessedNumber = Integer.parseInt(answer);
			if(guessedNumber == 0){
				gameOver = true;
			} else {
				String message = game.guess(guessedNumber);
				JOptionPane.showMessageDialog(null, message);
			}
		}
	}
}
