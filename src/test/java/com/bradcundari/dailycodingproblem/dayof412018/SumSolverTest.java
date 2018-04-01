/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradcundari.dailycodingproblem.dayof412018;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.bradcundari.dailycodingproblem.dayof412018.SumSolver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brad
 */
public class SumSolverTest {
    
    SumSolver mySolver;
    List<Integer> testList;
    Integer testSum;
    
    public SumSolverTest() {
    }
    
    
    @Before
    public void setUp() {
        mySolver = new SumSolver();
    }
    
    @After
    public void tearDown() {
        mySolver = null;
    }

    @Test
    public void oneValueCorrectSum(){
        testList = new ArrayList<>();
        testSum = 50;
        testList.add(50);
        
        mySolver.setExpectedSum(testSum);
        mySolver.setListToSolve(testList);
        
        assertEquals("Testing the one value in list, correct sum", true, mySolver.solve());
    }
    
    @Test
    public void oneValueWrongSum(){
        testList = new ArrayList<>();
        testSum = 50;
        testList.add(25);
        
        mySolver.setExpectedSum(testSum);
        mySolver.setListToSolve(testList);
        
        assertEquals("Testing the one value in list, correct sum", false, mySolver.solve());
    }
    
    @Test
    public void correctSum()
    {
        testList = new ArrayList<>();
        testSum = 95;
        testList.add(25);
        testList.add(43);
        testList.add(52);
        
        mySolver.setExpectedSum(testSum);
        mySolver.setListToSolve(testList);
        
        assertEquals("Testing three values in list, correct sum", true, mySolver.solve());
    }
    
    @Test
    public void incorrectSum()
    {
        testList = new ArrayList<>();
        testSum = 66;
        testList.add(25);
        testList.add(43);
        testList.add(52);
        
        mySolver.setExpectedSum(testSum);
        mySolver.setListToSolve(testList);
        
        assertEquals("Testing three values in list, incorrect sum", false, mySolver.solve());
    }
    
}
