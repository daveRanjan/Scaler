package me.learn;

import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution2 = new Solution3();
        System.out.println(Arrays.toString(solution2.solve(new int[]{1, 2, 3, 4, 5}, new int[]{2,3})));
    }

    public int[][] solve(int[] A, int[] B) {
        int[][] sol = new int[B.length][A.length];
        for (int i = 0; i < B.length; i++) {
            int[] copyOfA = A.clone();
            sol[i] = rotate(copyOfA, B[i]);
            System.out.println(Arrays.toString(sol[i]));;
        }
        return sol;
    }

    public int[] rotate(int[] A, int b){
        //Step1: Reverse the array
        int N = A.length;
        A = reverse(A, 0, A.length-1);
        b = b % A.length;
        A = reverse(A, 0, (N - b-1));
        A = reverse(A, N-b, N-1);

        return A;
    }

    public int[] reverse(int[] A, int i, int j){
        while(i<j){
            A[i] = A[i]^A[j];
            A[j] = A[i]^A[j];
            A[i] = A[i]^A[j];
            i++;j--;
        }

        return A;
    }
}
