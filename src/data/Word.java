package data;

import java.util.ArrayList;


public class Word {
    private String word;
    private ArrayList<String> definitions;
    private ArrayList<String> synonyms;
    private ArrayList<String> antonyms;

    public Word(String word, ArrayList<String> definitions, ArrayList<String> synonyms, ArrayList<String> antonyms) {
        this.word = word;
        this.definitions = definitions;
        this.synonyms = synonyms;
        this.antonyms = antonyms;
    }

    

    
}