package com.udacity.examples.Testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HelperParameterizedTest {
    
    private String input;
    private String output;


    public HelperParameterizedTest(String input, String output) {
        super();
        this.output = output;
        this.input = input;
    }

    @Parameters
    public static Collection<String[]> initData() {
        String name[][] = {{"abhinav","abhinav"}};
        return Arrays.asList(name);
    }

    @Test
    public void test() {
        assertEquals(input, output);
    }



}
