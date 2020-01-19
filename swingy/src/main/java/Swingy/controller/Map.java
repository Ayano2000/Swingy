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

    public int TraverseMap(int[][] map) throws IOException {
        display.PrintMap(map);
        display.PrintDirectionChoice();
        while (true) {
            String input = Reader.readLine();
            while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4")) {
                input = Reader.readLine();
                if (input.equalsIgnoreCase("Exit")) {
                    GameData gameData = new GameData();
                    gameData.SaveGame();
                    System.exit(1);
                }
            }
            this.CurrentMove = Direction[Integer.parseInt(input) - 1];
            int EventChecker = UpdateHeroPosition();
            System.out.println(EventChecker);
            if (EventChecker == 0) {
                display.PrintMap(map);
                display.PrintDirectionChoice();
            } else if (EventChecker == 2) {
                display.EnemyEncountered();
                return (2);
            }
            else { return (1); };
            // NEED TO ADD AN EXIT CONDITION
            if (Integer.parseInt(input) - 1 == 5) break;
        };
        return (0);
    }

    public int UpdateHeroPosition() {
        int[] Position = new int[2];
        int size = this.MapInstance.length;
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (this.MapInstance[row][column] == 1) {
                    Position[0] = row;
                    Position[1] = column;
                    this.MapInstance[row][column] = 0;
                }
            }
        }
        switch(this.CurrentMove) {
            case "SOUTH":
                Position[0] = Position[0] + 1;
                Position[1] = Position[1];
                if (Position[0] == size) {
                    System.out.println(Position[0]);
                    System.out.println("LEVEL UP!");
                    return (1);
                }
                if (this.MapInstance[Position[0]][Position[1]] == 2) {
                    this.MapInstance[Position[0]][Position[1]] = 1;
                    return (2);
                }
                else { this.MapInstance[Position[0]][Position[1]] = 1; }
                break;
            case "EAST":
                Position[0] = Position[0];
                Position[1] = Position[1] + 1;
                if (Position[1] == size) {
                    System.out.println(Position[1]);
                    System.out.println("LEVEL UP!");
                    return (1);
                }
                if (this.MapInstance[Position[0]][Position[1]] == 2) {
                    this.MapInstance[Position[0]][Position[1]] = 1;
                    return (2);
                }
                else { this.MapInstance[Position[0]][Position[1]] = 1; }
                break;
            case "WEST":
                Position[0] = Position[0];
                Position[1] = Position[1] - 1;
                if (Position[1] == size || Position[1] == -1) {
                    System.out.println(Position[1]);
                    System.out.println("LEVEL UP!");
                    return (1);
                }
                if (this.MapInstance[Position[0]][Position[1]] == 2) {
                    this.MapInstance[Position[0]][Position[1]] = 1;
                    return (2);
                }
                else { this.MapInstance[Position[0]][Position[1]] = 1; }
                break;
            default:
                Position[0] = Position[0] - 1;
                Position[1] = Position[1];
                if (Position[0] == size || Position[0] == -1) {
                    System.out.println(Position[0]);
                    return (1);
                }
                if (this.MapInstance[Position[0]][Position[1]] == 2) {
                    this.MapInstance[Position[0]][Position[1]] = 1;
                    return (2);
                }
                else { this.MapInstance[Position[0]][Position[1]] = 1; }
        }
        return (0);
    }
}