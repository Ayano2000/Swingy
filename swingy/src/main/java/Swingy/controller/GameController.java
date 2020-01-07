package controller;
import view.*;
import java.io.*;

public class GameController {
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    public void NewGame() throws IOException {
        try {
            BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
            Output display = new Output();
            display.ChooseHero();
            String input = Reader.readLine();
            System.out.println(input);
        } catch (IOException e) {
            System.out.println("Error reading input!");
        }
    }
}
