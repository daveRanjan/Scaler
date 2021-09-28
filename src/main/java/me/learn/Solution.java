package me.learn;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println(new Solution().solve(new int[]{18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19}, 1));
//        System.out.println(Arrays.toString(new Solution().solve(new int[]{}, 1)));
    }


    public int solve(int[] A, int k) {
        //Sliding window solution
        int n = A.length;

        int sum = sumOfNElements(A, 0, k-1);
        int minAvg = sum/k;
        int checkMin = 0;
        int firstIndex = 0;
        //Step1: calculate sum of subarray
        for(int i =1; i < n-k;i++){
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
