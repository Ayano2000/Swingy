package model;
import view.*;
import controller.*;
import java.io.*;

public class GenerateHero {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    public Hero generateHero() throws IOException {
        Hero UserHero = null;
        Output display = new Output();
        display.ChooseHero();
        String input = Reader.readLine();
        int HeroType = Integer.parseInt(input) - 1;
        display.ChooseName();
        String Name = Reader.readLine();
        switch(HeroType) {
            case 1:
                UserHero = new Mage(HeroType, Name);
                break;
            case 2:
                UserHero = new Warrior(HeroType, Name);
                break;
            case 3:
                UserHero = new Orc(HeroType, Name);
                break;
            default:
                UserHero = new Human(HeroType, Name);
        }
        return (UserHero);
    }
}
