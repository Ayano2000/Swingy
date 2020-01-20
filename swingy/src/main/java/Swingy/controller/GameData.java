package controller;
import model.*;
import view.*;
import java.io.*;
import java.io.File;

public class GameData {

    public void SaveGame(Hero player, int[][] map) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File("./saves.txt"));
        printWriter.println("NAME " + player.getName());
        printWriter.println("TYPE " + player.getType());
        printWriter.println("XP " + player.getXP());
        printWriter.println("ARMOR " + player.getArmor());
        printWriter.println("DAMAGE " + player.getDamage());
        printWriter.println("HP " + player.getHP());
        printWriter.println("LEVEL " + player.getLevel());
        printWriter.println("MAP");
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                printWriter.print(map[row][column]);
            }
            printWriter.print("\n");
        }
        printWriter.close();
    }
}