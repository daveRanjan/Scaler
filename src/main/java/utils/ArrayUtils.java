package utils;

public class ArrayUtils {
    public static int[] prefixSum(int[] A){
        for (int i = 1; i < A.length; i++) {
            A[i]=A[i-1]+A[i];
        }
        return A;
    }

    public static int sumOfAllElements(int[] A, int i,int j){
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum+=A[k];
        }
        return sum;
    }
}
