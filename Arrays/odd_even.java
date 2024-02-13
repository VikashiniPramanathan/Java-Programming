package Arrays;

public class odd_even {
    public static void main(String args[]) {
        int a[] = {1, 2, 4, 3, 5, 7, 8, 6};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even++;

            } else {
                odd++;

            }
        }
        System.out.println("even count: "+even);
        System.out.println("odd count: "+odd);
    }
}
