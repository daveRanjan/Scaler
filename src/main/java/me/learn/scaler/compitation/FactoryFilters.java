package me.learn.scaler.compitation;

import java.util.Arrays;
import java.util.Collections;

public class FactoryFilters {

    public static void main(String[] args) {
        FactoryFilters ff = new FactoryFilters();
        int result = ff.solution(new int[]{5,19,8,1});
        int result1 = ff.solution(new int[]{10,10});
        int result2 = ff.solution(new int[]{3,0,5});
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

    private int solution(int[] A) {
        //Calculate total pollution sum
        int sum = Arrays.stream(A).sum();
        Double desired = new Double(sum)/2;
        Double actual = new Double(sum);
        // Sort the factories in descending order to double as values come in fraction
        Double[] factories = Arrays.stream( A ).asDoubleStream().boxed().toArray(Double[]::new);
        Arrays.sort(factories, Collections.reverseOrder());

        //19,8,5,1
        int filters = 0;
        while (actual > desired){
            // Get max populating factory
            Double mostPopulatingFactory = Arrays.stream(factories).max(Double::compareTo).get();
            int indexOfMax = Arrays.asList(factories).indexOf(mostPopulatingFactory);
            filters++;
            Double reduced = mostPopulatingFactory/2;
            actual -=reduced;
            factories[indexOfMax]=reduced;
        }


        return filters;
    }
}
