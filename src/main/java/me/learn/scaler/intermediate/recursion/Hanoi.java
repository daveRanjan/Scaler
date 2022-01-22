package me.learn.scaler.intermediate.recursion;

import utils.ToStringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Hanoi {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        ArrayList<ArrayList<Integer>> result = hanoi.towerOfHanoi(2);
        ToStringUtils.toString(result);
    }

    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        hanoi(result, A, 1, 2, 3);
        return result;
    }

    public void hanoi(ArrayList<ArrayList<Integer>> result, int N, int A, int B, int C){
        if(N == 0) return;
        hanoi(result, N-1, A,C,B);
        ArrayList<Integer> rs = new ArrayList(Arrays.asList(N, A, C));
        result.add(rs);
        hanoi(result, N-1, B,A,C);
    }

}
