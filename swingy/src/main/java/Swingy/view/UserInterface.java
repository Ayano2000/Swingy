package view;
import javax.swing.*;

public class UserInterface {
    public void GUserInterface() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new InterfacePage("Swingy");
                frame.setSize(1000, 1000);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            };
        });
    };
}

