package controller;
import view.*;
import model.*;
import java.io.*;

public class Map {
    private Output display = new Output();
    protected int[][] MapInstance;
    private String[] Enemies = { "SKELETON", "ELF", "DRAGON", "STEVE" };
    private String[] Direction = { "NORTH", "SOUTH", "EAST", "WEST" };

    public Map(int[][] map) {
        this.MapInstance = map;
    }
    // VOID?????????????????
    public void TraverseMap(int[][] map) {
        display.PrintMap(map);
        display.PrintDirectionChoice();
    }




}

