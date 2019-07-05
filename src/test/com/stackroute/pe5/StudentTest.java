package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    static MainTest mainTest=new MainTest();
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        mainTest = null;
    }

    @Test
    public void studentInfo() {
        Student obj1 = new Student(1, "Yaksha", 23);
        Student obj2 = new Student(2, "Varshini", 25);
        Student obj3 = new Student(3, "Srilu", 27);
        Student obj4 = new Student(4, "Yaksha", 23);
        Student obj5 = new Student(5, "Pravalika", 24);
        List<Student> list=new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        List<Student> ans=mainTest.studentInfo();
        String expected="",actual="";
        for(int i=0;i<list.size();i++) {
            expected+=list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getAge()+" ";
        }
        for(int j=0;j<ans.size();j++){
            actual+=ans.get(j).getId()+" "+ans.get(j).getName()+" "+ans.get(j).getAge()+" ";

        }
        assertEquals(expected,actual);
    }


}