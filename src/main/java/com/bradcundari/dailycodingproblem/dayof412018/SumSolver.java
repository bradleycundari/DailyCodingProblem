/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradcundari.dailycodingproblem.dayof412018;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Brad
 */
public class SumSolver {
    private List<Integer> listToSolve;
    private Integer expectedSum;

    public SumSolver(List<Integer> listToSolve, Integer expectedSum) {
        this.listToSolve = listToSolve;
        this.expectedSum = expectedSum;
    }

    SumSolver() {
    }

    public List<Integer> getListToSolve() {
        return listToSolve;
    }

    public void setListToSolve(List<Integer> listToSolve) {
        this.listToSolve = listToSolve;
    }

    public Integer getExpectedSum() {
        return expectedSum;
    }

    public void setExpectedSum(Integer expectedSum) {
        this.expectedSum = expectedSum;
    }   

    public boolean checkInit()
    {
        return (this.listToSolve == null || this.listToSolve.isEmpty() || expectedSum == null);
    }

    public boolean checkSum(int i, int z)
    {
        return this.listToSolve.get(i) + this.listToSolve.get(z) == this.expectedSum;
    }
    
    
    /*
    This could easily be optimized. Some of the initialization checking is redundent with a better solution.
    */
    public boolean solve()
    {
        if (checkInit())
        {
            return false;
        }
        
        if (this.listToSolve.size() == 1 && Objects.equals(this.listToSolve.get(0), this.expectedSum))
        {
            return true;
        }
        
        for (int i = 0; i < this.listToSolve.size() - 1; i++)
        {
            for (int z = i+1; z < this.listToSolve.size(); z++)
            {
                if (checkSum(i,z))
                {
                    return true;
                }
            }
            
        }
        
        return false;
    }
}
