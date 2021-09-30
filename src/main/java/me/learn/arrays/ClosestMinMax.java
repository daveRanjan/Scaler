package me.learn.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Closest MinMax
 * Problem Description
 *
 * Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum value of the array
 *
 * and atleast one occurrence of the minimum value of the array.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 2000
 *
 *
 *
 * Input Format
 * First and only argument is vector A
 *
 *
 *
 * Output Format
 * Return the length of the smallest subarray which has atleast one occurrence of minimum and maximum element of the array
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 3]
 * Input 2:
 *
 * A = [2]
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Only choice is to take both elements.
 * Explanation 2:
 *
 *  Take the whole array.
 */
public class ClosestMinMax {

    public static void main(String[] args) {
        int sol = new ClosestMinMax().solve(new int[]{2});
        System.out.println(sol);
    }

    public int solve(int[] A){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > max){
                max = A[i];
                maxIndex = i;
            }

           if(A[i] < min){
                min = A[i];
                minIndex = i;
            }
        }
        int d = Math.abs(maxIndex-minIndex);
        for (int i = 0; i < A.length; i++) {
            if(A[i] == max){
                d = d > Math.abs(i-minIndex) ?  Math.abs(i-minIndex): d;
            }

            if(A[i] == min){
                d = d > Math.abs(maxIndex-i) ?  Math.abs(maxIndex-i) :d;
            }
        }

        return d+1;

    }
}
