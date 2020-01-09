package view;
import model.*;

public class Output {
    // WHY THE FUCK DO I ALWATS DO THIS


    private static String ANSI_RESET = "\u001B[0m";
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_YELLOW = "\u001B[33m";

    private static String RESET = ANSI_RESET.replaceAll("\r", "").replaceAll("\n", "");
    private static String RED = ANSI_RED.replaceAll("\r", "").replaceAll("\n", "");
    private static String GREEN = ANSI_GREEN.replaceAll("\r", "").replaceAll("\n", "");
    private static String YELLOW = ANSI_YELLOW.replaceAll("\r", "").replaceAll("\n", "");

    public void ChooseHero() {
        System.out.flush();
        System.out.println("Create a character!");
        System.out.println("Select type:");
        System.out.println("1 - MAGE");
        System.out.println("2 - WARRIOR");
        System.out.println("3 - ORC");
        System.out.println("4 - HUMAN");
    };

    public void ChooseName() {
        System.out.flush();
        System.out.println("What is the name of this new champion?");
    }

    public void Begin() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Welcome would you like to:");
        System.out.println("1 --> Start a new game!");
        System.out.println("2 --> Load a game!");
    }

    public void PrintMap(int[][] map) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                if (map[row][column] == 1) {
                    System.out.print(GREEN + map[row][column] + RESET + "        ");
                } else if (map[row][column] == 2) {
                    System.out.print(RED + map[row][column] + RESET + "        ");
                } else {
                    System.out.print("0" + "        ");
                }
            }
            System.out.println("\n");
        }
    }

    public void PrintDirectionChoice() {
        System.out.println(YELLOW + "1 = NORTH | 2 = SOUTH | 3 = EAST | 4 = WEST" + RESET);
    }

    public void EnemyEncountered() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("It is in moments like these that a Hero is born");
        System.out.println("Would you like to:");
        System.out.println("1 - FIGHT");
        System.out.println("2 - Run");
    }

    public void RunAwayLittleBitch() {
        System.out.println("            _( }\n");
        System.out.println("   -=  _  <<  \\\n");
        System.out.println("      `.\\__/`/\\\\\n");
        System.out.println(" -=     '--'\\\\  `\n");
        System.out.println("      -=    //\n");
        System.out.println("            \\)");
    }

    public void ShowEnemy(Enemy enemy) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (enemy.getType() == "Skeleton") {
            System.out.println("      .-.\n" +
                    "     (o.o)\n" +
                    "      |=|\n" +
                    "     __|__\n" +
                    "   //.=|=.\\\\\n" +
                    "  // .=|=. \\\\\n" +
                    "  \\\\ .=|=. //\n" +
                    "   \\\\(_=_)//\n" +
                    "    (:| |:)\n" +
                    "     || ||\n" +
                    "     () ()\n" +
                    "     || ||\n" +
                    "     || ||\n" +
                    "    ==' '==");
        } else if (enemy.getType() == "Witch") {
            System.out.println(
                    "       * (     /      \\    ___\n" +
                    "          \"     \"        _/ /\n" +
                    "         (   *  )    ___/   |\n" +
                    "           )   \"     _ o)'-./__\n" +
                    "          *  _ )    (_, . $$$\n" +
                    "          (  )   __ __ 7_ $$$$\n" +
                    "           ( :  { _)  '---  $\\\n" +
                    "      ______'___//__\\   ____, \\\n" +
                    "       )           ( \\_/ _____\\_\n" +
                    "     .'             \\   \\------''.\n" +
                    "     |='           '=|  |         )\n" +
                    "     |               |  |  .    _/\n" +
                    "      \\    (. ) ,   /  /__I_____\\\n" +
                    "  snd  '._/_)_(\\__.'   (__,(__,_]\n" +
                    "      @---()_.'---@");
        } else if (enemy.getType() == "Dragon") {
            System.out.println("                \\||/\n" +
                    "                |  @___oo\n" +
                    "      /\\  /\\   / (__,,,,|\n" +
                    "     ) /^\\) ^\\/ _)\n" +
                    "     )   /^\\/   _)\n" +
                    "     )   _ /  / _)\n" +
                    " /\\  )/\\/ ||  | )_)\n" +
                    "<  >      |(,,) )__)\n" +
                    " ||      /    \\)___)\\\n" +
                    " | \\____(      )___) )___\n" +
                    "  \\______(_______;;; __;;;");
        } else if (enemy.getType() == "Steve") {
            System.out.println("      /:\"\"|" +
                    "     |: 66|_ " + "\n" +
                    "     C     _)" + "\n" +
                    "      \\ ._| " + "\n" +
                    "       ) /   " + "\n" +
                    "      /`\\\\ " + "\n" +
                    "     || |Y|  " + "\n" +
                    "     || |#|  " + "\n" +
                    "     || |#|  " + "\n" +
                    "     || |#|  " + "\n" +
                    "     :| |=:  " + "\n" +
                    "     ||_|,|  " + "\n" +
                    "     \\)))|| " + "\n" +
                    "  |~~~`-`~~~|" + "\n" +
                    "  |         |" + "\n" +
                    "  |_________|" + "\n" +
                    "  |_________|" + "\n" +
                    "      | ||   " + "\n" +
                    "      |_||__ " + "\n" +
                    "      (____)))" + "\n");
        }
    }



}
