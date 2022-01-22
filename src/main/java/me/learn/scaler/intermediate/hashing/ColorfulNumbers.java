package me.learn.scaler.intermediate.hashing;

import utils.ToStringUtils;

import java.util.HashSet;

public class ColorfulNumbers {

    public static void main(String[] args) {
        ColorfulNumbers colorfulNumbers = new ColorfulNumbers();
        ToStringUtils.toString(colorfulNumbers.colorful(23));
    }

    public int colorful(int num) {
        String A = String.valueOf(num);
        int N = A.length();
        HashSet<Long> hs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            long product = 1;
            for (int j = i; j < N; j++) {
                product = product * Character.getNumericValue(A.charAt(j));

                if(hs.contains(product)){
                    return 0;
                }else hs.add(product);
            }
        }

        return 1;
    }
}
