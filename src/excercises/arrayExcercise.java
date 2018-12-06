/*
Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
Then loop through the array and print out each value.
 */

package excercises;

public class arrayExcercise {

    public static void main(String[] args) {
        int[] numbers = {1,1,2,3,5,8};

        int arrayLength = numbers.length;

        for(int i = 0; i < arrayLength; i++) {
            System.out.println(numbers[i]);
        }

    }
}
