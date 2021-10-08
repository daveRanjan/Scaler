package me.learn.scaler.arrays;

import utils.ToStringUtils;

public class MatchOddEvenSum {
    public static void main(String[] args) {
        MatchOddEvenSum pp1 = new MatchOddEvenSum();
        int sol = pp1.solve(new int[]{1, 2, 3, 7, 1, 2, 3});
        System.out.println(sol);
    }

    public int solve(int[] A) {
        int N = A.length;
        int[] evenSumAr = new int[N];
        int[] oddSumAr = new int[N];
        int evenSum = 0;
        int oddSum =0;
        for (int i = 0; i < N; i++) {
            if(i%2==0){
                evenSum+=A[i];
            }else {
                oddSum+=A[i];
            }

            evenSumAr[i]=evenSum;
            oddSumAr[i]=oddSum;
        }

        ToStringUtils.toString(evenSumAr);
        ToStringUtils.toString(oddSumAr);
        int count =0;
        for (int i = 0; i < N; i++) {

            int sumOfOddBefore = oddSumAr[i];
            int sumOfEvenBefore = evenSumAr[i];
            int oddSumAfter = oddSumAr[N-1]-oddSumAr[i];
            int evenSumAfter = evenSumAr[N-1]-evenSumAr[i];

            if(i%2==0){
                sumOfEvenBefore=evenSumAr[i]-A[i];
                evenSumAfter= evenSumAfter -A[i];
            }else {
                sumOfOddBefore=oddSumAr[i]-A[i];
                oddSumAfter = oddSumAfter -A[i];
            }
            System.out.println("For i = "+i);
            System.out.println("sumOfOddBefore "+sumOfOddBefore+", evenSumAfter: "+evenSumAfter+"; total : "+(sumOfOddBefore+evenSumAfter));
            System.out.println("sumOfEvenBefore "+sumOfEvenBefore+", oddSumAfter: "+oddSumAfter+"; total : "+(sumOfEvenBefore+oddSumAfter));

            System.out.println();

        }

        return count;
    }
}
