package controller;

import java.io.*;
import java.util.*;

import java.util.Arrays;
import com.google.gson.*;
import java.awt.*;



import data.Word;

public class Utils {

    public void updateJsonFile(Word[] words) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter(System.getProperty("user.dir") + "/lib/words.json")) {
            gson.toJson(words, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Word[] readJsonFile() throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader jsonFile = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/lib/words.json"));
        Word[] words = gson.fromJson(jsonFile, Word[].class);
        
        return words;
    }

    public static Word[] addWord(Word[] words, Word addMe) {
        Word[] updatedWords = new Word[words.length + 1];

        int index = 0;
        for (Word iterate : words) {
            updatedWords[index] = iterate;
            index++;
        }
        updatedWords[index] = addMe;
        
        return updatedWords;
    }

    public static Word[] removeWord(Word[] words, Word removeMe) {
        Word[] updatedWords = new Word[words.length - 1];

        int index = 0;
        for (Word word : words) {
            if (!(word.getWord().equals(removeMe.getWord()))) {
                updatedWords[index] = word;
                index++;
            }
        }

        return updatedWords;
    }

    public static Word[] sort(String type, Word[] words) {

        Arrays.sort(words, (a, b) -> a.getWord().compareTo(b.getWord()));

        if (type.equals("desc")) {
            Word[] reverse = new Word[words.length];
            for (int i = words.length - 1; i >= 0; i--) {
                reverse[words.length - (i + 1)] = words[i];
            }

            words = reverse;
        }

        return words;
    }

    public static String[] onlyWords(Word[] words) {
        String[] onlyWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            onlyWords[i] = words[i].getWord();
        }
        return onlyWords;
    }

}