package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        Double radiusOfCircle = input.nextDouble();
        if (radiusOfCircle < 0){
            System.err.println("invalid entry");
        }
        else if (radiusOfCircle.getClass().equals(String.class)) {
            System.err.println("invalid entry");
        };
        Double Area = Circle.getArea(radiusOfCircle);
        System.out.println(Area);

    }
}
