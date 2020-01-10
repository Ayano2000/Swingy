package controller;
import view.*;
import model.*;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private static GenerateHero CreateHero = new GenerateHero();
    private static GenerateEnemy CreateEnemy = new GenerateEnemy();
    private static Preflight preflight = new Preflight();
    private static Output display = new Output();
    private Hero Player;
    private Enemy enemy;
    protected int[][] World;

    public void Game(int type) throws IOException {
        if (type == 1 /* TYPE 1 == NEW GAME */) {
            Player = CreateHero.generateHero();
            World = preflight.PopulateMap(Player);
        } else {
            // TODO --> LOAD GAME
        };
        Map map = new Map(World);
        int resultant = -1;
        while (Player.getLevel() <= 5) {
            if (resultant == 2) {
                int choice = Integer.parseInt(Reader.readLine());
                if (choice == 1) {
//                    FIGHT
                    enemy = CreateEnemy.generateEnemy(this.Player);
                    display.ShowEnemy(enemy);
                    Fight fight = new Fight();
                    if (fight.Battle(this.Player, enemy) == 1) {

                        //resultant = map.TraverseMap(World);
                    } else if (fight.Battle(this.Player, enemy) == 0) {
                        display.GameOver(enemy.getType());
                    }
                } else {
//                    RUN
                    display.RunAwayLittleBitch();
//                    resultant = -1;
                }
            } else {
                resultant = map.TraverseMap(World);
                if (resultant == 1) {
                    Player.setLevel();
                    System.out.println("Congratulations you leveled up!");
                    World = preflight.PopulateMap(Player);
                    map = new Map(World);
                }
            }

        }
    }
}