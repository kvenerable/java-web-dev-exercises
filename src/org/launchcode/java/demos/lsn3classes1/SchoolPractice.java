package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn4classes2.Teacher;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student kaylyn = new Student("Kay", 9000, 1, 4.0);
//        kaylyn.setName("kaylyn");
//        kaylyn.setNumberOfCredits(1);
        kaylyn.setGpa(2.0);
        System.out.println(kaylyn.getGpa());
        System.out.println(kaylyn.getStudentId());
    }

}