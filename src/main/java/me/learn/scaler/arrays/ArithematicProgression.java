package me.learn.scaler.arrays;

/**
 * Arithmetic Progression?
 * Problem Description
 *
 * Given an integer array A of size N. Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0.
 *
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 *
 *
 *
 * Problem Constraints
 * 2 <= N <= 105
 *
 * -109 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * First and only argument is an integer array A of size N.
 *
 *
 *
 * Output Format
 * Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [3, 5, 1]
 * Input 2:
 *
 *  A = [2, 4, 1]
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
 * Explanation 2:
 *
 *  There is no way to reorder the elements to obtain an arithmetic progression.
 */
public class ArithematicProgression {
    public static void main(String[] args) {
        int sol = new ArithematicProgression().solve(new int[]{2, 4, 1});
        System.out.println(sol);
    }

    private int solve(int[] A) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = A.length;
        for (int i = 0; i < A.length; i++) {
            if(min > A[i]) min = A[i];
            if(max < A[i]) max = A[i];
        }

        //Calculate d assuming this is a AP
        double d = (double) (max-min)/(n-1);
        // d cannot be decimal if all elements of AP are integers
        return d % 1 == 0 ? 1 : 0;
    }
}
