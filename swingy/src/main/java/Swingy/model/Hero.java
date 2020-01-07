package model;
import java.io.*;
import view.*;

public abstract class Hero {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    protected String Type;
    protected String Name;

    // CONSTRUCTOR SETS ALL HEROES VARIABLES;
    public Hero (int type, String name) {
        this.Type = HeroType[type];
        this.Name = name;
    };
    // GET TYPE
    public String getType() { return(this.Type); };
    // GET NAME
    public String getName() { return(this.Name); };
    // GETTING ATTRIBUTES
    public abstract int getHP();
    public abstract int getArmor();
    public abstract int getDamage();
}