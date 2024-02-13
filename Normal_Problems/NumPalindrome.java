package Normal_Problems;

public class NumPalindrome {
    public static void main(String args[]) {

        int n = 23432;
        int temp = n;
        int res = 0;
        while (n != 0) {
            int b = n % 10;
            res = res * 10 + b;
            n = n / 10;
        }
        if (res == temp) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
