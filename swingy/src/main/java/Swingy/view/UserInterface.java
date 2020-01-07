package view;
import javax.swing.*;
import java.awt.*;

public class UserInterface {
    // should handle the GUI view;
    public void GUserInterface() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            JFrame frame = new JFrame("Swingy");
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            };
        });
    };

}
