package me.learn.scaler.intermediate.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        System.out.println(new FirstRepeatingElement().solve(new int[]{10, 5, 3, 4, 3, 5, 6}));
    }


    public int solve(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) +1);
        }

        for (int i = 0; i < A.length; i++) {
            if(map.get(A[i]) > 1){
                return A[i];
            }
        }

        return -1;
    }
}
