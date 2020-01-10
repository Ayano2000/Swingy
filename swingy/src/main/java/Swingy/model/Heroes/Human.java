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
        this.HP = 500;
        this.Armor = 30;
        this.Damage = 80;
    };

    // GET HP
    public int getHP() { return(this.HP); };
    // GET ARMOR
    public int getArmor() { return(this.Armor); };
    // GET DAMAGE
    public int getDamage() { return(this.Damage); };
}