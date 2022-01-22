package me.learn.scaler.intermediate.math;

import utils.ToStringUtils;

public class DivisibleBy8 {
    public static void main(String[] args) {
        DivisibleBy8 d = new DivisibleBy8();
        ToStringUtils.toString(d.solve("9216"));
    }

    public int solve(String A){
        String str = A.length() > 3 ? A.substring(A.length()-3): A;
        return Integer.valueOf(str) % 8;
    }
}
