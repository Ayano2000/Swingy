package controller;
import model.*;
import view.*;
import java.util.*;

public class Fight {
    private String[] pos_artifact = {"HELM", "WEAPON", "ARMOR"};
    protected Hero hero;
    protected Enemy enemy;

    public int Battle(Hero player, Enemy opponent) {
        this.hero = player;
        this.enemy = opponent;
        int HeroAttack = (this.hero.getDamage() - this.enemy.getArmor());
        int EnemyAttack = (this.enemy.getDamage() - this.hero.getArmor());
        int HeroHP = this.hero.getHP();
        int EnemyHP = this.enemy.getHP();
        while (HeroHP > 0 && EnemyHP > 0) {
            // HERO HITS FIRST
            EnemyHP = (EnemyHP - HeroAttack);
            if (EnemyHP <= 0) {
                int drop = new Random().nextInt(10);
                if (drop >= 5) {
                    int rand = new Random().nextInt(3);
                    String ArtifactType = pos_artifact[rand];
                    switch (ArtifactType) {
                        case "HELM":
                            this.hero.setArmor(5);
                            break;
                        case "WEAPON":
                            this.hero.setDamage(5);
                            break;
                        default:
                            this.hero.setHP(5);
                    }
                }
                player.setLevel(250 * player.getLevel());
                return (0);
            }
            HeroHP = (HeroHP - EnemyAttack);
            if (HeroHP <= 0)
                return (1);
        };
        return (2);
    }
}

/*
• Weapon - increases the attack
• Armor - increases defense
• Helm - increases hit points
*/