package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ModifyValuesInMapTest {
    static ModifyValuesInMap modifyValuesInMap=new ModifyValuesInMap();
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        modifyValuesInMap = null;
    }

    @Test
    public void givenMapShouldReturnModifyValues()
    {
        Map<String,String> actual=new TreeMap<>();
        actual.put("val1","java");
        actual.put("val2","c++");
        Map<String,String> expected=new TreeMap<>();
        expected.put("val1"," ");
        expected.put("val2","java");
        modifyValuesInMap.modifyValuesInMap(actual);
        assertEquals(expected,actual);
    }
   @Test
    public void givenMapShouldReturnModifiedValues()
    {

        Map<String,String> actual=new TreeMap<>();
        actual.put("val1","mars");
        actual.put("val2","saturn");
        Map<String,String> expected=new TreeMap<>();
        expected.put("val1"," ");
        expected.put("val2","mars");
        modifyValuesInMap.modifyValuesInMap(actual);
        assertEquals(expected,actual);
    }
}