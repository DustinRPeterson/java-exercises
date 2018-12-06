/*
Write a static method to print out each word in a list that has exactly 5 letters.
 */

package excercises;

import java.util.ArrayList;

public class letterCount {

    public static void checkWords(ArrayList<String> wordList) {

        for(int i = 0; i < wordList.size(); i++) {
            String wordToCheck = wordList.get(i);
            if (wordToCheck.length() == 5) {
                System.out.println(wordToCheck);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("Five");
        wordList.add("Four");
        wordList.add("Apple");
        wordList.add("Tree");
        wordList.add("Trees");

        checkWords(wordList);


    }

}
