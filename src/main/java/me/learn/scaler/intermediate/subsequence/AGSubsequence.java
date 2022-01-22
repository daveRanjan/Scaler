package me.learn.scaler.intermediate.subsequence;

import utils.ToStringUtils;

public class AGSubsequence {
    public static void main(String[] args) {
        AGSubsequence agSubsequence = new AGSubsequence();
        ToStringUtils.toString(agSubsequence.solve("GAB"));
    }

    public int solve(String A) {
        char[] chars = A.toCharArray();
        long sum = 0;
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'A'){
                count++;
            }else if(chars[i] == 'G'){
                sum+=count;
            }
        }

        return (int) Math.floorMod(sum,1000000007);
    }
}
