package me.learn.scaler.intermediate.recursion;

import utils.ToStringUtils;

public class KthSymbol {
    public static void main(String[] args) {
        KthSymbol symbol = new KthSymbol();
        ToStringUtils.toString(symbol.solve(2, 2));
    }
    public int solve(int A, int B) {
        String rowResult = row(--A,"0");
        return Character.getNumericValue(rowResult.charAt(--B));
    }

    String row(int A, String prev){
        return "";
    }
}
