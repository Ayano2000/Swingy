package controller;
import view.*;
import model.*;
import java.util.*;

public class Preflight {
    public int[][] PopulateMap(int[][] map, Hero hero) {
        // 1 == HERO, 2 == ENEMY, 3 == ARTIFACT;
        map[4][4] = 1;
        // SHIT CODE BUT WHATEVER IM SLEEPY;
        // ADDS ENEMY POSITION;
        for (int i = 0; i < (hero.getLevel() * 5); i++) {
            int row = new Random().nextInt(9);
            int column = new Random().nextInt(9);
            if (row == 4 && column == 4) { i--; }
            else {
                map[row][column] = 2;
            };
        };
        // ADDS ARTIFACTS FOR THE HREO TO FIND
        for (int i = 0; i <= hero.getLevel(); i++) {
            int row = new Random().nextInt(9);
            int column = new Random().nextInt(9);
            if (row == 4 && column == 4) { i--; }
            else {
                map[row][column] = 3;
            };
        };
        return (map);
    }

}
