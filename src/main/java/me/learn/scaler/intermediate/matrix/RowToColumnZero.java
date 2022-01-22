package me.learn.scaler.intermediate.matrix;

import utils.ToStringUtils;

import java.util.Arrays;

public class RowToColumnZero {
    public static void main(String[] args) {
        RowToColumnZero sm = new RowToColumnZero();
//        ArrayUtils.toString(sm.solve(
//                new int[][]{{1,2,3},{4,5,6},{7,8,9}},
//                new int[][]{{9,8,7},{6,5,4},{3,2,1}}));

        ToStringUtils.toString(sm.solve(
                new int[][]{{0,7,5},{3,5,5},{4,-10,3}}));
    }

    public int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] result = Arrays.stream(A).map(el -> el.clone()).toArray($ -> A.clone());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(A[i][j] == 0){
                    final int column = j;
                    Arrays.fill(result[i], 0);
                    Arrays.stream(result).forEach(row -> row[column]=0);
                }
            }
        }

        return result;
    }
}
