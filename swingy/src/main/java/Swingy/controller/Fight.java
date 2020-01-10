package controller;
import model.*;
import view.*;
import java.util.Random;

public class Fight {
    protected Hero hero;
    protected Enemy enemy;

    public int Battle(Hero player, Enemy opponent) {
        this.hero = player;
        this.enemy = opponent;
        int HeroAttack = (this.hero.getDamage() - this.enemy.getArmor());
        int EnemyAttack = (this.enemy.getArmor() - this.hero.getDamage());
        int HeroHP = this.hero.getHP();
        int EnemyHP = this.enemy.getHP();
        while (HeroHP > 0 && EnemyHP > 0) {
            // HERO HITS FIRST
            EnemyHP = (EnemyHP - HeroAttack);
            if (EnemyHP <= 0)
                return (0);
            HeroHP = (HeroHP - EnemyAttack);
            if (HeroHP <= 0)
                return (1);
        };
        return (2);
    }
}