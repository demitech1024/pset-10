package graphics;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import data.Word;


public class Display extends JFrame implements ListSelectionListener, DocumentListener {
    private static final long serialVersionUID = 1L;
    
    private JPanel rootPanel;
    private Word[] words;
    private JScrollPane tbScrollPane;
    private JScrollPane winScrollPane;
    private String selection = null;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private JList wordsList;
    private JButton button;
    private JButton addButton;
    private JButton removeButton;
    private JButton ascButton;
    private JButton descButton;

    public Display(Word[] words) {
        this.words = words;
        this.rootPanel = new JPanel();
        this.button = new JButton();

    }

    public JFrame createFrame() {
        JFrame frame = new JFrame("Michael's Dictionary");
        frame.setContentPane(rootPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public void initializeDisplay() {
        
    }
}