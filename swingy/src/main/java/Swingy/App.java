package Swingy;
import view.*;
import controller.*;
import javax.swing.*;

public class App 
{
    private static UserInterface UI = new UserInterface();

    public static void main( String[] args ) {
        GameController gamecontroller = new GameController();
        gamecontroller.NewGame();
    }
}
