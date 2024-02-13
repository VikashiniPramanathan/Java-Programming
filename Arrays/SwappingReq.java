package Arrays;

public class SwappingReq {
    public static int countSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
                swaps++;
            }
        }

        return swaps;
    }
    public static void main(String args[]){
        int arr[]={4,5,3,2,1};
    //    int arr[]={4,5,1,2,3};
        System.out.println(countSwaps(arr));
    }
}
