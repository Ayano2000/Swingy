package controller;
import model.*;
import view.*;
import java.io.*;
import java.io.File;
import java.util.*;

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
        String line = reader.readLine();
        Hero player = null;
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
        reader.close();
        return (player);
    }

    public int[][] GetMap() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./saves.txt"));
        String line = reader.readLine();
        while (!line.equals("MAP"))
            line = reader.readLine();
        line = reader.readLine();
        int size = line.length();
        int world[][] = new int[size][size];
        char[] ch;
        int x = 0;
        while (line != null && !line.isEmpty()) {
            ch = new char[line.length()];
            for (int i = 0; i < line.length(); i++) {
                ch[i] = line.charAt(i);
            }
            for (int pos = 0; pos < size; pos++) {
                world[x][pos] = Integer.parseInt(String.valueOf(ch[pos]));
            }
            line = reader.readLine();
            x++;
        }
        return(world);
    }

    public int SetHp() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./saves.txt"));
        String line = reader.readLine();
        while (!line.split(" ")[0].equals("HP"))
            line = reader.readLine();
        int x = Integer.parseInt(line.split(" ")[1]);
        return (x);
    }

    public int SetArmor() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./saves.txt"));
        String line = reader.readLine();
        while (!line.split(" ")[0].equals("ARMOR"))
            line = reader.readLine();
        int x = Integer.parseInt(line.split(" ")[1]);
        return (x);
    }

    public int SetDamage() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./saves.txt"));
        String line = reader.readLine();
        while (!line.split(" ")[0].equals("DAMAGE"))
            line = reader.readLine();
        int x = Integer.parseInt(line.split(" ")[1]);
        return (x);
    }
}
