package me.learn.scaler.arrays;

public class XorQueries {
    public static void main(String[] args) {
        XorQueries sol = new XorQueries();
        int[][] result = sol.solve(new int[]{}, new int[][]{});
    }

    private int[][] solve(int[] A, int[][] B) {
        int[][] result = new int[B.length][];
        for (int i = 0; i < B.length; i++) {
            int xor = -1;
            int zero = 0;
            for (int j = B[i][0]; j <= B[i][1]; j++) {
                if(xor == -1){
                    xor = A[j];
                }else {
                    xor^=A[j];
                }

                if(A[j] == 0){
                    zero++;
                }
            }

            result[i]=new int[]{xor, zero};
        }

        return result;

    }
}
