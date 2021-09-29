package me.learn;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solve(new int[]{-4, -2, 0, -1, -6 }));
    }


    public int solve(int[] A) {
        Arrays.sort(A);
        if(A[A.length-1] == 0) return 1;
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] < A[i+1] && A[i] == (A.length - i -1)){
                return 1;
            }
        }
        return -1;
    }
}
