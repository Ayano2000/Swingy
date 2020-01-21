package model;
import java.io.*;
import view.*;
import javax.validation.constraints.*;

public abstract class Hero {
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    public String Type;
    public String Name;
    public int Level = 1;
    public int XP = 0;

    // CONSTRUCTOR SETS ALL HEROES VARIABLES;
    public Hero (@NotNull int type, @NotNull String name) {
        this.Type = HeroType[type];
        this.Name = name;
    };
    // GET TYPE
    public String getType() { return(this.Type); };
    // GET XP
    public int getXP() { return(this.XP); };
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
    // SET LOAD LEVEL
    public void SetLevel(int val) { this.Level = val; };
    // GETTING ATTRIBUTES
    public abstract int getHP();
    public abstract int getArmor();
    public abstract int getDamage();
    public abstract void setDamage(int val);
    public abstract void setHP(int val);
    public abstract void setArmor(int val);
}