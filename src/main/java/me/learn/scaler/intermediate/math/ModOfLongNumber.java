package me.learn.scaler.intermediate.math;

import utils.ToStringUtils;

public class ModOfLongNumber {

    // Carry Forward Solution
    // TC:O(n)
    public int findMod(String A, int B){
        int sum = 0; int pow =1;
        int N = A.length();
        for (int i = N-1; i >=0; i--) {
            sum+=(Character.getNumericValue(A.charAt(i)) * pow)% B;
            pow=(pow*(10%B))%B;
        }

        return sum%B;
    }


    //Basic Solution
    // TC:O(n2)
    public int findMod1(String A, int B){
        int sum = 0;
        int N = A.length();
        for (int i = 0; i < N; i++) {
            sum+=(Character.getNumericValue(A.charAt(i)) * powerMod(10, N-i-1, B))% B;
        }

        return sum%B;
    }

    public int powerMod(int N, int pow, int p){
        int ans = 1;
        while (pow > 0){
            ans = (ans * N)%p;
            pow--;
        }
        return ans;
    }

    public static void main(String[] args) {
        ModOfLongNumber m = new ModOfLongNumber();
        ToStringUtils.toString(m.findMod("43535321",47));
    }


}
