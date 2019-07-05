package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSort implements Comparator<Student>
{
    public int compare(Student first, Student second){
        if(!first.getName().equals(second.getName())){
            return first.getName().compareTo(second.getName());
        }else if(first.getAge()!=second.getId()){
            return second.getAge()-first.getAge();
        }
        else {
            return second.getId()-first.getId();
        }
    }
}