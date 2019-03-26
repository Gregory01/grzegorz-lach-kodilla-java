package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }
    @After
    public void after() {
        System.out.println("Test case: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumExterminator.exterminate(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        //Then
        List <Integer> expectedEvenNumbers = new ArrayList<>(Arrays.asList(2,4));
        Assert.assertEquals(expectedEvenNumbers,result);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumExterminator2 = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumExterminator2.exterminate(new ArrayList<>());
        //Then
        int size = result.size();
        Assert.assertEquals(0,size);
    }
}
