package me.learn.scaler.intermediate.matrix;

import utils.ToStringUtils;

public class MinorDiagonalSumMatrix {
    public static void main(String[] args) {
        MinorDiagonalSumMatrix sm = new MinorDiagonalSumMatrix();
//        ArrayUtils.toString(sm.solve(
//                new int[][]{{1,2,3},{4,5,6},{7,8,9}},
//                new int[][]{{9,8,7},{6,5,4},{3,2,1}}));

        ToStringUtils.toString(sm.solve(
                new int[][]{{-5,7},{3,1}}));
    }

    public int solve(int[][] A) {
        int N = A.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum+=A[i][N-i-1];
        }
        return sum;
    }
}
