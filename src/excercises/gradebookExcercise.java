/*
Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers)
 instead of names and grades. In this case, however, the keys should be integers (the IDs)
  and the values should be strings (the names). Modify the roster printing code accordingly.
 */

package excercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gradebookExcercise {

    public static void main(String[] args) {
        HashMap<Integer, String> gradebook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int newStudentID;
        String newStudent;

        do {
            System.out.print("Student ID: ");
            newStudentID = in.nextInt();

            if(newStudentID != 0) {
                System.out.print("Student name: ");
                newStudent = in.next();

                gradebook.put(newStudentID, newStudent);

            }
        } while(newStudentID != 0);

        for (Map.Entry<Integer, String> student : gradebook.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }







    }
}
