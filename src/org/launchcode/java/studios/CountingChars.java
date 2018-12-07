/*
Class 2 studio.
Write a program that calculates the number of times each character occurs in a string and prints these counts to the console.
Completed with below Bonus additions:
Make the counts case-insensitive
Exclude non-alphabetic characters
Get the string as input from the user at the command line
 */

package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Please provide a string to count the characters for: ");
        String theString = in.nextLine();

        HashMap<Character, Integer> countedChars = new HashMap<>();

        for(int i = 0; i<theString.length(); i++) {
            char currentChar = theString.charAt(i);


            if (Character.isLetter(currentChar)) {
                currentChar = Character.toLowerCase(currentChar);

                if (!countedChars.containsKey(currentChar)) {
                    countedChars.put(currentChar, 1);
                } else {
                    int currentCount = countedChars.get(currentChar);
                    currentCount++;
                    countedChars.replace(currentChar, currentCount);
                }
            }
        }

        for (Map.Entry<Character, Integer> totalCount : countedChars.entrySet()) {
            System.out.println(totalCount.getKey() + " (" + totalCount.getValue() + ")");
        }
    }
}
