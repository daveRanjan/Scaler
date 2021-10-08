package me.learn.scaler.matrix;

import utils.ToStringUtils;

/**
 * Row with maximum number of ones
 * Problem Description
 *
 * Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.
 *
 * NOTE:
 *
 * If two rows have the maximum number of 1 then return the row which has a lower index.
 * Rows are numbered from top to bottom and columns are numbered from left to right.
 * Assume 0-based indexing.
 * Assume each row to be sorted by values.
 * Expected time complexity is O(rows).
 *
 *
 * Problem Constraints
 * 1 <= N <= 1000
 *
 * 0 <= A[i] <= 1
 *
 *
 *
 * Input Format
 * The only argument given is the integer matrix A.
 *
 *
 *
 * Output Format
 * Return the row with the maximum number of 1.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [   [0, 1, 1]
 *          [0, 0, 1]
 *          [0, 1, 1]   ]
 * Input 2:
 *
 *  A = [   [0, 0, 0, 0]
 *          [0, 1, 1, 1]    ]
 *
 *
 * Example Output
 * Output 1:
 *
 *  0
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Row 0 has maximum number of 1s.
 * Explanation 2:
 *
 *  Row 1 has maximum number of 1s.
 */
public class CountMax1sInMatrix {
    public static void main(String[] args) {
        CountMax1sInMatrix sm = new CountMax1sInMatrix();
        ToStringUtils.toString(sm.solve(
                new int[][]{{1}}));
    }

    public int solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int index = -1;
        int i=0;
        int j = M-1;

        while (i<=N-1 && j>=0){
            if(A[i][j] == 1){
                j--;
                index = i;
            }else {
                i++;
            }
        }


        return index;
    }
}
