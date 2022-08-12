package com.shaker;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestPararmeterized {
    private Utilities util;
    private String input;
    private String output;


    @org.junit.Before
    public void setup(){
        util = new Utilities();
    }

    public UtilitiesTestPararmeterized(String input, String output) {
        this.input = input;
        this.output = output;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"A", "A"}
        });
    }

    @org.junit.Test
    public void removePairs(){
        assertEquals(output, util.removePairs(input));
    }
}
