package me.learn.scaler.intermediate.sort;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber {    public static void main(String[] args) {
    System.out.println(new LargestNumber().largestNumber(Lists.newArrayList(472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412)));
}


    public String largestNumber(final List<Integer> A) {
        A.sort(new ReverseIntegerComparator());
        A.stream().map(String::valueOf).collect(Collectors.joining());
        //remove leading zeros
        String result = A.stream().map(String::valueOf).collect(Collectors.joining()).replaceFirst("^0*", "");

        return  result.equals("")? "0": result;
    }

    class ReverseIntegerComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            long xy = Long.valueOf(o1+""+o2);
            long yx = Long.valueOf(o2+""+o1);

            if(xy > yx){
                return -1;
            }else return 1;
        }
    }
}
