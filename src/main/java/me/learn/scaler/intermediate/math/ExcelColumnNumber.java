package me.learn.scaler.intermediate.math;

import utils.ToStringUtils;

public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int sum = 0;
        int N = A.length();
        for (int i = 0; i < N; i++) {
            sum+= ((A.charAt(i)%64) * (Math.pow(26, N-i-1)));
        }

        return sum;
    }

    public static void main(String[] args) {
        ExcelColumnNumber ex = new ExcelColumnNumber();
        ToStringUtils.toString(ex.titleToNumber("ZZZZZ"));
    }

}
