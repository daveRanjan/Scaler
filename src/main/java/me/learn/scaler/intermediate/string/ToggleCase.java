package me.learn.scaler.intermediate.string;

import utils.ToStringUtils;

public class ToggleCase {
    public static void main(String[] args) {
        ToggleCase tg = new ToggleCase();
        ToStringUtils.toString(tg.to_upper(new char[]{'a', 'A', 'c'}));
    }

    private char[] to_upper(char[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 90) {
                A[i] ^= 32;
            }
        }
        return new char[0];
    }
}
