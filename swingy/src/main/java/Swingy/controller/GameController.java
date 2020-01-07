package controller;
import view.*;
import java.io.*;

public class GameController {
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

    public void NewGame() throws IOException {
        Output display = new Output();
        display.ChooseHero();
        String input = Reader.readLine();
        System.out.println(input);
    }
}
