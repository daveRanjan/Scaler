package me.learn.scaler.arrays;

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
        int sol = new ClosestMinMax().solve(new int[]{1, 3});
        System.out.println(sol);
    }

    public int solve(int[] A){
        int N = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = 2*N;
        int maxIndex = 2*N;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }

        if(max == min) return 1;

        int ans = N;
        for (int i = N-1; i >= 0; i--) {
            if(A[i] == max){
                ans = Math.min(ans, (minIndex-i+1));
                maxIndex=i;
            }else if(A[i] == min){
                ans = Math.min(ans, maxIndex -i+1);
                minIndex=i;
            }
        }

        return ans;

    }
}
