package model;
import java.io.*;
import view.*;

public class Hero {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    protected String Type;
    protected String Name;

    public Hero CreateHero() throws IOException {
        Output display = new Output();
        display.ChooseHero();
        String input = Reader.readLine();
        this.Type = HeroType[Integer.parseInt(input) - 1];
        display.ChooseName();
        this.Name = Reader.readLine();
        return(this);
    }

}