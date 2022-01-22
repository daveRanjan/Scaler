package me.learn.scaler.intermediate.recursion;

import utils.ToStringUtils;

public class Palindrone {
    public static void main(String[] args) {
        Palindrone palindrone = new Palindrone();
        ToStringUtils.toString(palindrone.solve("naman"));
    }

    private int solve(String A) {
        return isPalin(A, 0, A.length() - 1) ? 1 : 0;
    }

    public boolean isPalin(String A, int s, int e) {
        if (s > e) {
            return true;
        }

        return (A.charAt(s) == A.charAt(e)) && isPalin(A, ++s, --e);
    }
}
