package graphics;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

import data.Word;
import graphics.*;


public class Display extends JFrame implements ListSelectionListener, DocumentListener {
    private static final long serialVersionUID = 1L;
    
    private Word[] displayWords;
    private JScrollPane tbScrollPane;
    private JScrollPane winScrollPane;
    private String selection = null;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private Toolbar toolbar;
    private Window window;
    private JList wordsList;
    private JButton button;
    private JButton addButton;
    private JButton removeButton;
    private JButton ascButton;
    private JButton descButton;

    public Display(Word[] words) {
        this.words = words;
        initializeDisplay();
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JButton getAscButton() {
        return ascButton;
    }

    public JButton getDescButton() {
        return descButton;
    }

    public Window getWindow() {
        return window;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String newSelection) {
        this.selection = newSelection;
    }

    public Word[] getDisplayWords() {
        return displayWords;
    }

    public Word[] setDisplayWords(Word[] words) {
        this.displayWords = words;
    }

    public void initializeDisplay() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Michael's Dictionary");
        setLayout(new BorderLayout());
        
        makeToolbar(words);
        makeWindow();
        
        setSize(screenSize.width / 2, screenSize.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }

    public void makeToolbar(Word[] words) {
        
    }

    public void makeWindow() {
        
    }
}