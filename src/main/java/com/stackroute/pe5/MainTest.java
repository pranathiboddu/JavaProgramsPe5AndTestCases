package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static ArrayList<Student> compareStudent(List<Student> students){

        ArrayList<Student> student = new ArrayList<Student>(students); //initialized list
        Collections.sort(student, new StudentSort());

        return student;
    }

    public static void main(String args[]){

        ArrayList<Student> listStudent = new ArrayList<Student>(); //adding elements to the list

        listStudent.add(new Student(1,"pranathi", 12));
        listStudent.add(new Student(2,"yaksha", 13));
        listStudent.add(new Student(3,"srilu", 14));
        listStudent.add(new Student(4,"varshini", 15));
        listStudent.add(new Student(5,"pravalika", 16));

        Collections.sort(listStudent, new StudentSort());

        for(int i=0;i<listStudent.size();i++){
            System.out.println(listStudent.get(i).toString());
        }


    }
}