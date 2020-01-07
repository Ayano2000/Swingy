package controller;
import view.*;
import model.*;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private Hero Player;
    public void NewGame() throws IOException {
        Output display = new Output();
        Hero hero = new Hero();
        display.ChooseHero();
        String input = Reader.readLine();
        int HeroType = Integer.parseInt(input);
        display.ChooseName();
        String Name = Reader.readLine();
        Player = hero.CreateHero(HeroType, Name);
        System.out.println(Player);
    }
}
