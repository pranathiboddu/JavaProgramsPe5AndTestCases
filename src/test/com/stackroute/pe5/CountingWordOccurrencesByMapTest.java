package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingWordOccurrencesByMapTest {
    static CountingWordOccurrencesByMap countingWordOccurrencesByMap=new CountingWordOccurrencesByMap();

    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        countingWordOccurrencesByMap = null;
    }
    @Test
    public void givenStringShouldReturnEachWordCount()
    {
        String result=countingWordOccurrencesByMap.countingWordsInString("one one -one___two,,three,one @three*one?two");
        assertEquals("{one=5, two=2, three=2}",result);
    }
    @Test
    public void givenStringShouldReturnEachNumberCount()
    {
        String result=countingWordOccurrencesByMap.countingWordsInString("1 1 -2___2,,2,2 @3*3?1");
        assertEquals("{1=3, 2=4, 3=2}",result);
    }
    @Test
    public void givenStringShouldReturnError()
    {
        String result=countingWordOccurrencesByMap.countingWordsInString(null);
        assertEquals("null string",result);
    }
    @Test
    public void givenStringShouldReturnEachWordCountFalseResult()
    {
        String result=countingWordOccurrencesByMap.countingWordsInString("one one -one___two,,three,one @three*one?two");
        assertNotEquals("{one=3, two=1, three=5}",result);
    }
}

