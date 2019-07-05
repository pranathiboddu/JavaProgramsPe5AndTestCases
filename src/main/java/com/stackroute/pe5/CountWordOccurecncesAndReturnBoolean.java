/*
Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CountWordOccurecncesAndReturnBoolean {
    public Map<String, Boolean> countingWordsInString(String[] array) //initialized string array to take values
    {
        {
            Map<String, AtomicInteger> stringIntegerMap = new HashMap<>(); // initialized a map with String and AtomicInteger
            for (String string : array) {
                stringIntegerMap.putIfAbsent(string, new AtomicInteger(0)); //created an atomic integer and set it to zero
                stringIntegerMap.get(string).getAndIncrement(); // and increments the count of string value
            }
            Map<String, Boolean> stringBooleanMap = new HashMap<>();
            {
                stringIntegerMap.forEach((key, value) ->
                {
                    if (value.intValue() >= 2)  //if countis greater than true then return true
                    {
                        stringBooleanMap.put(key, true);
                    } else                        // else return false
                    {
                        stringBooleanMap.put(key, false);
                    }
                });
                return stringBooleanMap;
            }
        }
    }
}