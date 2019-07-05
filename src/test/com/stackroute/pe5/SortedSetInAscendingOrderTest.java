package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortedSetInAscendingOrderTest {
    static SortedSetInAscendingOrder sortedSetInAscendingOrder=new SortedSetInAscendingOrder();
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        sortedSetInAscendingOrder = null;
    }
    @Test
    public void ReturnSetShouldReturnSortedArraySet() {

        Set<String> inputSet=new HashSet<String>();
        inputSet.add("Harry");
        inputSet.add("Olive");
        inputSet.add("Alice");
        inputSet.add("Bluto");
        inputSet.add("Eugene");

        Set<String> resultSet=new HashSet<String>();
        resultSet.add("Alice");
        resultSet.add("Bluto");
        resultSet.add("Eugene");
        resultSet.add("Harry");
        resultSet.add("Olive");
        assertEquals(resultSet,sortedSetInAscendingOrder.sortAscendingOrder(inputSet));
    }
    @Test
    public void ReturnSetShouldReturnError() {

        Set<String> inputSet=new HashSet<String>();

        Set<String> resultSet=new HashSet<String>();

        assertEquals(resultSet,sortedSetInAscendingOrder.sortAscendingOrder(inputSet));
    }
}