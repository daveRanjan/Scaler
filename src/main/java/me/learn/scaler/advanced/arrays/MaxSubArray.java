package me.learn.scaler.advanced.arrays;

import utils.ToStringUtils;

public class MaxSubArray {

    public static void main(String[] args) {
        MaxSubArray msa = new MaxSubArray();
        ToStringUtils.toString(msa.maxSubArray(new int[]{-500}));
    }

    private int maxSubArray(int[] A) {
        int sum = 0;
        int ans = A[0];

        for(int i =0; i < A.length; i++){
            // System.out.print("-->"+ans+"|"+sum);

            sum += A[i];
            ans = Math.max(ans, sum);

            if(sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }
}
