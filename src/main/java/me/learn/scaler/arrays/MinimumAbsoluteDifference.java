package me.learn.scaler.arrays;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        MinimumAbsoluteDifference pp1 = new MinimumAbsoluteDifference();
        int sol = pp1.solve(new int[]{5, 17, 100, 11});
        System.out.println(sol);
    }

    private int solve(int[] A) {
        if(A.length == 1) return A[0];
        int min = Integer.MAX_VALUE;
        int N = A.length;
        for (int i = 1; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                min = Math.min(min, Math.abs(A[i]-A[j]));
            }
        }

        return min;
    }

    //| b-a|
}
