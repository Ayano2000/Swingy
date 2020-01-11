package model;
import java.io.*;
import view.*;

public class Warrior extends Hero {
    protected int HP;
    protected int Armor;
    protected int Damage;
//    public List<Artifact> artifacts = new ArrayList<Artifact>();

    // SUB CONSTRUCTOR --> SEE model.Hero
    public Warrior(int type, String name) {
        super(type, name);
        this.HP = 500;
        this.Armor = 80;
        this.Damage = 175;
    };
    public void setHP(int val) {
        this.HP = this.HP + val;
    };
    public void setDamage(int val) {
        this.Damage = this.Damage + val;
    };
    public void setArmor(int val) {
        this.Armor = this.Armor + val;
    };
    // GET HP
    public int getHP() { return(this.HP); };
    // GET ARMOR
    public int getArmor() { return(this.Armor); };
    // GET DAMAGE
    public int getDamage() { return(this.Damage); };
}