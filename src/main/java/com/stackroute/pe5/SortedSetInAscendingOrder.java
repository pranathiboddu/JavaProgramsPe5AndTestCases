/*
Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive
 */

package com.stackroute.pe5;

import java.util.*;

public class SortedSetInAscendingOrder
{
    public Set<String> sortAscendingOrder(Set<String> sortedSet) // initialized set to add elements
    {
        Set<String> empty=new TreeSet<>();
        if(!sortedSet.isEmpty()) {
            List<String> list = new ArrayList<String>(); // initialized list
            list.addAll(sortedSet); //adding sortedSet elements to list
            Collections.sort(list); //inorder to sort elements
            Set<String> newSet = new LinkedHashSet<String>(list);
            return newSet;
        }
        else
        {
            return empty;
        }
    }

}



