/*
Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []
 */
package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;



public class UpdateAndEmptyArrayList
{
    public ArrayList<String> myArray()
    {
        ArrayList<String> ar = new ArrayList<String>();
        //adding elements in array list
        ar.add("Apple");
        ar.add("Grape");
        ar.add("Melon");
        ar.add("Berry");
        return ar;
    }
    public ArrayList<String> ArrayUpdate()//updating elements at particular index
    {
        ArrayList<String> array=myArray();
        //Adding element at 0 index
        array.set(0, "Kiwi");
        array.set(2,"Mango");//Adding element at 2 index
        return array;
    }
    public ArrayList<String> RemoveArrayElement()
    {
        ArrayList<String> empty=ArrayUpdate();
        empty.clear(); //removing all elements from list
        return empty;
    }

}

