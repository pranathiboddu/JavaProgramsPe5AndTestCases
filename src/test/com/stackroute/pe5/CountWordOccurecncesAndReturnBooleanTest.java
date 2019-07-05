package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountWordOccurecncesAndReturnBooleanTest {
    static CountWordOccurecncesAndReturnBoolean countWordOccurecncesAndReturnBoolean = new CountWordOccurecncesAndReturnBoolean();

    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        countWordOccurecncesAndReturnBoolean = null;
    }

    @Test
    public void givenStringArrayShouldReturnsGreaterThandTwoTimesCountwithTrueAndFalseForNotGreaterThanTwo() {
        String[] array = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> result = countWordOccurecncesAndReturnBoolean.countingWordsInString(array);
        Map<String, Boolean> booleanMap = new HashMap<>();
        booleanMap.put("a", true);
        booleanMap.put("b", false);
        booleanMap.put("c", true);
        booleanMap.put("d", false);
        assertEquals(booleanMap, result);
    }

    @Test
    public void givenStringArrayShouldNotReturnsGreaterThandTwoTimesCountwithTrueAndFalseForNotGreaterThanTwo() {
        String[] array = {"a", " ", " ", " ", "a", "c"};
        Map<String, Boolean> result = countWordOccurecncesAndReturnBoolean.countingWordsInString(array);
        Map<String, Boolean> booleanMap = new HashMap<>();
        booleanMap.put("a", false);
        booleanMap.put(" ", false);
        booleanMap.put("c", true);
        assertNotEquals(booleanMap, result);
    }
}