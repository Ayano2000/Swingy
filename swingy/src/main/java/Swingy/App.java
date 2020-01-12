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
            while (!choice.equals("1") && !choice.equals("2")) {
                System.out.println("Your choices are:\n" +
                        "1 - Start a new game\n" +
                        "2 - Load a game\n");
                choice = Reader.readLine();
            }
            gamecontroller.Game(Integer.parseInt(choice));
        } catch (IOException e) {
            System.out.println("Error reading input!");
        }
    }
}
