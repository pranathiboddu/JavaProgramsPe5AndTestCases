package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2)//initialized two student objects
    {

        if(o1.getAge() == o2.getAge())//if ages are equal compare based on name
        {
            if(o1.getName().equals(o2.getName())) //if names are equalcompare based on id
            {
                return o2.getId() - o1.getId();
            }

            return o2.getName().compareTo(o1.getName());
        }
        return o2.getAge()- o1.getAge();

    }
}