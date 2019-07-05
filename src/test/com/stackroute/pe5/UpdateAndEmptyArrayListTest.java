package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UpdateAndEmptyArrayListTest {

    static UpdateAndEmptyArrayList updateAndEmptyArrayList = new UpdateAndEmptyArrayList();

    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        updateAndEmptyArrayList = null;
    }


    @Test
    public void givenStringContainingdtIsCheckedForCharacterAndreplaceswithNewCharAndNewStringIsReturned()
    {
        String result=updateAndEmptyArrayList.ArrayUpdate().toString();
        assertEquals("[Kiwi, Grape, Mango, Berry]",result);
    }
    @Test
    public void givenStringisemptyContainingdtIsCheckedForCharacterAndreplaceswithNewCharAndNewStringIsReturned()
    {
        String result=updateAndEmptyArrayList.RemoveArrayElement().toString();
        assertEquals("[]",result);
    }


}
