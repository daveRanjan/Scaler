package me.learn.scaler.intermediate.arrays;

import java.util.Arrays;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        MinimumAbsoluteDifference pp1 = new MinimumAbsoluteDifference();
        int sol = pp1.solve(new int[]{37, 19, 71, 72, 5, 4, 74, 2, 30, 33, 85, 1, 7, 14, 98, 27, 51, 7, 24, 88, 86, 81, 77, 64, 13, 3, 63, 75, 29, 50, 90, 3, 22, 94, 40, 72, 75, 26, 32, 64, 62, 59, 19, 16});
        System.out.println(sol);
    }

    //Not Optimal Solution
    private int solve1(int[] A) {
        if(A.length == 1) return A[0];
        int min = Integer.MAX_VALUE;
        int N = A.length;
        for (int i = 1; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                min = Math.min(min, Math.abs(A[i]-A[j]));
            }
        }

        return min;
    }

    public int solve(int[] A) {
       int N = A.length;

       if(N==1) return A[0];
       // Calculate mod
        for (int i = 0; i < N; i++) {
            A[i]=Math.abs(A[i]);
        }
        
        //Sort the array
        Arrays.sort(A);

        int minDiff = Integer.MAX_VALUE;
        // calculate the min difference among elements
        for (int i = 1; i < N - 1; i++) {
            minDiff = Math.min(minDiff, Math.abs(A[i]-A[i-1]));
        }

        return minDiff;
    }

    public int getClosestToZero(int min, int el){
        return Math.min(Math.abs(min), Math.abs(el)) == min ? min : el;
    }
}
