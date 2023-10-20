import java.io.*;
import java.util.Scanner;

public class Game {
    int highscore;
    String mapName;
    Player player = new Player();

    public static void main(String[] args) {
        new Game().run();
    }

    private void run() {

        makeFile();//Make the file, only run once
        initAttributes(); //Find the attributes in the file and give them to Player and Game
        printAttributes(); //Print attributes.
    }

    public void makeFile(){
        File file = new File("src\\init.ini");
        try {
            FileOutputStream fos = new FileOutputStream(file, true); //used for tokens
            PrintStream ps = new PrintStream(fos);
            ps.append("highscore" + "=" + 23722 + "\n");
            ps.append("mapName" + "=" + "Programmers Pyramid" + "\n");
            ps.append("playerName"+ "=" +"Dit Navn " + "\n");
            ps.append("playerScore"+ "=" +1843 + "\n");
            ps.append("playerCoorX" + "=" + 24 + "\n");
            ps.append("playerCoorY" + "=" + 34 + "\n");
            ps.close();
            fos.close();
        } catch (
                IOException e) {
            System.out.println("Execption " + e.getMessage());

        }
    }
    public void initAttributes() {
        try {
            Scanner fileReader = new Scanner(new File ("src\\init.ini"));
            while (fileReader.hasNextLine()) {
                Scanner tokenReader = new Scanner(fileReader.nextLine()).useDelimiter("=");
                String key = tokenReader.next().toLowerCase(); //read nextline
                switch (key) { //if nexline is equal to a token then read the value of the token and assign
                               // the coresponding attribute that value
                    case "highscore" -> highscore = tokenReader.nextInt();
                    case "mapname" -> mapName = tokenReader.next();
                    case "playername" -> player.setPlayerName(tokenReader.next());
                    case "playerscore" -> player.setPlayerScore(tokenReader.nextInt());
                    case "playercoorx" -> player.setPlayerCoorX(tokenReader.nextInt());
                    case "playercoory" -> player.setPlayerCoorY(tokenReader.nextInt());
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printAttributes(){
        System.out.println("\nGAME:");
        System.out.printf("Higscore:       %d%n", highscore);
        System.out.printf("Map name:       %s%n", mapName);
        System.out.println("\nPLAYER");
        System.out.println("Name:           " + player.getPlayerName() );
        System.out.println("Score:          " + player.getPlayerScore());
        System.out.println("Coordinate X:   " + player.getPlayerCoorX());
        System.out.println("Coordinate Y    " +player.getPlayerCoorY());

        }

    }


