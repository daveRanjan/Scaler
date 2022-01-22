package me.learn.scaler.compitation;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HolidayTogether {

    public static void main(String[] args) {
        HolidayTogether ht = new HolidayTogether();
        int result = ht.solution(new int[]{4,4,2,4}, new int[]{5,5,2,5});
        int result2 = ht.solution(new int[]{1,4,1}, new int[]{1,5,1});
        System.out.println(result);
        System.out.println(result2);
    }

    private int solution(int[] P, int[] S) {
        // Calculate sum of all the people
        int sum = Arrays.stream(P).sum();

        // Had to convert the int[] to Integer[] for quick sort
        // Calculate prefix sum of all the seats needed
        Integer[] seats = Arrays.stream( S ).boxed().toArray( Integer[]::new );
        Arrays.sort(seats, Collections.reverseOrder());
        Arrays.parallelPrefix(seats, Integer::sum);

        // Check from back if the whatever number of cars are sufficient
        for (int i = seats.length-1; i >=0; i--) {
            if(sum > seats[i]){
                return i+2;
            }
        }
        return S.length;
    }
}
