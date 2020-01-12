package controller;
import model.*;
import view.*;
import java.io.*;

public class GameData {
    public static PrintWriter printWriter = null;

    public GameData() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader ("../saves.txt"));
    };

    public SaveGame(Hero player, String[][] map) {

    }
}