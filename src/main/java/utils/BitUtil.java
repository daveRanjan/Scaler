package utils;

public class BitUtil {
    public static int checkBitCount(int A){
        int c =0;
        while(A !=0){
            A = A & (A-1);
            c++;
        }

        return c;
    }

    public static boolean checkBit(long N, int pos){
        return (N >> pos & 1) != 0;
    }

    public static int setBit(int N, int pos){
        return N | (1 << pos);
    }
}
