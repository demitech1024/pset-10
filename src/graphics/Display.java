package graphics;

import java.util.ArrayList;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Display {
    private JPanel rootPanel;
    private JButton button;

    public Display() {
        this.rootPanel = new JPanel();
        this.button = new JButton();
    }

    public static JFrame createFrame() {
        JFrame frame = new JFrame("Michael's Dictionary");
        frame.setContentPane(new Display().rootPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}