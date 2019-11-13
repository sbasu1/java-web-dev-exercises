package org.launchcode.java.demos.Chapter3;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;



public class HashmapPractice {public static void main(String[] args) {

    HashMap<String, String> students = new HashMap<>();
    Scanner input = new Scanner(System.in);
    String newStudent;

    System.out.println("Enter your students (or ENTER to finish):");

    do {

        System.out.print("Id: ");
        newStudent = input.nextLine();

        if (!newStudent.equals("")) {
            System.out.print("Name: ");
            String newGrade = input.next();
            students.put(newStudent, newGrade);

            // Read in the newline before looping back
            input.nextLine();
        }

    } while(!newStudent.equals(""));

    // Print class roster
    System.out.println("\nClass roster:");
    double sum = 0.0;

    for (Map.Entry<String, String> student : students.entrySet()) {
        System.out.println(student.getKey() + " (" + student.getValue() + ")");

    }

}

}

