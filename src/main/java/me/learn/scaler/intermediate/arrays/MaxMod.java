package me.learn.scaler.intermediate.arrays;

import utils.ToStringUtils;

import java.util.*;

public class MaxMod {
    public static void main(String[] args) {
        MaxMod maxMod = new MaxMod();
        ToStringUtils.toString(maxMod.solve(new int[]{}));
    }

    private int solve(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list.get(list.size()-2) % list.get(list.size()-1);
    }
}
