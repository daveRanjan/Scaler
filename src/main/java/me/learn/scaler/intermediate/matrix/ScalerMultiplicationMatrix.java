package me.learn.scaler.intermediate.matrix;

import utils.ToStringUtils;

public class ScalerMultiplicationMatrix {
    public static void main(String[] args) {
        ScalerMultiplicationMatrix sm = new ScalerMultiplicationMatrix();
        ToStringUtils.toString(sm.solve(
                new int[][]{{7},{10}}, 4));
    }

    public int[][] solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = B*A[i][j];
            }
        }
        return A;
    }
}
