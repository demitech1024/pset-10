package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import javax.swing.*;

import java.util.Arrays;

import graphics.Display;
import data.Word;

public class Application {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        BufferedReader jsonFile = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/lib/words.json"));
        Word[] words = gson.fromJson(jsonFile, Word[].class);
        

        // JFrame frame = Display.createFrame();
        // frame.pack();
        // frame.setVisible(true);
    }
}