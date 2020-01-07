package controller;
import view.*;
import model.*;
import java.io.*;

public class GameController {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private Hero Player;
    public Hero Game(int type) throws IOException {
        Output display = new Output();
        display.ChooseHero();
        String input = Reader.readLine();
        int HeroType = Integer.parseInt(input) - 1;
        display.ChooseName();
        String Name = Reader.readLine();
        switch(HeroType) {
            case 1:
                Player = new Mage(HeroType, Name);
                break;
            case 2:
                Player = new Warrior(HeroType, Name);
                break;
            case 3:
                Player = new Orc(HeroType, Name);
                break;
            default:
                Player = new Human(HeroType, Name);
        }
    }

}