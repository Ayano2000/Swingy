package controller;
import view.*;
import model.*;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private Hero Player;
    public void Game(int type) throws IOException {
        Output display = new Output();
        display.ChooseHero();
        String input = Reader.readLine();
        int HeroType = Integer.parseInt(input) - 1;
        display.ChooseName();
        String Name = Reader.readLine();
        if (HeroType == 0) {
            Player = new Mage(HeroType, Name);
        }
    }

}