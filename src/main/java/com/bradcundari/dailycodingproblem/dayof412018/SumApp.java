/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradcundari.dailycodingproblem.dayof412018;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Brad
 */
public class SumApp {

    public static void main (String args[])
    {
        List<Integer> testList = new ArrayList<>();
        Integer sum = 20;
        testList.add(50);
        
        SumSolver mySolver = new SumSolver(testList, sum);
        
        System.out.println(mySolver.solve());
    }
    
    
    public List<Integer> generateRandomList() {
        Random rand = new Random();
        List<Integer> myOutput = new ArrayList<>();
        
        for (int i = 0; i < rand.nextInt(100); i++)
        {
            myOutput.add(rand.nextInt());
        }
        
        return myOutput;
    }
}



