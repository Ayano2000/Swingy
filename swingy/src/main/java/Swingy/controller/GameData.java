package controller;
import model.*;
import view.*;
import java.io.*;
import java.io.File;

public class GameData {

    public void SaveGame(String name, int[][] map) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File("./saves.txt"));
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                printWriter.print(map[row][column]);
            }
            printWriter.print("\n");
        }
        printWriter.close();
    }
}