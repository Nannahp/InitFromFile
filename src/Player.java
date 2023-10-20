import java.io.IOException;
import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerScore;
    private int playerCoorX;
    private int playerCoorY;


    public Player() {
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerCoorY(int playerCoorY) {
        this.playerCoorY = playerCoorY;
    }

    public void setPlayerCoorX(int playerCoorX) {
        this.playerCoorX = playerCoorX;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getPlayerCoorX() {
        return playerCoorX;
    }

    public int getPlayerCoorY() {
        return playerCoorY;
    }
}
