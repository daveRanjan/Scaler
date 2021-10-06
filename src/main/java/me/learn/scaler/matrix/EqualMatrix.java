package me.learn.scaler.matrix;

import utils.ToStringUtils;

public class EqualMatrix {

    public static void main(String[] args) {
        EqualMatrix sm = new EqualMatrix();
//        ArrayUtils.toString(sm.solve(
//                new int[][]{{1,2,3},{4,5,6},{7,8,9}},
//                new int[][]{{9,8,7},{6,5,4},{3,2,1}}));

        ToStringUtils.toString(sm.solve(
                new int[][]{{-5,7},{3,1},{4,-10}},
                new int[][]{}));
    }

    public int solve(int[][] A, int[][] B) {
        int N = A.length;
        int M = A[0].length;
        for(int i =0; i<N; i++){
            for(int j =0; j<M; j++){
                if(A[i][j]!=B[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
}
