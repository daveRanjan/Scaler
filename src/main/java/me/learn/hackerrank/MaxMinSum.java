package me.learn.hackerrank;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MaxMinSum {
    public static void main(String[] args) {
        MaxMinSum mms = new MaxMinSum();
        mms.solve(Lists.newArrayList());
    }

    private void solve(List<Integer> arr) {
        Collections.sort(arr);
        int sum = 0;
    }
}
