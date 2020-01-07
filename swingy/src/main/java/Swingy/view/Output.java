package view;

public class Output {
    public void ChooseHero() {
        System.out.println("Create a character!");
        System.out.println("Select type:");
        System.out.println("1 - MAGE");
        System.out.println("2 - WARRIOR");
        System.out.println("3 - ORC");
        System.out.println("4 - HUMAN");
    };

    public void ChooseName() {
        System.out.println("What is the name of this new champion?");
    }

    public void Begin() {
        System.out.println("Welcome would you like to:");
        System.out.println("1 --> Start a new game!");
        System.out.println("2 --> Load a game!");
    }

    public void PrintMap(int[][] map) {
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                System.out.print(map[row][column] + "        ");
            }
            System.out.println("\n");
        }
    }

}
