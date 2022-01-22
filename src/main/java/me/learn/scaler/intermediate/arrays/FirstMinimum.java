package me.learn.scaler.intermediate.arrays;

import com.google.common.base.Stopwatch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class FirstMinimum {
    public static void main(String[] args) {
        FirstMinimum fm = new FirstMinimum();
        Stopwatch stopwatch;
        stopwatch = Stopwatch.createStarted();
        fm.solution(new int[]{1, 3, 6, 4, 1, 2});
        stopwatch.stop();
        System.out.println("Basic Method time taken : "+stopwatch.elapsed(TimeUnit.NANOSECONDS));
        stopwatch = Stopwatch.createStarted();
        fm.solution1(new int[]{1, 3, 6, 4, 1, 2});
        stopwatch.stop();
        System.out.println("Advanced Method time taken : "+stopwatch.elapsed(TimeUnit.NANOSECONDS));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int i = 0;
        int num = 1;
        while(i < A.length){
            if(A[i] < num){
                i++;
            }else if (A[i] == num){
                num++;
                i++;
            }else {
                return num;
            }
        }

        return num > A[i-1] ? num : A[i-1] + 1;
    }


    public int solution1(int[] A){
        HashSet<Integer> hs = new HashSet<>();
        int i = 0;
        while (i < A.length){
            hs.add(A[i]);
            i++;
        }

        int result = 1;
        while (true){
            if(hs.contains(result)){
                result++;
            }else return result;
        }
    }
}
