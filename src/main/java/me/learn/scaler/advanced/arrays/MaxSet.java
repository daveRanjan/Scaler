package me.learn.scaler.advanced.arrays;

import org.checkerframework.checker.units.qual.A;
import utils.ToStringUtils;

import java.util.ArrayList;

public class MaxSet {
    public static void main(String[] args) {
        MaxSet maxSet = new MaxSet();
        ToStringUtils.toString(maxSet.maxset(new int[]{10, -1, 2, 3, -4, 100}));
    }
    public int[] maxset(int[] A) {
        int N = A.length;
        long maxSum = -1;
        ArrayList<Integer> localResult = new ArrayList();
        ArrayList<Integer> result = new ArrayList();
        for(int i =0; i< N; i++){
            if(A[i] > 0){
                localResult.add(A[i]);
            }else {
                long localSum = localResult.stream().mapToInt(Integer::valueOf).sum();
                if(localSum>maxSum){
                    result = new ArrayList<>(localResult);
                    maxSum = result.stream().mapToInt(Integer::valueOf).sum();
                }
                localResult.clear();
            }
        }

        long localSum = localResult.stream().mapToInt(Integer::valueOf).sum();
        if(localSum>maxSum){
            result = new ArrayList<>(localResult);
            maxSum = result.stream().mapToInt(Integer::valueOf).sum();
            localResult.clear();
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
