package model;
import view.*;
import controller.*;
import java.io.*;
import java.util.Random;

public class GenerateEnemy {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private String[] EnemyType = { "SKELETON", "WITCH", "DRAGON", "STEVE" };

    public Enemy generateEnemy(Hero hero) throws IOException {
        Enemy enemy = null;
        Output display = new Output();
        int EnemyType = new Random().nextInt(4) - 1;
        switch(EnemyType) {
            case 0:
                enemy = new Skeleton(hero, "Skeleton");
                break;
            case 1:
                enemy = new Witch(hero, "Witch");
                break;
            case 2:
                enemy = new Dragon(hero, "Dragon");
                break;
            default:
                enemy = new Steve(hero, "Steve");
        }
        return (enemy);
    }
}