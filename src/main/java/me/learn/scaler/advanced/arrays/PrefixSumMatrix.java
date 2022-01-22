package me.learn.scaler.advanced.arrays;

import utils.ToStringUtils;

public class PrefixSumMatrix {
    public static void main(String[] args) {
        PrefixSumMatrix psm = new PrefixSumMatrix();
        ToStringUtils.toString(psm.solve(
                new int[][]{{1,2,3}, {4,5,6}, {7,8,9}},
                new int[]{1,2},
                new int[]{1,2},
                new int[]{2,3},
                new int[]{2,3}
        ));
    }

    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int N = A.length;
        int M = A[0].length;
        int mod = 1000000007;

        int[] result = new int[B.length];

        // calculate pf-sum row-wise
        for (int i = 0; i < N; i++) {
            long sum = 0;
            for (int j = 0; j < M; j++) {
                sum+=A[i][j];
                A[i][j]=(int) Math.floorMod(sum, mod);
            }
        }

        // Calculate pf sum col wise
        for (int j = 0; j < M; j++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum+=A[i][j];
                A[i][j]=(int) Math.floorMod(sum, mod);
            }
        }

        // Prefix SUm Matrix created
        for (int i = 0; i < B.length; i++) {
            int a1 = B[i]-1;
            int b1 = C[i]-1;
            int a2 = D[i]-1;
            int b2 = E[i]-1;

            int sum = A[a2][b2];
            if(a1 > 0){
                sum-=A[a1-1][b2];
            }

            if(b1 > 0){
                sum-=A[a2][b1-1];
            }

            if(b1 > 0 && a1 > 0){
                sum+=A[a1-1][b1-1];
            }

            result[i]=sum;
        }


        return result;
    }
}
