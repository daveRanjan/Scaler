package me.learn.scaler.intermediate.math;

import utils.ToStringUtils;

public class OverlappingRectangles {

    public static void main(String[] args) {
        OverlappingRectangles or = new OverlappingRectangles();
//        ToStringUtils.toString(or.solve(0,0,4,4,2,2,6,6));
//        ToStringUtils.toString(or.solve(3,1,10,5,1,4,9,8));
//        ToStringUtils.toString(or.solve(12,47,39,72,8,3,47,55));
        ToStringUtils.toString(or.solve(-1,-1,0,0,-1,-1,0,0));
    }

    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
            if(A==E && B == F && C==G && D==H){
                return 1;
            }

            if(A>=G || E>=C){
                return 0;
            }

            if(B>=H ||F>=D){
                return 0;
            }
            return 1;
        }
}
