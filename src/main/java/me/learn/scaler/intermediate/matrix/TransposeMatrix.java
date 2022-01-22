package me.learn.scaler.intermediate.matrix;

import utils.ToStringUtils;

public class TransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrix sm = new TransposeMatrix();
//        ArrayUtils.toString(sm.solve(
//                new int[][]{{1,2,3},{4,5,6},{7,8,9}},
//                new int[][]{{9,8,7},{6,5,4},{3,2,1}}));

        ToStringUtils.toString(sm.solve(
                new int[][]{{-5,7},{3,1},{4,-10}}));
    }

    public int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] result = new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[j][i]=A[i][j];
            }
        }
        return result;
    }
}
