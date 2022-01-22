package me.learn.scaler.intermediate.hashing;

import java.util.HashSet;

public class SubArrayWithSumZero {
    public static void main(String[] args) {
        System.out.println(new SubArrayWithSumZero().solve(new int[]{-1,1}));
    }


    public int solve(int[] A) {
        int[] pf = new int[A.length];
        pf[0]=A[0];

        for (int i = 1; i < A.length; i++) {
            pf[i]=pf[i-1]+A[i];
        }
        HashSet<Integer> hs = new HashSet<>();
        // Check if array contains duplicate elements?
        for (int i = 0; i < pf.length; i++) {
            if(pf[i] == 0){
                return 1;
            }else {
                hs.add(pf[i]);
            }
        }


        return hs.size() == pf.length ? 0 : 1;
    }
}
