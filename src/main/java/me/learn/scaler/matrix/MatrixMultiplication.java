package me.learn.scaler.matrix;

import utils.ToStringUtils;

public class MatrixMultiplication {
    public static void main(String[] args) {
        MatrixMultiplication sm = new MatrixMultiplication();
//        ArrayUtils.toString(sm.solve(
//                new int[][]{{1,2,3},{4,5,6},{7,8,9}},
//                new int[][]{{9,8,7},{6,5,4},{3,2,1}}));

        ToStringUtils.toString(sm.solve(
                new int[][]{{1,2}, {3, 4}},
                new int[][]{{5,6},{7,8}}));
    }

    public int[][] solve(int[][] A, int[][] B) {
        int N = A.length;
        int M = A[0].length;

        int P = B.length;
        int Q = B[0].length;
        int[][] result = new int[N][Q];

        // M == P for matrix multiplication
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < Q; j++) {
                int res = matrixMultiply(A, B, i, j);
                result[i][j]=res;
            }
        }
        return result;
    }

    public int matrixMultiply(int[][] A, int[][] B, int i, int j) {
        int sum = 0;
        for (int k = 0; k<A[0].length; k++){
            sum += A[i][k] * B[k][j];
        }
        return sum;
    }
}
