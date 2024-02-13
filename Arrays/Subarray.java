package Arrays;

public class Subarray {
    public static void main(String[] args) {
        int a[] = {1, 4, 0, 0, 3, 10, 5};
        int n = a.length;
        int sum = 7;

        for (int i = 0; i < n; i++) {
            int curr = a[i];  // 1,5
            for (int j = i + 1; j < n; j++) {
                curr = curr + a[j]; // 5,
                if (curr == sum) {  // 5==7
                    System.out.print(i + " " + j);
                }
            }

        }
    }
}

