package Guess_Game;

import javax.swing.JOptionPane;

public class Player {

    private String playerName;
    private int number;

    public Player(String name) {
    	this.playerName = name;
    }
    
    public int getNumber() {
        return number;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void guessNumber(){
        number = Integer.parseInt(JOptionPane.showInputDialog(playerName 
            + "'s Turn\nGuess the Number"));
        JOptionPane.showMessageDialog(null, playerName+ "'s GUESS is " + number);
    }
}
