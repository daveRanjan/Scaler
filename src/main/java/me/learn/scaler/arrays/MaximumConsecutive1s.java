package me.learn.scaler.arrays;

import java.util.Arrays;

public class MaximumConsecutive1s {

    public static void main(String[] args) {
        MaximumConsecutive1s m = new MaximumConsecutive1s();
        System.out.println(m.solve("010100110101"));
    }

    private int solve(String A) {
        char[] arr = A.toCharArray();
        Arrays.sort(arr);
        int count = 0;
        for (char c : arr) {
            if(c == '1'){
                count++;
            }
        }
        return count;
    }
}
