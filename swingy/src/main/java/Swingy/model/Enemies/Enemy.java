package model;
import java.io.*;
import view.*;
import java.util.Random;

public abstract class Enemy {
    protected String Type;
    protected int Level;
    protected boolean artifact;

    // CONSTRUCTOR SETS ALL HEROES VARIABLES;
    public Enemy (Hero hero, String type) {
        this.Type = type;
        this.Level = hero.getLevel();
    };

    // GET TYPE
    public String getType() { return(this.Type); };
    // GET LEVEL
    public int getLevel() { return(this.Level); };
    // GETTING ATTRIBUTES
    public abstract int getHP();
    public abstract int getArmor();
    public abstract int getDamage();
//    public abstract int getArtifact();

}