package me.learn.scaler.intermediate.math;

import java.math.BigInteger;

public class MaxPower {
    public static void main(String[] args) {
        MaxPower sol = new MaxPower();
        sol.solve();

    }

    private void solve() {
        BigInteger bigInteger = new BigInteger("7");
        System.out.println(bigInteger.pow(996).mod(new BigInteger("1000")));
    }
}
