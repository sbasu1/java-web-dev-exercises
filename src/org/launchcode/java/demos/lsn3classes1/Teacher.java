package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Integer yearsTeaching;

    public String getfirstName() {
        return firstName;
    }
    public void setfirstName(String teacherFirstName) {
        firstName = teacherFirstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String teacherLastName) {
        lastName = teacherLastName;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String newSubject) {
        subject = newSubject;
    }

    public Integer getYearsTeaching(){
        return yearsTeaching;
    }
    public void setYearsTeaching(Integer numOfYears){
        yearsTeaching = numOfYears;
    }
}
