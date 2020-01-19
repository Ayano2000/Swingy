package controller;
import model.*;
import view.*;
import java.io.*;
import java.io.File;

public class GameData {

    public void SaveGame() throws IOException {
        PrintWriter printWriter = new PrintWriter(new File("./saves.txt"));
        printWriter.println("SHIT2");
        printWriter.close();
    }
}