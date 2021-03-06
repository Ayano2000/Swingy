package controller;
import view.*;
import model.*;
import java.util.*;

public class Preflight {
    public int[][] PopulateMap(Hero hero) {
        int size = ((hero.getLevel() - 1) * 5 + 10 - (hero.getLevel() % 2));
        int map[][] = new int[size][size];
        // 1 == HERO, 2 == ENEMY, 3 == ARTIFACT, 4 == HIDDEN ENEMY;
        map[size / 2][size / 2] = 1;
        // SHIT CODE BUT WHATEVER IM SLEEPY;
        // ADDS ENEMY POSITION;
        for (int i = 0; i < (hero.getLevel() * 10); i++) {
            int row = new Random().nextInt(size);
            int column = new Random().nextInt(size);
            if ((row == 4 && column == 4) || map[row][column] != 0) { i--; }
            else {
                map[row][column] = 2;
            };
        };
        // ADDS ARTIFACTS FOR THE HREO TO FIND
        for (int i = 0; i <= hero.getLevel(); i++) {
            int row = new Random().nextInt(size);
            int column = new Random().nextInt(size);
            if ((row == 4 && column == 4) || map[row][column] != 0) { i--; }
            else {
                map[row][column] = 3;
            };
        };
        // ADDS HIDDEN ENEMIES;
        for (int i = 0; i <= (hero.getLevel() * 5); i++) {
            int row = new Random().nextInt(size);
            int column = new Random().nextInt(size);
            if ((row == 4 && column == 4) || map[row][column] != 0) { i--; }
            else {
                map[row][column] = 4;
            };
        };
        return (map);
    }
}
