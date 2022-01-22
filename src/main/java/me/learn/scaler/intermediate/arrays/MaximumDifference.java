package me.learn.scaler.intermediate.arrays;

import utils.ToStringUtils;

import java.util.Arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        MaximumDifference sol = new MaximumDifference();
//        ToStringUtils.toString(sol.solve(new int[]{  70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46, 87 }, 16));
        ToStringUtils.toString(sol.solve(new int[]{  93, 51, 84, 81, 89, 82, 28, 78, 86, 35, 64, 38, 49, 99, 83}, 4));
//        ToStringUtils.toString(sol.solve(new int[]{  48, 63 }, 1));
    }

    public int solve(int[] A, int B) {
        int N = A.length;
        Arrays.sort(A);
        long s1sum = 0;
        long s2sum = 0;

        for(int i =0; i<N;i++){
            if(i<B){
                s1sum+=A[i];
            }else{
                s2sum+=A[i];
            }
        }

        int minDiff1 = (int)Math.abs(s2sum-s1sum);
        s1sum=0;
        s2sum=0;
        for(int i =N-1; i>=0;i--){
            if(B>0){
                s1sum+=A[i];
                B--;
            }else{
                s2sum+=A[i];
            }
        }

        int minDiff2 = (int)Math.abs(s2sum-s1sum);

        return Math.max(minDiff1, minDiff2);
    }
}
