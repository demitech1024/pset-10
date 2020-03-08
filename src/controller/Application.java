package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import java.util.ArrayList;

import javax.swing.*;
import graphics.Display;

public class Application {
    public static void main(String[] args) throws IOException {
                
        BufferedReader jsonFile = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/data/words.json"));

        

        // JFrame frame = Display.createFrame();
        // frame.pack();
        // frame.setVisible(true);
    }
}