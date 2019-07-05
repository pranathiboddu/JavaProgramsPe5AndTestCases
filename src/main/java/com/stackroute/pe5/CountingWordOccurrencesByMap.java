/*
Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}
 */

package com.stackroute.pe5;
import java.util.HashMap;
import java.util.Map;

public class CountingWordOccurrencesByMap {
    public String countingWordsInString(String string) //initialized the string to count occurrences of each word
    {
        if (string != null) {
            String alphaAndDigits = string.replaceAll("[^a-zA-Z0-9]+", " ");//replacing all different characters other than alphabetic and digits with space
            String[] splittedarray = alphaAndDigits.split(" ");//spliiting the string and storing in an array
            Map<String, Integer> hashMap = new HashMap<String, Integer>(); //initialized a map with string is key and count of string as integer

            for (int i = 0; i < splittedarray.length; i++) //logic for counting occurrence of each word
            {
                if (hashMap.containsKey(splittedarray[i])) //if key contains in array
                {
                    int count = hashMap.get(splittedarray[i]); //initializing count and increminting count if it is present
                    hashMap.put(splittedarray[i], count + 1);
                } else {
                    hashMap.put(splittedarray[i], 1);
                }
            }
            return hashMap.toString();//returning map to string
        } else {
            return "null string";
        }
    }

}
