package model;
import java.io.*;
import view.*;

public abstract class Hero {
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    protected String Type;
    protected String Name;
    protected int Level = 1;
    protected int XP = 0;

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
    public int setLevel(int xp) {
        this.XP = this.XP + xp;
        if (this.Level == 1 ) {
            if (this.XP > 1000) {
                this.Level = 2;
                return 1;
            }
        } else if (this.Level == 2 ) {
            if (this.XP > 2450) {
                this.Level = 3;
                return 1;
            }
        } else if (this.Level == 3 ) {
            if (this.XP > 4000) {
                this.Level = 4;
                return 1;
            }
        } else if (this.Level == 4 ) {
            if (this.XP > 8050) {
                this.Level = 5;
                return 1;
            }
        } else if (this.Level == 5 ) {
            if (this.XP > 12200) {
                this.Level = 6;
                return 1;
            }
        }
        return (2);
    };
    // GETTING ATTRIBUTES
    public abstract int getHP();
    public abstract int getArmor();
    public abstract int getDamage();
    public abstract void setDamage(int val);
    public abstract void setHP(int val);
    public abstract void setArmor(int val);
}