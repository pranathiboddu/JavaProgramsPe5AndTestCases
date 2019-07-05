package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public List<Student> studentInfo() {
        Student obj1 = new Student(1, "Yaksha", 23);
        Student obj2 = new Student(2, "Varshini", 25);
        Student obj3 = new Student(3, "Srilu", 27);
        Student obj4 = new Student(4, "Yaksha", 23);
        Student obj5 = new Student(5, "Pravalika", 24);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        Collections.sort(list, new StudentSort());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        return list;
    }
}
