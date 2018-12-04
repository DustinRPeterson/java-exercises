/* Class 1 prep excercise 2
Write a program to calculate the area of a rectangle and print the answer to the console.
You should prompt the user for the dimensions
 */


package excercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner in = new Scanner(System.in);

        System.out.print("Please provide the length of the rectangle: ");
        length = in.nextInt();
        System.out.print("\nPlease provide the width of the rectangle: ");
        width = in.nextInt();

        area = length * width;
        System.out.println(String.format("\nThe area of the rectangle is %d.", area));
    }
}
