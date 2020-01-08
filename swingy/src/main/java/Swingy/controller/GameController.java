package controller;
import view.*;
import model.*;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private static GenerateHero CreateHero = new GenerateHero();
    private static Preflight preflight = new Preflight();
    private Hero Player;
    protected int[][] World;

    public void Game(int type) throws IOException {
        if (type == 1 /* TYPE 1 == NEW GAME */) {
            Player = CreateHero.generateHero();
            World = preflight.PopulateMap(Player);
        } else {
            // TODO --> LOAD GAME
        };
        Map map = new Map(World);
        map.TraverseMap(World);


    }

}