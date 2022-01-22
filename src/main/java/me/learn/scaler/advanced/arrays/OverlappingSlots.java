package me.learn.scaler.advanced.arrays;

import utils.ToStringUtils;

import java.util.ArrayList;

public class OverlappingSlots {
    public static void main(String[] args) {
        OverlappingSlots os = new OverlappingSlots();

    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        //Check if interval can be inserted before the first interval;
        if(!isOverlapping(intervals.get(0), newInterval)){
            intervals.add(0, newInterval);
        }

        return null;
    }

    public boolean isOverlapping(Interval A, Interval B){
        if(B.end < A.start || B.start > A.end){
            return false;
        }else return true;
    }
}

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
