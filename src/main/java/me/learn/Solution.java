package me.learn;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solve(
                new int[]{122, 499, 193, 40, 76, 98, 186, 381, 427, 162, 30, 60, 474, 160, 77, 477, 314, 144, 310, 96, 152, 244, 129, 445, 199, 377, 291, 228, 255, 226, 61, 254, 426, 68, 297, 29, 201, 494, 383, 160, 485, 238, 70, 399, 472, 302, 36, 403, 92, 92, 416, 469, 142, 348, 435, 261, 327, 460, 346, 219, 95, 115, 361, 302, 22, 52, 381, 484, 410, 405, 221, 194, 127, 370, 367, 460, 263, 355, 66, 131, 329, 431, 491, 402, 75, 274, 221, 145, 163, 52, 350, 423, 487, 347, 210, 61 },
                95));
    }


    public int solve(int[] A, int k) {
        //Sliding window solution
        //SOLVED
        int n = A.length;

        int sum = sumOfNElements(A, 0, k-1);
        int minAvg = sum/k;
        int checkMin = 0;
        int firstIndex = 0;
        //Step1: calculate sum of subarray
        for(int i =1; i <= n-k;i++){
            sum = sum - A[i-1]+A[i+k-1];
            checkMin = sum/k;
            if(checkMin < minAvg){
                minAvg = checkMin;
                firstIndex = i;
            }
        }

        return firstIndex;
    }

    public int sumOfNElements(int[] A, int i , int j){
        int sum = 0;
        for(int k =i; k<= j; k++){
            sum+=A[k];
        }

        return sum;
    }
}
