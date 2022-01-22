package me.learn.scaler.intermediate.hashing;

import utils.ToStringUtils;

import java.util.HashSet;

public class Soduku {

    public static void main(String[] args) {
        Soduku soduku = new Soduku();
        ToStringUtils.toString(soduku.printSoduku(new String[]{"....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......"}));
//        ToStringUtils.toString(soduku.isValidSudoku(new String[]{"....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......"}));
    }

    public char[][] printSoduku(String[] A){
        char[][] result = new char[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                result[i][j]=A[i].charAt(j);
            }
        }

        return result;
    }

    public int isValidSudoku(final String[] A) {
        HashSet<Character> set = new HashSet();
        for(int k =0; k<9; k++){
            set = new HashSet();
            for(int i=0; i < 9; i++){
                if(A[k].charAt(i) == '.') continue;

                if(set.contains(A[k].charAt(i))){
                    return 0;
                }else set.add(A[k].charAt(i));
            }
        }

        set = new HashSet();

        for(int j=0; j<9;j++){
            set = new HashSet();
            for(int k=0; k<9; k++){
                if(A[k].charAt(j) == '.') continue;
                if(set.contains(A[k].charAt(j))){
                    return 0;
                }else set.add(A[k].charAt(j));
            }
        }

        //Check for the box
        int[] is = new int[]{0,3,6};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int b_r = is[i];
                int b_c = is[j];
                set = new HashSet<>();
                for (int x = b_r; x<b_r+3; x++){
                    for (int y = b_c; y < b_c + 3; y++) {
                        if(A[x].charAt(y) == '.') continue;
                        if(set.contains(A[x].charAt(y))){
                            return 0;
                        }else set.add(A[x].charAt(y));
                    }
                }
            }
        }


        return 1;
    }
}
