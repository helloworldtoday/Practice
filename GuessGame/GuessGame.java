package Guess_Game;

import javax.swing.JOptionPane;

public class GuessGame {

    private int numberToGuess;
    private Player p1;
    private Player p2;
    
    // would probably made amount of players dynamic as well.
    public GuessGame(String player1, String player2) {
        numberToGuess = (int) (Math.random() * 10);
        p1 = new Player(player1);
        p2 = new Player(player2);
    }

    public void startGame(){
    	int flagWinner = 0;
    	while (flagWinner == 0) {
            p1.guessNumber();
            if (p1.getNumber() == numberToGuess) {
                flagWinner = 1;
                break;
            }
            String message1 = p1.getNumber() > numberToGuess ? "larger!" : "smaller!";
            JOptionPane.showMessageDialog(null, p1.getPlayerName()
                    + "'s Guess is " + message1);
            
            p2.guessNumber();
            if (p2.getNumber() == numberToGuess) {
                flagWinner = 2;
                break;
            }
            String message2 = p2.getNumber() > numberToGuess ? "larger!" : "smaller!";
            JOptionPane.showMessageDialog(null, p2.getPlayerName()
                + "'s Guess is " + message2);
        }
        if (flagWinner == 1) {
            JOptionPane.showMessageDialog(null,p1.getPlayerName() + " Wins!");
        } else if (flagWinner == 2) {
            JOptionPane.showMessageDialog(null,p2.getPlayerName() + " Wins!");
        }
    }
    
    public static void main(String[] e){
        GuessGame gg = new GuessGame(
            JOptionPane.showInputDialog("Enter Player 1 Name: "),
            JOptionPane.showInputDialog("Enter Player 2 Name: ")
        );
        gg.startGame();
    }
}
// reference from: http://codereview.stackexchange.com/questions/850/guessing-game-am-i-using-the-concept-of-objects-in-java-properly?rq=1
