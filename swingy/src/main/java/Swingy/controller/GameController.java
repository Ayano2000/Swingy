package controller;
import view.*;
import model.*;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private Hero Player;
    public void Game(int type) throws IOException {
        if (type == 1) {
            Hero newHero = new Hero();
            Player = newHero.CreateHero();
            System.out.println("PLAYERR  ->  " + Player.name);
        }
    }

}