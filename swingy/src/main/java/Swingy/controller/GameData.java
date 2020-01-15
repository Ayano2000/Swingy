package controller;
import model.*;
import view.*;
import java.io.*;

public class GameData {
    private PrintWriter printWriter = new PrintWriter(new File("./saves.txt"));
    public GameData() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader ("../saves.txt"));
    };

    public void SaveGame(Hero player, String[][] map) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader ("../saves.txt"));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            if (player.Name == line) {
                // do shit
            }
        }
    }
}