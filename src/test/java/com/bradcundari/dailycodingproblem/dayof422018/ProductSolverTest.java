/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradcundari.dailycodingproblem.dayof422018;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brad
 */
public class ProductSolverTest {

    List<Integer> testData;
    ProductSolver mySolver;

    @Before
    public void setUp() {
        testData = new ArrayList<>();
        mySolver = new ProductSolver();
    }

    @After
    public void tearDown() {
        testData = null;
    }

    /**
     * Test of getListToSolve method, of class ProductSolver.
     */
    @Test
    public void testOneParam() {
        testData.add(5);
        mySolver.setListToSolve(testData);

        int totalArraySum = 0;
        for (int i : mySolver.getProductArray()) {
            totalArraySum += i;
        }

        assertEquals("Testing one param", 0, totalArraySum);
    }

    @Test
    public void testTwoParam() {
        List<Integer> answer = new ArrayList<>();
        answer.add(7);
        answer.add(5);

        testData.add(5);
        testData.add(7);
        mySolver.setListToSolve(testData);

        assertEquals("Testing one param", true, mySolver.getProductArray().containsAll(answer));
        assertEquals("Testing the order", answer.get(0), mySolver.getProductArray().get(0));
    }

    @Test
    public void testMultipleParams() {
        List<Integer> answer = new ArrayList<>();
        answer.add(50);
        answer.add(40);
        answer.add(80);

        testData.add(8);
        testData.add(10);
        testData.add(5);
        mySolver.setListToSolve(testData);

        for (int i : mySolver.getProductArray()) {
            System.out.println(i);
        }

        assertEquals("Testing multiple param", true, mySolver.getProductArray().containsAll(answer));
    }
}
