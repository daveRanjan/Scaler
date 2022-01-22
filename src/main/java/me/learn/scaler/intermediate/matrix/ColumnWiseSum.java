package me.learn.scaler.intermediate.matrix;

import utils.ToStringUtils;

public class ColumnWiseSum {
    public static void main(String[] args) {
        ColumnWiseSum sm = new ColumnWiseSum();
        ToStringUtils.toString(sm.solve(
                new int[][]{{-5,7},{3,1},{4,-10}}));
    }

    public int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[] result = new int[M];
        for(int j=0; j< M; j++){
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum+=A[i][j];
            }
            result[j]=sum;
        }
        return result;
    }
}
