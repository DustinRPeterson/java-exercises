/* Class 1 prep excercise 4
The first sentence of Alice's Adventures in Wonderland is below.
Store this sentence in a string, and then prompt the user for a term to search for within this string.
Print whether or not the search term was found.
See if you can make the search case-insensitive, so that searching for "alice", for example, prints true.
 */

package excercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        String searchFor;
        Scanner in = new Scanner(System.in);
        Boolean containsText;

        System.out.print("What word do you want to search for? ");
        searchFor = in.next();




        containsText = searchStrings(alice, searchFor);

        if(containsText) {
            System.out.println("\nThe word " + searchFor + " is in the string.");
        }
        else {
            System.out.println("\nThe word " + searchFor + " is not in the string.");
        }


    }


    //Search function to search through Alice case insensitive.  This prevents the strings from being changed in the
    //main function
    public static Boolean searchStrings(String str1, String str2) {
        String search1 = str1.toLowerCase();
        String search2 = str2.toLowerCase();

        search1.toLowerCase();
        search2.toLowerCase();
        Boolean isMatched;

        isMatched = search1.contains(search2);

        return isMatched;

    }
}
