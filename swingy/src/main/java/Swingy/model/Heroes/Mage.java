package model;
import java.io.*;
import view.*;

public class Mage extends Hero {
    protected int HP;
    protected int Armor;
    protected int Damage;
//    public List<Artifact> artifacts = new ArrayList<Artifact>();

    // SUB CONSTRUCTOR --> SEE model.Hero
    public Mage(int type, String name) {
        super(type, name);
        this.HP = 250;
        this.Armor = 0;
        this.Damage = 125;
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
