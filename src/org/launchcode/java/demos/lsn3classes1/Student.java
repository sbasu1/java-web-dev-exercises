package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }
    public void setName(String abcd) {
        name = abcd;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int num) {
        numberOfCredits = num;
    }
    public double getGPA() {
        return gpa;
    }
    public void setGPA(int score) {
        gpa = score;
    }
}