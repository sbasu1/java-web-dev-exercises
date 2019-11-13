package org.launchcode.java.demos.Chapter3;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String abc = "I would not, " +
                "" +
                "could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] StringArray = abc.split("\\.");
        System.out.println(Arrays.toString(StringArray));
    }
}

