package me.learn.scaler.intermediate.matrix;

import utils.ToStringUtils;

public class MatrixRotateBy90 {
    public static void main(String[] args) {
        MatrixRotateBy90 m = new MatrixRotateBy90();
        ToStringUtils.toString(m.solve(new int[][]{{1,2},{3,4}}));
    }

    private int[][] solve(int[][] A) {
        // To rotate a matrix by 90*
        // Transpose + inverse each row
        transposeAMatrix(A);
        inverseEachRow(A);
        return A;
    }

    public void inverseEachRow(int[][] A){
        int N = A.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N/2; j++) {
                A[i][j]=A[i][j]^A[i][N-j-1];
                A[i][N-j-1]=A[i][j]^A[i][N-j-1];
                A[i][j]=A[i][j]^A[i][N-j-1];
            }
        }
    }

    public void transposeAMatrix(int[][] A){
        int N = A.length;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                A[i][j] = A[i][j] ^ A[j][i];
                A[j][i] = A[i][j] ^ A[j][i];
                A[i][j] = A[i][j] ^ A[j][i];
            }
        }
    }

}
