package model;
import java.io.*;
import view.*;

public class Skeleton extends Enemy {
    protected int HP;
    protected int Armor;
    protected int Damage;
//    public List<Artifact> artifacts = new ArrayList<Artifact>();

    // SUB CONSTRUCTOR --> SEE model.Hero
    public Skeleton(Hero hero, String type) {
        super(hero, type);
        this.HP = 100 * hero.getLevel();
        this.Armor = 0 * hero.getLevel();
        this.Damage = 10 * hero.getLevel();
    };

    // GET HP
    public int getHP() { return(this.HP); };
    // GET ARMOR
    public int getArmor() { return(this.Armor); };
    // GET DAMAGE
    public int getDamage() { return(this.Damage); };
}