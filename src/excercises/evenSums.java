/*
Write a static method to find the sum of all the even numbers in a list.
 Within main, create a list with at least 10 integers and call your method on the list.
 */

package excercises;

import java.util.ArrayList;

public class evenSums {

    public static void addEvens(ArrayList<Integer> numbers) {

        int sumOfEvens = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int nextNumber = numbers.get(i);
            if(nextNumber % 2 == 0) {
                sumOfEvens += nextNumber;
            }
        }

        System.out.println(String.format("The sum of the even numbers from the list is %d", sumOfEvens));

    }

    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(2);
        numbersList.add(7);
        numbersList.add(4);
        numbersList.add(6);
        numbersList.add(9);
        numbersList.add(11);
        numbersList.add(18);

        addEvens(numbersList);

    }



}
