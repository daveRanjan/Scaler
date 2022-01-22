package me.learn.scaler.intermediate.subsequence;

import utils.ToStringUtils;

public class OddEven {
    public static void main(String[] args) {
        OddEven sol = new OddEven();
        ToStringUtils.toString(sol.solve(new int[]{2,2,2,2,2}));
    }
    public int solve(int[] A) {
        int N = A.length;
        int next= 1-(A[0]%2);
        int len = 1;

        if(N == 1) return len;

        for(int i =1; i < N; i++){
            if(A[i]%2 == next){
                len++;
                next=1-(A[i]%2);
            }
        }

        return len;
    }
}
