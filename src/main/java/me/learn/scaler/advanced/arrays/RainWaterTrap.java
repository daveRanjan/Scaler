package me.learn.scaler.advanced.arrays;

import utils.ToStringUtils;

public class RainWaterTrap {
    public static void main(String[] args) {

        RainWaterTrap rainWaterTrap = new RainWaterTrap();
        ToStringUtils.toString(rainWaterTrap.trap(new int[]{0, 1, 0, 2}));
        ToStringUtils.toString(rainWaterTrap.trap(new int[]{1,2}));
    }

    public int trap(final int[] A) {
        int N = A.length;

        if (N < 3) return 0;

        // find largest on left side
        int[] left = new int[N];
        int max = -1;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            left[i] = max;
        }
        //find largest on right side
        int[] right = new int[N];
        max = -1;

        for (int i = N - 1; i >= 0; i--) {
            if (A[i] > max) {
                max = A[i];
            }
            right[i] = max;
        }

        //calculate water harvested on each building
        int waterCollected = 0;
        for (int i = 0; i < N; i++) {
            int min = Math.min(left[i], right[i]);
            if (min - A[i] > 0) {
                waterCollected += min - A[i];
            }
        }

        return waterCollected;

    }
}
