package graphics;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.Font;

import java.util.ArrayList;
import java.util.Arrays;

import data.Word;
import graphics.*;


public class Display {
    private JFrame dictFrame;
    private JTextField txtSearch;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JTextField textField;
    private JTextField definitionField;
    private JTextField textFielda;
    private JTextField textFieldb;
    private JTextField textFieldc;

    
    

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