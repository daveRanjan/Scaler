package me.learn.scaler.intermediate.math;

import utils.ToStringUtils;

public class LCM {
    public int findLCM(int A, int B){
        int max = Math.max(A, B);
        int min = Math.min(A,B);
        int i = 1;
        while (max%min !=0){
            i++;
            max = max *i;
        }

        return max;
    }

    public static void main(String[] args) {
        LCM l = new LCM();
        ToStringUtils.toString(l.findLCM(18,36));
    }

}
