package me.learn.scaler.advanced.arrays;

import utils.ToStringUtils;

public class PickMax {

    public static void main(String[] args) {
        PickMax pm = new PickMax();
        ToStringUtils.toString(pm.solve(new int[]{5, -2, 3 , 1, 2}, 3));
        ToStringUtils.toString(pm.solve(new int[]{1, 2}, 1));
    }

    private int solve(int[] A, int B) {
        int sum = 0;
        int N = A.length;
        for (int i = 0; i < B; i++) {
            sum+=A[i];
        }

        int ans = sum;

        for (int i = 1; i <= B; i++) {
                sum = sum - A[B-i] + A[N-i];
                ans = Math.max(ans, sum);
        }


        return ans;
    }
}
