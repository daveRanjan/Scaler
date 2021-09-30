package utils;

import java.util.Arrays;

public class ArrayUtils {
    public static int[] prefixSum(int[] A){
        for (int i = 1; i < A.length; i++) {
            A[i]=A[i-1]+A[i];
        }
        return A;
    }

    public static void toString(int[][] sol) {
        System.out.println("[");
        for (int i = 0; i < sol.length; i++) {
            System.out.println(Arrays.toString(sol[i]));
        }
        System.out.println("]");
    }
}
