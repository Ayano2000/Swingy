package controller;
import view.*;
import model.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.String;


public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private static GenerateHero CreateHero = new GenerateHero();
    private static GenerateEnemy CreateEnemy = new GenerateEnemy();
    private static Preflight preflight = new Preflight();
    private static Output display = new Output();
    protected Hero Player;
    private Enemy enemy;
    protected int[][] World;

    public void Game(int type) throws IOException {
        if (type == 1) {
            Player = CreateHero.generateHero();
            World = preflight.PopulateMap(Player);
        } else {
            GameData gameData = new GameData();
            this.Player = gameData.LoadGame();
            this.Player.setHP(gameData.SetHp());
            this.Player.setArmor(gameData.SetArmor());
            this.Player.setDamage(gameData.SetDamage());
            World = gameData.GetMap();
        };
        Map map = new Map(this.Player, World);
        int resultant = -1;
        while (Player.getLevel() < 6) {
            if (resultant == 2) {
                String choice = Reader.readLine();
                System.out.println("");
                if (choice.equals("1")) {
                    enemy = CreateEnemy.generateEnemy(this.Player);
                    display.ShowEnemy(enemy);
                    String confirm = Reader.readLine();
                    if (confirm != null) {
                        Fight fight = new Fight();
                        if (fight.Battle(this.Player, enemy) == 0) {
                            display.BattleWon(enemy.getType());
                            String Continue = Reader.readLine();
                            if (Continue != null) {
                                resultant = -1;
                            }
                        } else if (fight.Battle(this.Player, enemy) == 1) {
                            display.GameOver(enemy.getType());
                            String exit = Reader.readLine();
                            if (exit != null) {
                                System.exit(0);
                            } else {
                                display.GameOver(enemy.getType());
                            }
                        }
                    }
                } else if (choice.equals("2")){
                    display.RunAwayLittleBitch();
                }
                else {
                    choice = Reader.readLine();
                }
            } else {
                resultant = map.TraverseMap(World);
                if (resultant == 1) {
                    World = preflight.PopulateMap(Player);
                    map = new Map(this.Player, World);
                } else {
                    Player.setLevel(1);
                    World = preflight.PopulateMap(Player);
                    map = new Map(this.Player, World);
                }
            }

        }
    }
}