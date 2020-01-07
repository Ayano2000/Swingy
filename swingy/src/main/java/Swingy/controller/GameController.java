package controller;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    public void NewGame() {
        System.out.println("Create a character!");
        System.out.println("Select type:");
        System.out.println("1 - MAGE");
        System.out.println("2 - WARRIOR");
        System.out.println("3 - ORC");
        System.out.println("4 - HUMAN");

    }
}
