package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
     private String courseName;
     private String courseDescription;
     private ArrayList<Student> studentInfo;

     public String getcourseName() {
         return courseName;
     }
    public void setcourseName(String abcd) {
        courseName = abcd;
    }
    public String getcourseDescription() {
        return courseDescription;
    }
    public void setcourseDescription(String abcd) {
        courseDescription = abcd;
     }
    public ArrayList<Student> getStudentInfo() {
         return studentInfo;
    }
    public void setStudentInfo(ArrayList<Student> student){
         studentInfo = student;
    }
}
