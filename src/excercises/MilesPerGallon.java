/*Class 1 prep excercise 3
 Write a program that asks a user for the number of miles they have driven and
 the amount of gas they've consumed (in gallons), and print their miles-per-gallon.
 */

package excercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double milesDriven;
        double gasUsed;
        double milesPerGallon;
        Scanner in = new Scanner(System.in);

        System.out.print("Please provide the number of miles driven: ");
        milesDriven = in.nextDouble();
        System.out.print("\nPlease provide the amount of gas consumed(in gallons): ");
        gasUsed = in.nextDouble();

        milesPerGallon = milesDriven / gasUsed;

        System.out.println(String.format("\nYou are getting %f miles per gallon.", milesPerGallon));

    }
}
