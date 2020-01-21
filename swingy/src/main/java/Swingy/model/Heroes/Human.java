package model;
import java.io.*;
import view.*;

public class Human extends Hero {
    protected int HP;
    protected int Armor;
    protected int Damage;
//    public List<Artifact> artifacts = new ArrayList<Artifact>();

    // SUB CONSTRUCTOR --> SEE model.Hero
    public Human(int type, String name) {
        super(type, name);
        this.HP = 200;
        this.Armor = 7;
        this.Damage = 15;
    };
    public void setHP(int val) {
        this.HP = val;
    };
    public void setDamage(int val) {
        this.Armor = val;
    };
    public void setArmor(int val) {
        this.Damage = val;
    };
    // GET HP
    public int getHP() { return(this.HP); };
    // GET ARMOR
    public int getArmor() { return(this.Armor); };
    // GET DAMAGE
    public int getDamage() { return(this.Damage); };
}