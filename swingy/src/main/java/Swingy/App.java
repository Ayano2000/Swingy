package Swingy;
import view.*;
import controller.*;
import java.io.*;
import javax.swing.*;

public class App {
    private static UserInterface UI = new UserInterface();
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main( String[] args ) throws IOException {
        try {
            GameController gamecontroller = new GameController();
            Output display = new Output();
            display.Begin();
            String choice = Reader.readLine();
            gamecontroller.Game(Integer.parseInt(choice));
        } catch (IOException e) {
            System.out.println("Error reading input!");
        }
    }
}
