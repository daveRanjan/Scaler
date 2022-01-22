package me.learn.scaler.intermediate.math;

import utils.ToStringUtils;

public class NthMagicalNumber {
    public static void main(String[] args) {
        NthMagicalNumber n = new NthMagicalNumber();
        ToStringUtils.toString(n.solve(3));
    }
    public long solve(int A) {
        char[] arr = Integer.toBinaryString(A).toCharArray();
        System.out.print(arr);

        int N = arr.length;
        long sum = 0;
        for(int i = 0; i < N; i++){
            // System.out.print(arr[i]);
            if(arr[i] == '1'){
                sum += Math.pow(5, N-i);
            }
        }
        return sum;
    }
}
