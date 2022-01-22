package me.learn.scaler.intermediate.subsequence;

import utils.ToStringUtils;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        MaxMin sol = new MaxMin();
        ToStringUtils.toString(sol.solve(new int[]{5, 4, 2}));
    }
    public int solve(int[] A) {
        Arrays.sort(A);
        int N = A.length;
        long maxSum = 0;
        long minSum = 0;
        for(int i =0; i< N; i++){
            maxSum += A[i] * (1<<i);
            minSum += A[i] * (1 << (N-i-1));
        }

        return (int) Math.floorMod(maxSum-minSum, 1000000007);

    }
}
