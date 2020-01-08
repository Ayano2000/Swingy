package controller;
import view.*;
import model.*;
import java.io.*;

public class Map {
    private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
    private String[] Enemies = { "SKELETON", "ELF", "DRAGON", "STEVE" };
    private String[] Direction = { "NORTH", "SOUTH", "EAST", "WEST" };
    private String CurrentMove;
    private Output display = new Output();
    protected int[][] MapInstance;

    public Map(int[][] map) {
        this.MapInstance = map;
    }

    public void TraverseMap(int[][] map) throws IOException {
        display.PrintMap(map);
        display.PrintDirectionChoice();
        while (true) {
            String input = Reader.readLine();
            this.CurrentMove = Direction[Integer.parseInt(input) - 1];
            UpdateHeroPosition();
            display.PrintMap(map);
            // NEED TO ADD AN EXIT CONDITION
            if (Integer.parseInt(input) - 1 == 5) break;
        };
    }

    public void UpdateHeroPosition() {
        int[] Position = new int[2];
        for (int row = 0; row < this.MapInstance.length; row++) {
            for (int column = 0; column < this.MapInstance[row].length; column++) {
                if (this.MapInstance[row][column] == 1) {
                    Position[0] = row;
                    Position[1] = column;
                    this.MapInstance[row][column] = 0;
                }
            }
        }
        System.out.println(this.CurrentMove);
        switch(this.CurrentMove) {
            case "SOUTH":
                Position[0] = Position[0] + 1;
                Position[1] = Position[1];
                this.MapInstance[Position[0]][Position[1]] = 1;
                break;
            case "EAST":
                Position[0] = Position[0];
                Position[1] = Position[1] + 1;
                this.MapInstance[Position[0]][Position[1]] = 1;
                break;
            case "WEST":
                Position[0] = Position[0];
                Position[1] = Position[1] - 1;
                this.MapInstance[Position[0]][Position[1]] = 1;
                break;
            default:
                Position[0] = Position[0] - 1;
                Position[1] = Position[1];
                this.MapInstance[Position[0]][Position[1]] = 1;
        }
    }
}