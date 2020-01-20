package controller;
import model.*;
import view.*;
import java.io.*;
import java.io.File;

public class GameData {

    public void SaveGame(Hero player, int[][] map) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File("./saves.txt"));
        printWriter.println("TYPE " + player.getType());
        printWriter.println("NAME " + player.getName());
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

    public Hero LoadGame() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./saves.txt"));
        Hero player;
        String line = reader.readLine();
        System.out.println(line.split(" ")[1]);
        switch(line.split(" ")[1]) {
            case "MAGE":
                line = reader.readLine();
                player = new Mage(1, line.split(" ")[1]);
                break;
            case "WARRIOR":
                player = new Warrior(2, line.split(" ")[1]);
                break;
            case "ORC":
                player = new Orc(3, line.split(" ")[1]);
                break;
            default:
                player = new Human(4, line.split(" ")[1]);
        }
        System.out.println(line.split(" ")[1]);
        reader.close();
        return (player);
    }
}