package me.learn.scaler.intermediate.matrix;

import utils.ToStringUtils;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        SpiralOrderMatrix sm = new SpiralOrderMatrix();
        ToStringUtils.toString(sm.solve(5));
    }

    public int[][] solve(int n) {
        int[][] A = new int[n][n];
        int N = A.length;
        int M = A[0].length;

        int i =0,j=0;

        int count = 0;

        A[N/2][M/2]=N*N;

        while (M>0 && N>0){
            for (int k = 1; k <= N - 1; k++) {
                A[i][j]=++count;
                j++;
            }

            for (int k = 1; k <= M - 1; k++) {
                A[i][j]=++count;
                i++;
            }

            for (int k = N-1; k > 0 ; k--) {
                A[i][j]=++count;
                j--;
            }

            for (int k = M-1; k > 0; k--) {
                A[i][j]=++count;
                i--;
            }

            i++;j++;
            M=M-2;N=N-2;
        }

        return A;
    }
}
