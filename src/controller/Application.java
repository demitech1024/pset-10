package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import java.util.ArrayList;

import javax.swing.*;
import graphics.Display;

public class Application {
    public static void main(String[] args) {
        BufferedReader jsonFile = null;
        try {
            jsonFile = new BufferedReader(new FileReader("../data/words.json"));
        } catch (Exception IOException) {
            System.out.println("Could not find words.json file.");
        }

        

        JFrame frame = Display.createFrame();
        frame.pack();
        frame.setVisible(true);
    }
}