package controller;
import view.*;
import model.*;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private static GenerateHero CreateHero = new GenerateHero();
    private Hero Player;
    public void Game(int type) throws IOException {
        if (type == 0) {
            Player = CreateHero.generateHero();
        }
    }

}