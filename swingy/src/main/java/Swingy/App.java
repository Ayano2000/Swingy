package Swingy;
import view.*;
import controller.*;
import java.io.*;
import javax.swing.*;

public class App {
    private static UserInterface UI = new UserInterface();

    public static void main( String[] args ) throws IOException {
        try {
            GameController gamecontroller = new GameController();
            gamecontroller.NewGame();
        } catch (IOException e) {
            System.out.println("Error reading input!");
        }
    }
}
