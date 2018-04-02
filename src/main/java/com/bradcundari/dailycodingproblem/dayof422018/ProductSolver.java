/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradcundari.dailycodingproblem.dayof422018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brad
 */
public class ProductSolver {

    private List<Integer> listToSolve;

    public List<Integer> getListToSolve() {
        return listToSolve;
    }

    public void setListToSolve(List<Integer> listToSolve) {
        this.listToSolve = listToSolve;
    }

    public List<Integer> getProductArray() {
        List<Integer> solution = new ArrayList<>();

        /*
        It has no indexs to avoid so either return 0 or itself, I chose 0.
         */
        if (this.listToSolve.size() == 1 || this.listToSolve.isEmpty()) {
            solution.add(0);
            return solution;
        }

        /*
        Reverse the two params to handle this
         */
        if (this.listToSolve.size() == 2) {
            solution.add(listToSolve.get(1));
            solution.add(listToSolve.get(0));
            return solution;
        }

        for (int i = 0; i < listToSolve.size(); i++) {
            solution.add(this.returnArrayElementsProduct(i, this.listToSolve));
        }

        return solution;
    }

    private Integer returnArrayElementsProduct(Integer indexToAvoid, List<Integer> nums) {
        //This needs to be 1 so that the first value isn't lost (e.g.) 0 * i * i * i* 
        Integer productAccumulator = 1;

        for (int i = 0; i < nums.size(); i++) {
            if (indexToAvoid.equals(i)) {
                continue;
            }

            productAccumulator = productAccumulator * nums.get(i);
        }

        return productAccumulator;
    }
}
