package me.learn.scaler.intermediate.matrix;

import utils.ToStringUtils;

public class BoundryPrinting {
    public static void main(String[] args) {
        BoundryPrinting sm = new BoundryPrinting();
        sm.solve(
                new int[][]{{-5,7,5},{3,1,5},{4,-10,7}});
    }

    public int solve(int[][] A) {

        int N = A.length;
        int M = A[0].length;

        int i =0,j=0;

        ToStringUtils.toString(A);

        while (M>0 && N>0){
            while (j<M-1){
                System.out.print(" ,"+A[i][j]);
                j++;
            }
            while (i<N-1){
                System.out.print(" ,"+A[i][j]);
                i++;
            }
            while (j>0){
                System.out.print(" ,"+A[i][j]);
                j--;
            }
            while (i>0){
                System.out.print(" ,"+A[i][j]);
                i--;
            }
//            System.out.println("i: "+i+" j :"+j);
            i++;j++;
            M=M-2; N=N-2;
        }





        return -1;
    }
}
