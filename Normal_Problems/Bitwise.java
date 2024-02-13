package Normal_Problems;
import java.util.*;
public class Bitwise {
    public static int findRightmostDifferentBit(int M, int N) {
        int a = M ^ N;
        int position = 1;

        while (a > 0) {
            if ((a & 1) == 1) {
                return position;
            }
            a >>= 1;
            position++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int M = 52;
        int N = 4;

        int result = findRightmostDifferentBit(M, N);
        System.out.println(result);
    }
}
