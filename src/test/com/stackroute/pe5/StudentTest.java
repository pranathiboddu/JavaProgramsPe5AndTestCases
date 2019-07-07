package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    static MainTest mainTest = new MainTest();

    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        mainTest = null;
    }


    @Test
    public void givenListShouldReturnDescendingOrderSortBasedonAge() throws Exception {
        ArrayList<Student> expectedList = new ArrayList<Student>();
        expectedList.add(new Student(5, "pravalika", 16));
        expectedList.add(new Student(4, "varshini", 15));
        expectedList.add(new Student(3, "srilu", 14));
        expectedList.add(new Student(2, "yaksha", 13));
        expectedList.add(new Student(1, "pranathi", 12));

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"pranathi", 12));
        list.add(new Student(2,"yaksha", 13));
        list.add(new Student(3,"srilu", 14));
        list.add(new Student(4,"varshini", 15));
        list.add(new Student(5,"pravalika", 16));

        assertEquals(expectedList.toString(), MainTest.compareStudent(list).toString());


    }
    @Test
    public void givenListShouldReturnDescendingOrderSortBasedonAgeandIfSameAgeSortBasedOnName() throws Exception{
        ArrayList<Student> expectedList = new ArrayList<Student>();
        expectedList.add(new Student(4,"varshini", 15 ));
        expectedList.add(new Student(5,"pravalika", 15 ));
        expectedList.add(new Student(3,"srilu", 14 ));
        expectedList.add(new Student(2,"yaksha", 13 ));
        expectedList.add(new Student(1,"pranathi", 12 ));

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"pranathi", 12 ));
        list.add(new Student(2,"yaksha", 13 ));
        list.add(new Student(3,"srilu", 14 ));
        list.add(new Student(4,"varshini", 15 ));
        list.add(new Student(5,"pravalika", 15 ));

        assertEquals( expectedList.toString(), mainTest.compareStudent(list).toString());


    }
    @Test
    public void givenListShouldReturnDescendingOrderSortBasedonAgeandIfSameAgeandNameSOrtBasedOnId()throws Exception{
        ArrayList<Student> expectedList = new ArrayList<Student>();
        expectedList.add(new Student(5,"pravalika", 16 ));
        expectedList.add(new Student(4,"srilu", 15 ));
        expectedList.add(new Student(2,"srilu", 15 ));
        expectedList.add(new Student(3,"varshini", 14 ));
        expectedList.add(new Student(1,"yaksha", 12 ));

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"yaksha", 12 ));
        list.add(new Student(2,"srilu", 15 ));
        list.add(new Student(4,"srilu", 15 ));
        list.add(new Student(3,"varshini", 14 ));
        list.add(new Student(5,"pravalika", 16 ));

        assertEquals( expectedList.toString(), mainTest.compareStudent(list).toString());


    }

}