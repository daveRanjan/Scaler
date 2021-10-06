package me.learn.scaler.matrix;

import utils.ToStringUtils;

public class AntiDiagonalSum {
    public static void main(String[] args) {
        AntiDiagonalSum sm = new AntiDiagonalSum();
//        ArrayUtils.toString(sm.solve(
//                new int[][]{{1,2,3},{4,5,6},{7,8,9}},
//                new int[][]{{9,8,7},{6,5,4},{3,2,1}}));

        ToStringUtils.toString(sm.solve(
                new int[][]{{-5,7,4},{3,1,5},{4,-10,2}}));
    }

    public int[][] solve(int[][] A) {
        int N = A.length;
        int i=0,j=0;
        int[][] result = new int[(2*N)-1][N];
        int count = 0;
        // Step 1: for 0th row
        for(j =0;j<N-1;j++){
            int s = i;
            int e = j;
            int k =0;
            while (s < N && e>=0){
                result[count][k]=A[s][e];
                s++;
                e--;
                k++;
            }
            count++;
        }

        // j should be n-1

        for (i = 0; i < N; i++) {
            int s = i;
            int e = j;
            int k =0;
            while (s < N && e>=0){
                result[count][k]=A[s][e];
                s++;
                e--;
                k++;
            }
            count++;
        }

        return result;
    }
}
