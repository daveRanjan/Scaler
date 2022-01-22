package me.learn.scaler.advanced.maths;

import utils.ToStringUtils;

public class PrimeSum {
    public static void main(String[] args) {

        PrimeSum ps = new PrimeSum();
        ToStringUtils.toString(ps.primeSum(7));
    }

    public int[] primeSum(int A) {
        int[] s = createSeieveArray(A);

        for (int i = 2; i < s.length; i++) {
            if(s[A-s[i]] !=0){
                return new int[]{s[i], s[A-s[i]]};
            }
        }


        return new int[0];
    }

    public int[] createSeieveArray(int A){
        int[] s = new int[A];

        for (int i = 0; i < A; i++) {
            s[i]=i;
        }

        for (int i = 2; i * i < A; i++) {
            // set all integers to number itself for above numbers
            for (int j = i; j * i < A; j++) {
                s[j*i] = 0;
            }
        }

        return s;
    }

}
