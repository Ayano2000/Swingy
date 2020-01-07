package view;
import javax.swing.*;
import java.awt.*;

public class InterfacePage extends JFrame {
    public InterfacePage(String title) {
        super(title);
        // SET LAYOUT BORDER
        setLayout(new BorderLayout());

        // CREATE A SWING COMPONENT
        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Swing!");

        // ADD SWING COMPONENTS TO CONTENT PLANE
        Container ContentPlane = getContentPane();
        ContentPlane.add(textArea, BorderLayout.CENTER);
        ContentPlane.add(button, BorderLayout.SOUTH);
    }
};
