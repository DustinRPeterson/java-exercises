/* 3.1 Prep excercise 1
   Modify your "Hello, World" program to prompt the user for their name, and greet them by name.
 */


package excercises;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        name = in.next();

        System.out.println("Hello, " + name + '!');
    }
}
