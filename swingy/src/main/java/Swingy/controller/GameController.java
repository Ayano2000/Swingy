package controller;
import view.*;
import model.*;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private static GenerateHero CreateHero = new GenerateHero();
    private static Preflight preflight = new Preflight();
    private Hero Player;
    protected int[][] Map = new int[9][9];

    public void Game(int type) throws IOException {
        if (type == 1 /* TYPE 1 == NEW GAME */) {
            Player = CreateHero.generateHero();
            Map = preflight.PopulateMap(Map, Player);
        };
        // NEED TO PUT HEROES INTO ITS OWN FOLDER,
        // NEED TO CREATE THE ENEMIES.
    }

}