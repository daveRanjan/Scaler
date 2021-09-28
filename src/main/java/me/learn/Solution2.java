package me.learn;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solve(new int[]{3, 2, 1, 3}));
    }

    public int solve(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] < A[i+1] && A[i] == (A.length - i -1)){
                return 1;
            }
        }
        return -1;
    }

    public int sumOfNElements(int[] A, int i , int j){
        int sum = 0;
        for(int k =i; k<= j; k++){
            sum+=A[k];
        }

        return sum;
    }
}
