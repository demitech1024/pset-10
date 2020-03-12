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
    private JTextField definitionText;
    private JTextField textFielda;
    private JTextField textFieldb;
    private JTextField textFieldc;


    

    public Display(Word[] words) {
        this.words = words;
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    initializeDisplay();
                }
            }
        });
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
        dictFrame = new JFrame();
        dictFrame.setResizable(false);
        dictFrame.setTitle("Michael's Dictionary");
        dictFrame.setBounds(100,100,800,600);
        dictFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dictFrame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(207,11,566,549);
        dictFrame.getContentPane().add(panel);
        panel.setLayout(new CardLayout(0,0));

        JScrollPane scrollPanec = new JScrollPane();
        panel.add(scrollPanec, "addWord");

        JPanel panel1 = new JPanel();
        panel1.setToolTipText("");
        panel1.setBackground(Color.WHITE);
        scrollPanec.setViewportView(panel1);
        panel1.setLayout(null);

        JLabel newLabel = new JLabel("Word*");
        newLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
        newLabel.setBounds(10, 11, 117, 54);
        panel1.add(newLabel);

        textField = new JTextField();
        textField.setToolTipText("word");
        textField.setBounds(20,76,286,20);
        panel1.add(textField);
        textField.setColumns(10);

        JButton addButton = new JButon("Add");
        addButton.setBounds(465,513,89,23);
        panel1.add(addButton);

        JLabel definitionLabel = new JLabel("Definitions");
        definitionLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
        definitionLabel.setBounds(10, 107, 199, 54);
        panel1.add(definitionLabel);

        definitionText = new JTextField();
        definitionText.setToolTipText("Definitions");
        definitionText.setColumns(10);
        definitionText.setBounds(20, 182, 286, 20);
        panel1.add(definitionText);

        textFieldb = new JTextField();
        textFieldb.setToolTipText("Part of Speech");
        textFieldb.setColumns(10);
        textFieldb.setBounds(346,182,147,20);
        panel1.add(textFieldb);



        
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