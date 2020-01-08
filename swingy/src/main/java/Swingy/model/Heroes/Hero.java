package model;
import java.io.*;
import view.*;

public abstract class Hero {
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    protected String Type;
    protected String Name;
    protected int Level = 1;

    // CONSTRUCTOR SETS ALL HEROES VARIABLES;
    public Hero (int type, String name) {
        this.Type = HeroType[type];
        this.Name = name;
    };
    // GET TYPE
    public String getType() { return(this.Type); };
    // GET NAME
    public String getName() { return(this.Name); };
    // GET LEVEL
    public int getLevel() { return(this.Level); };
    // SET LEVEL
    public int setLevel() {
        this.Level = this.Level + 1;
        return (this.Level);
    };
    // GETTING ATTRIBUTES
    public abstract int getHP();
    public abstract int getArmor();
    public abstract int getDamage();
}