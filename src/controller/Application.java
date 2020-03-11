package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.*;
// import com.google.gson.JsonIOException;
// import com.google.gson.JsonSyntaxException;

import javax.swing.*;

import java.util.Arrays;

import graphics.Display;
import data.Word;
import controller.Utils;

public class Application {
    public static void main(String[] args) throws IOException {

        Word[] words = Utils.readJsonFile();
        words = Utils.sort("asc", words);
        
        
        

        // JFrame frame = Display.createFrame();
        // frame.pack();
        // frame.setVisible(true);
    }


}