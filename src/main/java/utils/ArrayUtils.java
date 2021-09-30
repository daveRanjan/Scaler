package utils;

public class ArrayUtils {
    public static int[] prefixSum(int[] A){
        for (int i = 1; i < A.length; i++) {
            A[i]=A[i-1]+A[i];
        }
        return A;
    }
}
