package controller;
import view.*;
import model.*;
import java.io.*;
import java.util.*;
import java.lang.*;


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
        while (Player.getLevel() < 6) {
            if (resultant == 2) {
                int choice = Integer.parseInt(Reader.readLine());
                if (choice == 1) {
//                    FIGHT
                    enemy = CreateEnemy.generateEnemy(this.Player);
                    display.ShowEnemy(enemy);
                    String confirm = Reader.readLine();
                    if (confirm != null) {
                        Fight fight = new Fight();
                        if (fight.Battle(this.Player, enemy) == 1) {
                            // YOU WON
                            display.BattleWon(enemy.getType());
                            String Continue = Reader.readLine();
                            if (Continue != null) {
                                resultant = -1;
                            }
                            // press any key to confirm
                        } else if (fight.Battle(this.Player, enemy) == 0) {
                            display.GameOver(enemy.getType());
                            String exit = Reader.readLine();
                            if (exit != null) {
                                System.exit(0);
                            } else {
                                display.GameOver(enemy.getType());
                            }
                        }
                    }
                } else {
//                    RUN
                    display.RunAwayLittleBitch();
//                    resultant = -1;
                }
            } else {
                resultant = map.TraverseMap(World);
                if (resultant == 1) {
                    World = preflight.PopulateMap(Player);
                    map = new Map(World);
                } else {
                    Player.setLevel(1);
                    World = preflight.PopulateMap(Player);
                    map = new Map(World);
                }
            }

        }
    }
}