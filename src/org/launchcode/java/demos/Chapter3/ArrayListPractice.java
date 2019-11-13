package org.launchcode.java.demos.Chapter3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> AllNumbers = new ArrayList<>(Arrays.asList(3, 5, 6, 8, 9, 10, 3, 4, 6, 12, 8));
        int sum = 0;
        for (int i = 0; i < AllNumbers.size(); i++) {
            if (AllNumbers.get(i) % 2 == 0) {
                sum += AllNumbers.get(i);


            }


        }System.out.println(sum);
        ArrayList<String> NameList = new ArrayList<>(Arrays.asList("Sreya", "Saswata", "Aditi", "Tania", "Chnadreyi", "Barnali"));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nameSize:");
        int nameSize = input.nextInt();
        for (int i = 0; i < NameList.size(); i++) {
            if (NameList.get(i).length() == nameSize) {
                System.out.println(NameList.get(i));

            }
        }
    }
}
