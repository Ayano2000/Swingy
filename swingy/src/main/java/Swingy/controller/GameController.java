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
        while (Player.getLevel() <= 5) {
            Map map = new Map(World);
            if (map.TraverseMap(World) == 1) {
                Player.setLevel();
                System.out.println("Congratulations you leveled up!");
                World = preflight.PopulateMap(Player);
                map = new Map(World);
            } else if (map.TraverseMap(World) == 2) {
                int choice = Integer.parseInt(Reader.readLine());
                if (choice == 1) {
                    //FIGHT
                    System.out.println("FIGHT ME (ง •̀_•́)ง");
                }
            }

        }



    }

}