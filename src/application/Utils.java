package application;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import data.Words;
import data.Definitions;
import application.Dictionary;

public class Utils {
//    Returns the classpath for json file
    public static String getPresentDir() {
      String presentDir = System.getProperty("user.dir");
        
      return presentDir + "/lib/";
    }

    public static DefaultListModel<String> sortWordsAsc(DefaultListModel<String> listOfWords) {
      String temp;
      int n = listOfWords.getSize();
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          if ((listOfWords.get(i).compareTo(listOfWords.get(j)) > 0)) {
            temp = listOfWords.get(i);
            listOfWords.set(i, listOfWords.get(j));
            listOfWords.set(j, temp);
          }
        }
      }
      return listOfWords;
    }

//    Reverse the order of a DLM
    public static DefaultListModel<String> reverseOrder(DefaultListModel<String> words) {
      DefaultListModel<String> b = new DefaultListModel<String>();
      int n = words.getSize();
      int j = n;
      for (int i = 0; i < n; i++) {
        b.addElement(words.get(j-1));
        j = j - 1;
      }
      return b;
    }
    
    public static ArrayList<Words> reverseOrderArrayList(ArrayList<Words> words) {
        ArrayList<Words> b = new ArrayList<Words>();
        int n = words.size();
        int j = n;
        for (int i = 0; i < n; i++) {
          b.add(words.get(j-1));
          j = j - 1;
        }
        return b;
      }

}
